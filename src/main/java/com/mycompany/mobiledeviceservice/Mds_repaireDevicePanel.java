/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mobiledeviceservice;

/**
 *
 * @author Mathis
 */
public class Mds_repaireDevicePanel extends javax.swing.JPanel {

    /**
     * Creates new form Mds_repaireDevicePanel
     */
    public Mds_repaireDevicePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFindUsingIMEI = new javax.swing.JTextField();
        jFindUsingName1 = new javax.swing.JTextField();
        jFindUsingEmail = new javax.swing.JTextField();
        jFindUsingName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1100, 650));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IMEI", "Date of Registration", "Repaired", "Device Type", "Repair costs", "diagnosis"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Find device using IMEI : ");

        jLabel5.setText("Find device using registration email : ");

        jLabel6.setText("Find device using registration name : ");

        jLabel7.setText("Find device using registration phone number : ");

        jFindUsingIMEI.setForeground(new java.awt.Color(204, 204, 204));
        jFindUsingIMEI.setText("Inser device IMEI number");
        jFindUsingIMEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindUsingIMEIActionPerformed(evt);
            }
        });

        jFindUsingName1.setForeground(new java.awt.Color(204, 204, 204));
        jFindUsingName1.setText("insert registration phone number");
        jFindUsingName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindUsingName1ActionPerformed(evt);
            }
        });

        jFindUsingEmail.setForeground(new java.awt.Color(204, 204, 204));
        jFindUsingEmail.setText("Insert registration email");
        jFindUsingEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindUsingEmailActionPerformed(evt);
            }
        });

        jFindUsingName.setForeground(new java.awt.Color(204, 204, 204));
        jFindUsingName.setText("insert registration name");
        jFindUsingName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindUsingNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Find Device");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jFindUsingName1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jFindUsingIMEI)
                                            .addComponent(jFindUsingEmail)
                                            .addComponent(jFindUsingName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(521, 521, 521)
                                .addComponent(jLabel2)))
                        .addGap(0, 514, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFindUsingIMEI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFindUsingEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFindUsingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFindUsingName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFindUsingIMEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindUsingIMEIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFindUsingIMEIActionPerformed

    private void jFindUsingName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindUsingName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFindUsingName1ActionPerformed

    private void jFindUsingEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindUsingEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFindUsingEmailActionPerformed

    private void jFindUsingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindUsingNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFindUsingNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jFindUsingEmail;
    private javax.swing.JTextField jFindUsingIMEI;
    private javax.swing.JTextField jFindUsingName;
    private javax.swing.JTextField jFindUsingName1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
