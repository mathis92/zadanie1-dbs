/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.mathis.stuba.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import sk.mathis.stuba.equip.DataHelpers;
import sk.mathis.stuba.mobiledeviceservice.Mds_repairDevicePanel;

public class Mds_repairDeviceDataCollector {

    private final Mds_repairDevicePanel repairPanel;

    public Mds_repairDeviceDataCollector(Mds_repairDevicePanel repairPanel) {
        this.repairPanel = repairPanel;
        fillDevicesToTestTable();
    }

    public final void fillDevicesToTestTable() {
        Object[] data = new Object[5];
        DefaultTableModel devicesToRepairTable;

        devicesToRepairTable = (DefaultTableModel) repairPanel.getDevicesToRepairTable().getModel();
        try {

            ResultSet rs = DataHelpers.selectFrom("SELECT id_device,imei,vendor,model,specification FROM (SELECT mds_device.id_device,mds_device.imei,mds_device_vendor.vendor,mds_device_model.model,mds_diagnosis.specification,mds_device.repaired\n"
                    + "	FROM mds_diagnosis\n"
                    + "	JOIN mds_device\n"
                    + "		ON mds_diagnosis.id_device = mds_device.id_device\n"
                    + "	JOIN mds_device_model\n"
                    + "		ON mds_device.id_device_model = mds_device_model.id_device_model\n"
                    + "	JOIN mds_device_vendor\n"
                    + "		ON mds_device_model.id_device_vendor = mds_device_vendor.id_device_vendor) AS `table1`\n"
                    + "WHERE table1.repaired = 0");
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {

                    data[i] = rs.getString(i + 1);
                }
                devicesToRepairTable.addRow(data);
                repairPanel.getDevicesToRepairTable().setModel(devicesToRepairTable);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_findSpecificDeviceDataCollector.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fillSelectedDeviceTable(Integer selectedRow) {
        Object[] data = new Object[5];
        DefaultTableModel selectedDevice;

        selectedDevice = (DefaultTableModel) repairPanel.getSelectedDeviceTable().getModel();
        try {
            ResultSet rs = DataHelpers.selectFrom("SELECT id_device,imei,vendor,model,specification FROM (SELECT mds_device.id_device,mds_device.imei,mds_device_vendor.vendor,mds_device_model.model,mds_diagnosis.specification,mds_device.repaired\n"
                    + "	FROM mds_diagnosis\n"
                    + "	JOIN mds_device\n"
                    + "		ON mds_diagnosis.id_device = mds_device.id_device\n"
                    + "	JOIN mds_device_model\n"
                    + "		ON mds_device.id_device_model = mds_device_model.id_device_model\n"
                    + "	JOIN mds_device_vendor\n"
                    + "		ON mds_device_model.id_device_vendor = mds_device_vendor.id_device_vendor) AS `table1`\n"
                    + "WHERE table1.repaired = 0;");
            int j = 0;
            while (rs.next()) {
                if (selectedRow.equals(j)) {
                    selectedDevice.setRowCount(0);
                    for (int i = 0; i < 5; i++) {

                        data[i] = rs.getString(i + 1);
                    }
                    selectedDevice.addRow(data);
                    repairPanel.getSelectedDeviceTable().setModel(selectedDevice);
                }
                j++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_findSpecificDeviceDataCollector.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
