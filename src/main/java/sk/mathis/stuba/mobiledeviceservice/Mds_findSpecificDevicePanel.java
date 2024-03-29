/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.mathis.stuba.mobiledeviceservice;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sk.mathis.stuba.data.Mds_findSpecificDeviceDataCollector;
import sk.mathis.stuba.equip.FindingTypes;

/**
 *
 * @author Mathis
 */
public class Mds_findSpecificDevicePanel extends javax.swing.JPanel {

    private String findingMask = null;
    private Integer insertOk = 0;
    private FindingTypes findingType = null;
    private Mds_mainGui gui;

    public Mds_findSpecificDevicePanel(Mds_mainGui gui) {
        initComponents();
        this.gui = gui;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDeviceData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFindUsingIMEI = new javax.swing.JTextField();
        jFindUsingEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFindUsingPhoneNumber = new javax.swing.JTextField();
        jFindSpecificDevice = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jClaimantData = new javax.swing.JTable();
        cancelOperation = new javax.swing.JButton();

        jDialog1.setEnabled(false);
        jDialog1.setMinimumSize(new java.awt.Dimension(110, 650));
        jDialog1.setPreferredSize(new java.awt.Dimension(110, 650));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        setMinimumSize(new java.awt.Dimension(1100, 650));

        jDeviceData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "IMEI", "Date of Registration", "Device Model", "Device Vendor", "Fault", "Repaired", "Repair costs", "diagnosis"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jDeviceData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDeviceDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jDeviceData);
        if (jDeviceData.getColumnModel().getColumnCount() > 0) {
            jDeviceData.getColumnModel().getColumn(0).setResizable(false);
            jDeviceData.getColumnModel().getColumn(0).setPreferredWidth(20);
            jDeviceData.getColumnModel().getColumn(1).setResizable(false);
            jDeviceData.getColumnModel().getColumn(2).setResizable(false);
            jDeviceData.getColumnModel().getColumn(3).setResizable(false);
            jDeviceData.getColumnModel().getColumn(4).setResizable(false);
            jDeviceData.getColumnModel().getColumn(5).setResizable(false);
            jDeviceData.getColumnModel().getColumn(6).setResizable(false);
            jDeviceData.getColumnModel().getColumn(7).setResizable(false);
            jDeviceData.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel2.setText("Find specific registered device");

        jLabel3.setText("Find device using IMEI : ");

        jLabel5.setText("Find device using registration email : ");

        jFindUsingIMEI.setForeground(new java.awt.Color(204, 204, 204));
        jFindUsingIMEI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFindUsingIMEIMouseClicked(evt);
            }
        });

        jFindUsingEmail.setForeground(new java.awt.Color(204, 204, 204));
        jFindUsingEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFindUsingEmailMouseClicked(evt);
            }
        });

        jLabel7.setText("Find device using registration phone number : ");

        jFindUsingPhoneNumber.setForeground(new java.awt.Color(204, 204, 204));
        jFindUsingPhoneNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFindUsingPhoneNumberMouseClicked(evt);
            }
        });

        jFindSpecificDevice.setText("Find");
        jFindSpecificDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindSpecificDeviceActionPerformed(evt);
            }
        });

        jClaimantData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Address", "City", "Country", "Email", "Phone number", "Legal type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jClaimantData);
        if (jClaimantData.getColumnModel().getColumnCount() > 0) {
            jClaimantData.getColumnModel().getColumn(0).setResizable(false);
            jClaimantData.getColumnModel().getColumn(0).setPreferredWidth(20);
            jClaimantData.getColumnModel().getColumn(1).setResizable(false);
            jClaimantData.getColumnModel().getColumn(2).setResizable(false);
            jClaimantData.getColumnModel().getColumn(3).setResizable(false);
            jClaimantData.getColumnModel().getColumn(4).setResizable(false);
            jClaimantData.getColumnModel().getColumn(5).setResizable(false);
            jClaimantData.getColumnModel().getColumn(5).setPreferredWidth(130);
            jClaimantData.getColumnModel().getColumn(6).setResizable(false);
            jClaimantData.getColumnModel().getColumn(7).setResizable(false);
        }

        cancelOperation.setText("Cancel operation");
        cancelOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOperationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jFindUsingIMEI, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(jFindUsingEmail))
                            .addComponent(jFindUsingPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 342, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelOperation)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jFindSpecificDevice)
                .addGap(516, 516, 516))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelOperation)))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFindUsingIMEI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFindUsingEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFindUsingPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jFindSpecificDevice)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(481, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(62, 62, 62)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFindUsingIMEIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFindUsingIMEIMouseClicked
        jFindUsingIMEI.setText("");

    }//GEN-LAST:event_jFindUsingIMEIMouseClicked

    private void jFindUsingEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFindUsingEmailMouseClicked
        jFindUsingEmail.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jFindUsingEmailMouseClicked

    private void jFindUsingPhoneNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFindUsingPhoneNumberMouseClicked
        jFindUsingPhoneNumber.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jFindUsingPhoneNumberMouseClicked

    private void jFindSpecificDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindSpecificDeviceActionPerformed

        if (!jFindUsingIMEI.getText().equals("")) {
            if (jFindUsingIMEI.getText().matches(".*\\d.*")) {
                findingMask = jFindUsingIMEI.getText();
                findingType = FindingTypes.IMEI;
                insertOk = 1;
            } else{
                JOptionPane.showMessageDialog(this, "IMEI number contains only digits", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
            }
        } else if (!jFindUsingEmail.getText().equals("")) {
            if (jFindUsingEmail.getText().matches(".*@.*")) {
                findingMask = jFindUsingEmail.getText();
                findingType = FindingTypes.EMAIL;
                insertOk = 1;
            } else { 
                JOptionPane.showMessageDialog(this, "Email address must contain @", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
            }
        } else if (!jFindUsingPhoneNumber.getText().equals("")) {
            if (jFindUsingPhoneNumber.getText().matches("\\d.*\\d.*\\d")) {
                findingMask = jFindUsingPhoneNumber.getText();
                findingType = FindingTypes.PHONENUMBER;
                insertOk = 1;
            }else { 
                JOptionPane.showMessageDialog(this, "Phone number contains only digits", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (insertOk.equals(1)) {
            insertOk = 0;
            DefaultTableModel claimantDataTablemodel = (DefaultTableModel) jClaimantData.getModel();
            claimantDataTablemodel.setRowCount(0);
            DefaultTableModel deviceDataTablemodel = (DefaultTableModel) jDeviceData.getModel();
            deviceDataTablemodel.setRowCount(0);
            Mds_findSpecificDeviceDataCollector collector = new Mds_findSpecificDeviceDataCollector(findingType, findingMask, jClaimantData, jDeviceData);
        }
    }//GEN-LAST:event_jFindSpecificDeviceActionPerformed

    private void jDeviceDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeviceDataMouseClicked
        Mds_fullListingPanel listingPanel = new Mds_fullListingPanel(gui);
        listingPanel.fillData( (Integer)(Integer.parseInt((String)jDeviceData.getValueAt(jDeviceData.getSelectedRow(), 0))));
        jDialog1.setContentPane(listingPanel);
        jDialog1.setSize(1100, 680);
        jDialog1.setEnabled(true);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jDeviceDataMouseClicked

    private void cancelOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOperationActionPerformed
        gui.getjTabbedPane1().remove(gui.getjTabbedPane1().getSelectedIndex());
        gui.getjTabbedPane1().setSelectedIndex(0);
        gui.remove(gui.findDevicePanel);
        gui.findDevicePanel = null;

    }//GEN-LAST:event_cancelOperationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelOperation;
    private javax.swing.JTable jClaimantData;
    private javax.swing.JTable jDeviceData;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JButton jFindSpecificDevice;
    private javax.swing.JTextField jFindUsingEmail;
    private javax.swing.JTextField jFindUsingIMEI;
    private javax.swing.JTextField jFindUsingPhoneNumber;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
