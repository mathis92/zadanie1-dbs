/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.mathis.stuba.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import sk.mathis.stuba.equip.DataHelpers;
import sk.mathis.stuba.equip.Diagnosis;
import sk.mathis.stuba.equip.TestTypes;
import sk.mathis.stuba.mobiledeviceservice.Mds_testDevicePanel;

public class Mds_testDeviceDataCollector {

    private Mds_testDevicePanel testPanel;

    public Mds_testDeviceDataCollector(Mds_testDevicePanel testPanel) {
        this.testPanel = testPanel;
        fillDevicesToTestTable();
    }

    public void fillDiagnosisTable() {
        ArrayList<Diagnosis> diagList = new ArrayList<Diagnosis>();
        System.out.println("uz som vo funkcii");
        ResultSet rs = DataHelpers.selectFrom("SELECT mds_device.id_device,mds_test.found_fault,mds_test.`type`,mds_testing.id_head_diagnostician\n"
                + "	FROM mds_device\n"
                + "	JOIN mds_testing\n"
                + "		ON mds_testing.id_device = mds_device.id_device\n"
                + "	JOIN mds_test\n"
                + "		ON mds_test.id_testing = mds_testing.id_testing");
        try {
            while (rs.next()) {
                for (Diagnosis temp : diagList) {
                    if (temp.getDeviceId().equals(rs.getInt(1))) {
                        temp.addDiagnosis(rs.getString(3) + " -> "+ rs.getString(2));
                    } else {
                        Diagnosis diag = new Diagnosis(rs.getInt(1), rs.getString(3) + " -> "+ rs.getString(2), rs.getInt(4));
                        diagList.add(diag);
                    }
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_testDeviceDataCollector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        for(Diagnosis diag : diagList){
            System.out.println(diag.getDeviceId() +" -> "+ diag.getSpecification() +" -> "+ diag.getDiagnosticianId());
        }
    }

    public void fillTests(ArrayList<TestTypes> testTypes, ArrayList<JFormattedTextField> faultfields, Integer id_testing) {
        for (int i = 0; i < testTypes.size(); i++) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(testTypes.get(i).toString());
            list.add(id_testing.toString());
            list.add(faultfields.get(i).getText());
            DataHelpers.insertFromArray(list, "mds_test", DataHelpers.mds_test);
        }
    }

    public void fillSelectedDeviceTable(Integer selectedRow) {
        Object[] data = new Object[5];
        DefaultTableModel selectedDevice;

        selectedDevice = (DefaultTableModel) testPanel.getSelectedDeviceTable().getModel();
        ResultSet rs = DataHelpers.selectFrom("SELECT id_device,imei,vendor,model,fault_description FROM (SELECT mds_device.id_device,mds_device.imei,mds_device_vendor.vendor,mds_device_model.model,mds_service_order.fault_description,mds_device.tested\n"
                + "	FROM mds_service_order\n"
                + "	JOIN mds_device\n"
                + "		ON mds_service_order.id_device = mds_device.id_device\n"
                + "	JOIN mds_device_model\n"
                + "		ON mds_device.id_device_model = mds_device_model.id_device_model\n"
                + "	JOIN mds_device_vendor\n"
                + "		ON mds_device_model.id_device_vendor = mds_device_vendor.id_device_vendor) AS `table1`\n"
                + "WHERE table1.tested = 0;");
        try {
            int j = 0;
            while (rs.next()) {
                if (selectedRow.equals(j)) {
                    selectedDevice.setRowCount(0);
                    for (int i = 0; i < 5; i++) {

                        data[i] = rs.getString(i + 1);
                    }
                    selectedDevice.addRow(data);
                    testPanel.getSelectedDeviceTable().setModel(selectedDevice);
                }
                j++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_findSpecificDeviceDataCollector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fillDevicesToTestTable() {
        Object[] data = new Object[5];
        DefaultTableModel devicesToTestTable;

        devicesToTestTable = (DefaultTableModel) testPanel.getDevicesToTestTable().getModel();
        ResultSet rs = DataHelpers.selectFrom("SELECT id_device,imei,vendor,model,fault_description FROM (SELECT mds_device.id_device,mds_device.imei,mds_device_vendor.vendor,mds_device_model.model,mds_service_order.fault_description,mds_device.tested\n"
                + "	FROM mds_service_order\n"
                + "	JOIN mds_device\n"
                + "		ON mds_service_order.id_device = mds_device.id_device\n"
                + "	JOIN mds_device_model\n"
                + "		ON mds_device.id_device_model = mds_device_model.id_device_model\n"
                + "	JOIN mds_device_vendor\n"
                + "		ON mds_device_model.id_device_vendor = mds_device_vendor.id_device_vendor) AS `table1`\n"
                + "WHERE table1.tested = 0;");
        try {
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {

                    data[i] = rs.getString(i + 1);
                }
                devicesToTestTable.addRow(data);
                testPanel.getDevicesToTestTable().setModel(devicesToTestTable);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_findSpecificDeviceDataCollector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
