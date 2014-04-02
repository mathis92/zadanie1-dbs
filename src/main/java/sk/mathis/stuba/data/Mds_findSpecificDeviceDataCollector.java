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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sk.mathis.stuba.equip.DataHelpers;
import sk.mathis.stuba.equip.FindingTypes;

/**
 *
 * @author Mathis
 */
public class Mds_findSpecificDeviceDataCollector {

    private String findingMask;
    private JTable claimantData;
    private FindingTypes findingType;
    private JTable deviceData;

    public Mds_findSpecificDeviceDataCollector(FindingTypes findingType, String findingMask, JTable claimantData, JTable deviceData) {
        this.findingMask = findingMask;
        this.claimantData = claimantData;
        this.findingType = findingType;
        this.deviceData = deviceData;
        fillTable();
    }

    public void fillTable() {
        ResultSet rs;
        switch (findingType) {

            case EMAIL: {
                rs = DataHelpers.selectFrom("SELECT * FROM mds_service_claimant WHERE email = '" + findingMask + "'");
                fillClaimantDataTable(rs);
                rs = DataHelpers.selectFrom("SELECT id_device,imei,registration_date,model,vendor,fault_description  FROM (SELECT mds_device.id_device,mds_device.imei, mds_service_order.registration_date,mds_device_model.model, mds_device_vendor.vendor,mds_service_order.fault_description,mds_service_claimant.email\n"
                        + "   FROM mds_service_claimant \n"
                        + "   JOIN mds_service_order \n"
                        + "  	 ON mds_service_claimant.id_service_claimant = mds_service_order.id_claimant \n"
                        + "   JOIN mds_device \n"
                        + "      ON mds_service_order.id_device =  mds_device.id_device\n"
                        + "   JOIN  mds_device_model\n"
                        + "      ON mds_device.id_device_model = mds_device_model.id_device_model\n"
                        + "   JOIN mds_device_vendor\n"
                        + "      ON mds_device_model.id_device_vendor = mds_device_vendor.id_device_vendor) AS `table1`\n"
                        + "WHERE table1.email ='" + findingMask + "'");
                fillDeviceDataTable(rs);

                break;
            }
            case IMEI: {
                rs = DataHelpers.selectFrom("SELECT id_service_claimant,name,adress,city,country,email,phone_number,legal_type FROM (SELECT mds_service_claimant.id_service_claimant,mds_service_claimant.name,mds_service_claimant.adress,mds_service_claimant.city,mds_service_claimant.country,mds_service_claimant.email,mds_service_claimant.phone_number,mds_service_claimant.legal_type ,mds_device.imei, mds_service_order.id_claimant,mds_service_order.id_device\n"
                        + "	FROM mds_service_order \n"
                        + "	JOIN mds_service_claimant \n"
                        + "		ON mds_service_order.id_claimant = mds_service_claimant.id_service_claimant \n"
                        + "	JOIN mds_device \n"
                        + "		ON mds_service_order.id_device =  mds_device.id_device) AS `table1`\n"
                        + "WHERE table1.imei = '" + findingMask + "'");
                fillClaimantDataTable(rs);
                rs = DataHelpers.selectFrom("SELECT id_device,imei,registration_date,model,vendor,fault_description  FROM (SELECT mds_device.id_device,mds_device.imei, mds_service_order.registration_date,mds_device_model.model, mds_device_vendor.vendor,mds_service_order.fault_description,mds_service_claimant.email\n"
                        + "   FROM mds_service_claimant \n"
                        + "   JOIN mds_service_order \n"
                        + "  	 ON mds_service_claimant.id_service_claimant = mds_service_order.id_claimant \n"
                        + "   JOIN mds_device \n"
                        + "      ON mds_service_order.id_device =  mds_device.id_device\n"
                        + "   JOIN  mds_device_model\n"
                        + "      ON mds_device.id_device_model = mds_device_model.id_device_model\n"
                        + "   JOIN mds_device_vendor\n"
                        + "      ON mds_device_model.id_device_vendor = mds_device_vendor.id_device_vendor) AS `table1`\n"
                        + "WHERE table1.imei = '" + findingMask + "'");
                fillDeviceDataTable(rs);
                break;
            }
            case PHONENUMBER: {
                break;
            }
        }

        String line = " ";
    }

    public void fillClaimantDataTable(ResultSet result) {
        Object[] data = new Object[8];
        DefaultTableModel claimantDataTablemodel;

        claimantDataTablemodel = (DefaultTableModel) claimantData.getModel();

        try {
            while (result.next()) {
                for (int i = 0; i < 8; i++) {

                    data[i] = result.getString(i + 1);
                }
                claimantDataTablemodel.addRow(data);
                claimantData.setModel(claimantDataTablemodel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_findSpecificDeviceDataCollector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fillDeviceDataTable(ResultSet rs) {
        Object[] data = new Object[6];
        DefaultTableModel deviceDataTablemodel;

        deviceDataTablemodel = (DefaultTableModel) deviceData.getModel();
        try {
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    data[i] = rs.getString(i + 1);
                }
                deviceDataTablemodel.addRow(data);
                deviceData.setModel(deviceDataTablemodel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_findSpecificDeviceDataCollector.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
