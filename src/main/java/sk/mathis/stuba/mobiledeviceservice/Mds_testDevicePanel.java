/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.mathis.stuba.mobiledeviceservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import sk.mathis.stuba.data.Mds_testDeviceDataCollector;
import sk.mathis.stuba.equip.DataHelpers;
import sk.mathis.stuba.equip.TestTypes;

/**
 *
 * @author Mathis
 */
public class Mds_testDevicePanel extends javax.swing.JPanel {

    private Mds_testDeviceDataCollector collector;
    private ArrayList<JFormattedTextField> testResults = new ArrayList<JFormattedTextField>();
    private ArrayList<TestTypes> testTypesList = new ArrayList<TestTypes>();
    private Integer id_testing = null;
    private String idTestedDevice = null;
    private Mds_mainGui gui;
    public Mds_testDevicePanel(Mds_mainGui gui) {
        initComponents();
        this.gui = gui;
        collector = new Mds_testDeviceDataCollector(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        devicesToTestTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        SelectedDeviceTable = new javax.swing.JTable();
        displayTest = new javax.swing.JCheckBox();
        cameraTest = new javax.swing.JCheckBox();
        memoryTest = new javax.swing.JCheckBox();
        speakerTest = new javax.swing.JCheckBox();
        batteryTest = new javax.swing.JCheckBox();
        chargingTest = new javax.swing.JCheckBox();
        sensorTest = new javax.swing.JCheckBox();
        stabilityTest = new javax.swing.JCheckBox();
        displayTestField = new javax.swing.JFormattedTextField();
        cameraTestField = new javax.swing.JFormattedTextField();
        memoryTestField = new javax.swing.JFormattedTextField();
        speakerTestField = new javax.swing.JFormattedTextField();
        batteryTestField = new javax.swing.JFormattedTextField();
        chargingTestField = new javax.swing.JFormattedTextField();
        sensorsTestField = new javax.swing.JFormattedTextField();
        stabilityTestField = new javax.swing.JFormattedTextField();
        submitTestsButton = new javax.swing.JButton();
        chooseDeviceToTest = new javax.swing.JButton();
        diagnosticianId = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1100, 650));

        jLabel1.setText("Test Device");

        jLabel2.setText("Devices To test");

        devicesToTestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "IMEI", "Vendor", "Model", "Fault"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        devicesToTestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devicesToTestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(devicesToTestTable);
        if (devicesToTestTable.getColumnModel().getColumnCount() > 0) {
            devicesToTestTable.getColumnModel().getColumn(0).setResizable(false);
            devicesToTestTable.getColumnModel().getColumn(1).setResizable(false);
            devicesToTestTable.getColumnModel().getColumn(2).setResizable(false);
            devicesToTestTable.getColumnModel().getColumn(3).setResizable(false);
            devicesToTestTable.getColumnModel().getColumn(4).setResizable(false);
        }

        SelectedDeviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "IMEI", "Vendor", "Model", "Fault"
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
        if (SelectedDeviceTable.getColumnModel().getColumnCount() > 0) {
            SelectedDeviceTable.getColumnModel().getColumn(0).setResizable(false);
            SelectedDeviceTable.getColumnModel().getColumn(1).setResizable(false);
            SelectedDeviceTable.getColumnModel().getColumn(2).setResizable(false);
            SelectedDeviceTable.getColumnModel().getColumn(3).setResizable(false);
            SelectedDeviceTable.getColumnModel().getColumn(4).setResizable(false);
        }

        displayTest.setText("Display test");

        cameraTest.setText("Camera test");

        memoryTest.setText("Memory test");
        memoryTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryTestActionPerformed(evt);
            }
        });

        speakerTest.setText("Speaker test");

        batteryTest.setText("Battery test");

        chargingTest.setText("Charging test");

        sensorTest.setText("Sensors test");

        stabilityTest.setText("Stability test");

        cameraTestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cameraTestFieldActionPerformed(evt);
            }
        });

        memoryTestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryTestFieldActionPerformed(evt);
            }
        });

        speakerTestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakerTestFieldActionPerformed(evt);
            }
        });

        batteryTestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batteryTestFieldActionPerformed(evt);
            }
        });

        chargingTestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargingTestFieldActionPerformed(evt);
            }
        });

        sensorsTestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorsTestFieldActionPerformed(evt);
            }
        });

        stabilityTestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stabilityTestFieldActionPerformed(evt);
            }
        });

        submitTestsButton.setText("Submit tests");
        submitTestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTestsButtonActionPerformed(evt);
            }
        });

        chooseDeviceToTest.setText("Choose this device to test");
        chooseDeviceToTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseDeviceToTestActionPerformed(evt);
            }
        });

        jLabel3.setText("Diagnostician id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(displayTest)
                                .addGap(103, 103, 103)
                                .addComponent(displayTestField, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cameraTest)
                                .addGap(99, 99, 99)
                                .addComponent(cameraTestField, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memoryTest)
                                .addGap(99, 99, 99)
                                .addComponent(memoryTestField, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sensorTest)
                                .addGap(99, 99, 99)
                                .addComponent(sensorsTestField, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stabilityTest)
                                .addGap(99, 99, 99)
                                .addComponent(stabilityTestField, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(chooseDeviceToTest))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(diagnosticianId, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chargingTest)
                                    .addComponent(batteryTest)
                                    .addComponent(speakerTest))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(speakerTestField, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                                    .addComponent(batteryTestField, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                                    .addComponent(chargingTestField, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(496, 496, 496)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(submitTestsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(displayTest)
                            .addComponent(displayTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cameraTest)
                            .addComponent(cameraTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(memoryTest)
                            .addComponent(memoryTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speakerTest)
                            .addComponent(speakerTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batteryTest)
                            .addComponent(batteryTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chargingTest)
                            .addComponent(chargingTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sensorTest)
                            .addComponent(sensorsTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stabilityTest)
                            .addComponent(stabilityTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(submitTestsButton)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diagnosticianId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(75, 75, 75)
                        .addComponent(chooseDeviceToTest)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void devicesToTestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devicesToTestTableMouseClicked
        collector.fillSelectedDeviceTable(devicesToTestTable.getSelectedRow());

    }//GEN-LAST:event_devicesToTestTableMouseClicked

    private void memoryTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memoryTestActionPerformed

    private void memoryTestFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryTestFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memoryTestFieldActionPerformed

    private void speakerTestFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakerTestFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speakerTestFieldActionPerformed

    private void batteryTestFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batteryTestFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batteryTestFieldActionPerformed

    private void chargingTestFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargingTestFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chargingTestFieldActionPerformed

    private void sensorsTestFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorsTestFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sensorsTestFieldActionPerformed

    private void stabilityTestFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stabilityTestFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stabilityTestFieldActionPerformed

    private void cameraTestFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cameraTestFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cameraTestFieldActionPerformed

    private void submitTestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTestsButtonActionPerformed
        if(batteryTest.isSelected()){
            testTypesList.add(TestTypes.BATTERY);
            testResults.add(batteryTestField);
        }
        if(cameraTest.isSelected()){
            testTypesList.add(TestTypes.CAMERA);
            testResults.add(cameraTestField);
        }
        if(chargingTest.isSelected()){
            testTypesList.add(TestTypes.CHARGING);
            testResults.add(chargingTestField);
        }
        if(displayTest.isSelected()){
            testTypesList.add(TestTypes.DISPLAY);
            testResults.add(displayTestField);
        }
        if(memoryTest.isSelected()){
            testTypesList.add(TestTypes.MEMORY);
            testResults.add(memoryTestField);
        }
        if(sensorTest.isSelected()){
            testTypesList.add(TestTypes.SENSORS);
            testResults.add(sensorsTestField);
        }
        if(stabilityTest.isSelected()){
            testTypesList.add(TestTypes.STABILITY);
            testResults.add(stabilityTestField);
        }
        if(speakerTest.isSelected()){
            testTypesList.add(TestTypes.SPEAKER);
            testResults.add(speakerTestField);
        }
        collector.fillTests(testTypesList, testResults, id_testing);
        DataHelpers.updateRow("UPDATE mds_device SET tested=1 WHERE id_device = '" + idTestedDevice + "'");
        DataHelpers.updateRow("UPDATE mds_testing SET end_time= CURRENT_TIMESTAMP WHERE id_testing = '" + id_testing +"'");
        collector.fillDiagnosisTable();
        gui.getjTabbedPane1().remove(gui.getjTabbedPane1().getSelectedIndex());
        gui.getjTabbedPane1().setSelectedIndex(0);
        gui.remove(gui.testDevicePanel);
        gui.testDevicePanel = null;
        
    }//GEN-LAST:event_submitTestsButtonActionPerformed

    private void chooseDeviceToTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseDeviceToTestActionPerformed
        ArrayList<String> testingInfo = new ArrayList<String>();
        //testingInfo.add(new Date());
        
        testingInfo.add(diagnosticianId.getText());
        idTestedDevice = (String)SelectedDeviceTable.getModel().getValueAt(0, 0);
        testingInfo.add(idTestedDevice);
        DataHelpers.insertFromArray(testingInfo, "mds_testing", DataHelpers.mds_testing);
        ResultSet rs = DataHelpers.selectFrom("SELECT id_testing FROM mds_testing ORDER BY id_testing DESC LIMIT 1");
        try {
            while(rs.next()){
                id_testing = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_testDevicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(testingInfo);
    }//GEN-LAST:event_chooseDeviceToTestActionPerformed

    public JTable getDevicesToTestTable() {
        return devicesToTestTable;
    }

    public JTable getSelectedDeviceTable() {
        return SelectedDeviceTable;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SelectedDeviceTable;
    private javax.swing.JCheckBox batteryTest;
    private javax.swing.JFormattedTextField batteryTestField;
    private javax.swing.JCheckBox cameraTest;
    private javax.swing.JFormattedTextField cameraTestField;
    private javax.swing.JCheckBox chargingTest;
    private javax.swing.JFormattedTextField chargingTestField;
    private javax.swing.JButton chooseDeviceToTest;
    private javax.swing.JTable devicesToTestTable;
    private javax.swing.JFormattedTextField diagnosticianId;
    private javax.swing.JCheckBox displayTest;
    private javax.swing.JFormattedTextField displayTestField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox memoryTest;
    private javax.swing.JFormattedTextField memoryTestField;
    private javax.swing.JCheckBox sensorTest;
    private javax.swing.JFormattedTextField sensorsTestField;
    private javax.swing.JCheckBox speakerTest;
    private javax.swing.JFormattedTextField speakerTestField;
    private javax.swing.JCheckBox stabilityTest;
    private javax.swing.JFormattedTextField stabilityTestField;
    private javax.swing.JButton submitTestsButton;
    // End of variables declaration//GEN-END:variables
}
