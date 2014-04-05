/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.mathis.stuba.mobiledeviceservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sk.mathis.stuba.data.Mds_repairDeviceDataCollector;
import sk.mathis.stuba.equip.DataHelpers;

public class Mds_repairDevicePanel extends javax.swing.JPanel {

    private final Mds_repairDeviceDataCollector collector;
    private Long id_diagnosis = null;
    private Long id_repair = null;
    private String idRepairedDevice = null;
    private Mds_mainGui gui;
    private Integer reportOK = 0, costsOK = 0;

    public Mds_repairDevicePanel(Mds_mainGui gui) {
        this.gui = gui;
        initComponents();
        setDiagnosticianComboBox();
        collector = new Mds_repairDeviceDataCollector(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        devicesToRepairTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        SelectedDeviceTable = new javax.swing.JTable();
        chooseDeviceToRepair = new javax.swing.JButton();
        submitRepairButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        diagnosisTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        reportTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cancelOperation = new javax.swing.JButton();
        diagnosticianIdComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        repairCosts = new javax.swing.JFormattedTextField();

        setMinimumSize(new java.awt.Dimension(1100, 650));

        jLabel2.setText("Devices to be reapired");

        jLabel1.setText("Repair Device");

        devicesToRepairTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "IMEI", "Vendor", "Model", "Diagnosis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        devicesToRepairTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devicesToRepairTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(devicesToRepairTable);

        SelectedDeviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "IMEI", "Vendor", "Model", "Diagnosis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(SelectedDeviceTable);

        chooseDeviceToRepair.setText("Choose this device to repair");
        chooseDeviceToRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseDeviceToRepairActionPerformed(evt);
            }
        });

        submitRepairButton.setText("Submit repair");
        submitRepairButton.setEnabled(false);
        submitRepairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRepairButtonActionPerformed(evt);
            }
        });

        diagnosisTextArea.setEditable(false);
        diagnosisTextArea.setColumns(20);
        diagnosisTextArea.setRows(5);
        jScrollPane3.setViewportView(diagnosisTextArea);

        reportTextArea.setColumns(20);
        reportTextArea.setRows(5);
        reportTextArea.setEnabled(false);
        jScrollPane4.setViewportView(reportTextArea);

        jLabel3.setText("Repair report");

        cancelOperation.setText("Cancel operation");
        cancelOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOperationActionPerformed(evt);
            }
        });

        diagnosticianIdComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Diagnostician : ");

        jLabel5.setText("Repair costs :");

        repairCosts.setForeground(new java.awt.Color(204, 204, 255));
        repairCosts.setText("format xxx.yy");
        repairCosts.setEnabled(false);
        repairCosts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repairCostsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                repairCostsMouseExited(evt);
            }
        });
        repairCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairCostsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(510, 510, 510))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)
                                .addComponent(repairCosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chooseDeviceToRepair)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelOperation)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(diagnosticianIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitRepairButton)
                        .addGap(497, 497, 497))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(486, 486, 486)
                            .addComponent(jLabel1))
                        .addComponent(jLabel2))
                    .addContainerGap(332, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelOperation)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diagnosticianIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(184, 184, 184)
                .addComponent(chooseDeviceToRepair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(repairCosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitRepairButton)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public final void setDiagnosticianComboBox() {
        Map<Integer, String> diagnosticianMap = new HashMap<Integer, String>();
        ResultSet rs;
        try {
            rs = DataHelpers.selectFrom("SELECT * FROM `mds_diagnostician`");

            while (rs.next()) {
                diagnosticianMap.put(rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_testDevicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] vendorString = new String[diagnosticianMap.size()];
        for (int i = 1; i <= diagnosticianMap.size(); i++) {
            vendorString[i - 1] = diagnosticianMap.get(i);
        }
        diagnosticianIdComboBox.setModel(new javax.swing.DefaultComboBoxModel(vendorString));
    }

    private void devicesToRepairTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devicesToRepairTableMouseClicked
        collector.fillSelectedDeviceTable(devicesToRepairTable.getSelectedRow());
        ResultSet rs;
        try {
            rs = DataHelpers.selectFrom("SELECT specification from mds_diagnosis Where id_device ='" + devicesToRepairTable.getValueAt(devicesToRepairTable.getSelectedRow(), 0) + "'");
            while (rs.next()) {
                diagnosisTextArea.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_repairDevicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_devicesToRepairTableMouseClicked

    private void chooseDeviceToRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseDeviceToRepairActionPerformed
        if (SelectedDeviceTable.getModel().getRowCount() > 0) {
            ResultSet rs;
            ArrayList<String> repairInfo = new ArrayList<String>();
            Integer diagId = diagnosticianIdComboBox.getSelectedIndex() + 1;
            repairInfo.add(diagId.toString());
            idRepairedDevice = (String) SelectedDeviceTable.getModel().getValueAt(0, 0);
            try {
                rs = DataHelpers.selectFrom("SELECT id_diagnosis FROM mds_diagnosis WHERE id_device ='" + idRepairedDevice + "'");

                while (rs.next()) {
                    id_diagnosis = rs.getLong(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Mds_repairDevicePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            repairInfo.add(id_diagnosis.toString());
            id_repair = DataHelpers.insertFromArray(repairInfo, "mds_repair", DataHelpers.mds_repair);
            chooseDeviceToRepair.setEnabled(false);
            repairCosts.setEnabled(true);
            reportTextArea.setEnabled(true);
            submitRepairButton.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "You have to choose device to repair !", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_chooseDeviceToRepairActionPerformed

    private void submitRepairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRepairButtonActionPerformed

        if (reportOK.equals(0) && !reportTextArea.getText().equalsIgnoreCase("")) {
            DataHelpers.updateRow("UPDATE mds_repair SET end_time = CURRENT_TIMESTAMP, report = '" + reportTextArea.getText() + "' WHERE id_repair = '" + id_repair + "'");
            reportOK = 1;
        } else {
            JOptionPane.showMessageDialog(this, "Repair report must be filled !", "Notification !!!!", JOptionPane.WARNING_MESSAGE);

        }
        System.out.println(reportOK);
        System.out.println(costsOK);
        if (costsOK.equals(0) && (repairCosts.getText().length() > 0) && !repairCosts.getText().equalsIgnoreCase("") && repairCosts.getText().matches(".*..*[0-9].*..*")) {

            DataHelpers.updateRow("UPDATE mds_device SET repaired = 1 WHERE id_device = '" + idRepairedDevice + "'");
            DataHelpers.updateRow("UPDATE mds_repair SET repair_costs ='" + repairCosts.getText() + "' WHERE id_repair = '" + id_repair + "'");
            costsOK = 1;

        } else {
            if (costsOK.equals(0)) {
                JOptionPane.showMessageDialog(this, "Repair costs must be filled in format xxx.yy !", "Notification !!!!", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (reportOK.equals(1) && costsOK.equals(1)) {
            gui.getjTabbedPane1().remove(gui.getjTabbedPane1().getSelectedIndex());
            gui.getjTabbedPane1().setSelectedIndex(0);
            gui.remove(gui.repairDevicePanel);
            gui.refreshListingPanel();
            gui.repairDevicePanel = null;
        }
    }//GEN-LAST:event_submitRepairButtonActionPerformed

    private void cancelOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOperationActionPerformed
        gui.getjTabbedPane1().remove(gui.getjTabbedPane1().getSelectedIndex());
        gui.getjTabbedPane1().setSelectedIndex(0);
        gui.remove(gui.repairDevicePanel);
        gui.repairDevicePanel = null;
    }//GEN-LAST:event_cancelOperationActionPerformed

    private void repairCostsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repairCostsMouseClicked
        repairCosts.setText("");
    }//GEN-LAST:event_repairCostsMouseClicked

    private void repairCostsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repairCostsMouseExited

    }//GEN-LAST:event_repairCostsMouseExited

    private void repairCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairCostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repairCostsActionPerformed

    public JTable getDevicesToRepairTable() {
        return devicesToRepairTable;
    }

    public JTable getSelectedDeviceTable() {
        return SelectedDeviceTable;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SelectedDeviceTable;
    private javax.swing.JButton cancelOperation;
    private javax.swing.JButton chooseDeviceToRepair;
    private javax.swing.JTable devicesToRepairTable;
    private javax.swing.JTextArea diagnosisTextArea;
    private javax.swing.JComboBox diagnosticianIdComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JFormattedTextField repairCosts;
    private javax.swing.JTextArea reportTextArea;
    private javax.swing.JButton submitRepairButton;
    // End of variables declaration//GEN-END:variables
}
