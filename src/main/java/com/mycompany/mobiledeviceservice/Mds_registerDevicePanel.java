/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mobiledeviceservice;

import com.mycompany.data.Mds_registerDeviceDataCollector;
import com.mycompany.device.DeviceModel;
import com.mycompany.equip.DataHelpers;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.lang.Number;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mathis
 */
public class Mds_registerDevicePanel extends javax.swing.JPanel {

    public ArrayList<String> registeredClaimantData;
    public ArrayList<String> registeredDeviceData;
    public ArrayList<String> order;
    Map<Integer, DeviceModel> deviceModelMap;
    Map<String, DeviceModel> deviceModelMapString;
    Map<Integer, String> deviceVendorMap = new HashMap();
    Integer claimantRegistered = 0;
    Mds_mainGui gui;

    public Mds_registerDevicePanel(Mds_mainGui gui) throws SQLException {
        this.gui = gui;
        initComponents();
        setComboBoxes();
        jRegisterDeviceButton.setEnabled(false);
        jDeviceFault.setEnabled(false);
        jDeviceIMEI.setEnabled(false);
        jDeviceModelComboBox.setEnabled(false);
        jDeviceTypeComboBox.setEnabled(false);
        jDeviceVendorComboBox.setEnabled(false);
        //   DatabaseConnector con = new DatabaseConnector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jClaimantName = new javax.swing.JTextField();
        jClaimantEmail = new javax.swing.JTextField();
        jClaimantAdress = new javax.swing.JTextField();
        jClaimantCity = new javax.swing.JTextField();
        jClaimantCountry = new javax.swing.JTextField();
        jClaimantPhone = new javax.swing.JTextField();
        jClaimantLegalTypeComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jDeviceIMEI = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jDeviceTypeComboBox = new javax.swing.JComboBox();
        jDeviceFault = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRegisterDeviceButton = new javax.swing.JButton();
        jDeviceVendorComboBox = new javax.swing.JComboBox();
        jDeviceModelComboBox = new javax.swing.JComboBox();

        jLabel1.setText("Register Device Panel");

        jLabel2.setText("Device data: ");

        jLabel3.setText("Claimant data: ");

        jLabel4.setText("Name : ");

        jLabel5.setText("email : ");

        jLabel6.setText("Adress:");

        jLabel7.setText("City : ");

        jLabel8.setText("Phone number : ");

        jLabel9.setText("Country : ");

        jLabel10.setText("Legal type :");

        jClaimantLegalTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Device IMEI : ");

        jLabel12.setText("Device type :");

        jDeviceTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Device fault :");

        registerButton.setText("Register Claimant");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Device model :");

        jLabel15.setText("Device vendor: ");

        jRegisterDeviceButton.setText("Register Device");
        jRegisterDeviceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegisterDeviceButtonMouseClicked(evt);
            }
        });

        jDeviceVendorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jDeviceVendorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeviceVendorComboBoxActionPerformed(evt);
            }
        });

        jDeviceModelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jClaimantAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jClaimantEmail)
                        .addComponent(jClaimantCity)
                        .addComponent(jClaimantCountry)
                        .addComponent(jClaimantPhone))
                    .addComponent(jClaimantName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(registerButton)
                        .addComponent(jClaimantLegalTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(495, 495, 495))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jDeviceTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDeviceFault, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(jDeviceIMEI))
                                .addComponent(jDeviceVendorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDeviceModelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(70, 70, 70)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(412, 412, 412))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRegisterDeviceButton)
                        .addGap(221, 221, 221))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(jLabel3)
                    .addContainerGap(904, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jClaimantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jDeviceIMEI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jClaimantEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDeviceTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jClaimantAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jDeviceVendorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jClaimantCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jDeviceModelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jClaimantCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jDeviceFault, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jClaimantPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jClaimantLegalTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(jRegisterDeviceButton))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(jLabel3)
                    .addContainerGap(518, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRegisterDeviceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterDeviceButtonMouseClicked
        if (claimantRegistered.equals(1)) {
            Integer numberOK = 0;
            registeredDeviceData = new ArrayList();

            if (jDeviceIMEI.getText().matches(".*\\d.*")) {
                registeredDeviceData.add(jDeviceIMEI.getText());
                numberOK = 1;
            } else {
                numberOK = 0;
                JOptionPane.showMessageDialog(this, "IMEI number contains only digits", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
            }
            registeredDeviceData.add((String) jDeviceTypeComboBox.getSelectedItem());
            registeredDeviceData.add(deviceModelMapString.get((String) jDeviceModelComboBox.getSelectedItem()).getModelId().toString());

            if (registeredDeviceData.contains("") || numberOK.equals(0)) {
                JOptionPane.showMessageDialog(this, "All arrays must be filled", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
            } else {
                Mds_registerDeviceDataCollector collector = new Mds_registerDeviceDataCollector(registeredDeviceData);
                collector.executeInsertDeviceData();
                gui.getjTabbedPane1().setSelectedIndex(0);
                gui.getjTabbedPane1().removeTabAt(1);
                gui.remove(gui.registerDevicePanel);
                gui.registerDevicePanel = null;

                order = new ArrayList<String>();
                // order.add(new Date().toString());
                order.add(jDeviceFault.getText());
                order.add(deviceModelMapString.get((String) jDeviceModelComboBox.getSelectedItem()).getModelId().toString());
                Integer claimantid = null;
                try {
                    ResultSet rs = DataHelpers.selectFrom("SELECT id_service_claimant FROM mds_service_claimant ORDER BY id_service_claimant DESC LIMIT 1");
                    while (rs.next()) {
                        claimantid = rs.getInt(1);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Mds_registerDevicePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                order.add(claimantid.toString());
                collector = new Mds_registerDeviceDataCollector(order);
                collector.executeInsertOrderData();
            }
        } else {
            JOptionPane.showMessageDialog(this, "The claimant must be filled first !", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jRegisterDeviceButtonMouseClicked

    private void jDeviceVendorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeviceVendorComboBoxActionPerformed
        changeModelBox();
    }//GEN-LAST:event_jDeviceVendorComboBoxActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        Integer numberOK = 0;
        registeredClaimantData = new ArrayList();
        registeredClaimantData.add(jClaimantName.getText());

        registeredClaimantData.add(jClaimantAdress.getText());
        registeredClaimantData.add(jClaimantCity.getText());
        registeredClaimantData.add(jClaimantCountry.getText());
        registeredClaimantData.add(jClaimantEmail.getText());
        if (jClaimantPhone.getText().matches(".*\\d.*")) {
            registeredClaimantData.add(jClaimantPhone.getText());
            numberOK = 1;
        } else {
            numberOK = 0;
            JOptionPane.showMessageDialog(this, "Phone number contains only digits", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
        }
        registeredClaimantData.add((String) jClaimantLegalTypeComboBox.getSelectedItem());

        if (registeredClaimantData.contains("") || numberOK.equals(0)) {
            JOptionPane.showMessageDialog(this, "All arrays must be filled", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
        } else {
            Mds_registerDeviceDataCollector collector = new Mds_registerDeviceDataCollector(registeredClaimantData);
            collector.executeInsertClaimantData();
            registerButton.setEnabled(false);
            claimantRegistered = 1;
            jRegisterDeviceButton.setEnabled(true);
            jDeviceFault.setEnabled(true);
            jDeviceIMEI.setEnabled(true);
            jDeviceModelComboBox.setEnabled(true);
            jDeviceTypeComboBox.setEnabled(true);
            jDeviceVendorComboBox.setEnabled(true);
        }


    }//GEN-LAST:event_registerButtonActionPerformed
    public void setComboBoxes() throws SQLException {
        jClaimantLegalTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"person", "freelancer", "company"}));
        jDeviceTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"phone", "tablet", "camera"}));
        deviceVendorMap = new HashMap();
        deviceModelMap = new HashMap();
        deviceModelMapString = new HashMap<String, DeviceModel>();

        ResultSet rs = DataHelpers.selectFrom("SELECT * FROM `mds_device_model`");
        while (rs.next()) {
            deviceModelMap.put(rs.getInt(1), new DeviceModel(rs.getString(2), rs.getInt(3), rs.getInt(1)));
            deviceModelMapString.put(rs.getString(2), new DeviceModel(rs.getString(2), rs.getInt(3), rs.getInt(1)));
        }
        rs = DataHelpers.selectFrom("SELECT * FROM `mds_device_vendor`");
        while (rs.next()) {
            deviceVendorMap.put(rs.getInt(1), rs.getString(2));
        }
        String[] vendorString = new String[deviceVendorMap.size()];
        for (int i = 1; i <= deviceVendorMap.size(); i++) {
            vendorString[i - 1] = deviceVendorMap.get(i);
        }
        jDeviceVendorComboBox.setModel(new javax.swing.DefaultComboBoxModel(vendorString));
        changeModelBox();
    }

    public void changeModelBox() {
        Integer index = jDeviceVendorComboBox.getSelectedIndex() + 1;
        Vector<String> modelList = new Vector<String>();
        for (int i = 0; i < deviceModelMap.size(); i++) {
            if (deviceModelMap.get(i + 1).getModelVendorId().equals(index)) {
                modelList.add(deviceModelMap.get(i + 1).getModelName());
            }
        }
        jDeviceModelComboBox.setModel(new javax.swing.DefaultComboBoxModel(modelList));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jClaimantAdress;
    private javax.swing.JTextField jClaimantCity;
    private javax.swing.JTextField jClaimantCountry;
    private javax.swing.JTextField jClaimantEmail;
    private javax.swing.JComboBox jClaimantLegalTypeComboBox;
    private javax.swing.JTextField jClaimantName;
    private javax.swing.JTextField jClaimantPhone;
    private javax.swing.JTextField jDeviceFault;
    private javax.swing.JTextField jDeviceIMEI;
    private javax.swing.JComboBox jDeviceModelComboBox;
    private javax.swing.JComboBox jDeviceTypeComboBox;
    private javax.swing.JComboBox jDeviceVendorComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jRegisterDeviceButton;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
