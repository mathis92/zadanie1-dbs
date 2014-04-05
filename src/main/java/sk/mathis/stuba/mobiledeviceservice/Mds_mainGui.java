/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.mathis.stuba.mobiledeviceservice;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.sql.ResultSet;
import sk.mathis.stuba.equip.DataHelpers;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static sk.mathis.stuba.equip.DataHelpers.conn;

public class Mds_mainGui extends javax.swing.JFrame {

    public String[] services;
    public Mds_findSpecificDevicePanel findDevicePanel = null;
    public Mds_registerDevicePanel registerDevicePanel = null;
    public Mds_repairDevicePanel repairDevicePanel = null;
    public Mds_sendDevicePanel sendDevicePanel = null;
    public Mds_testDevicePanel testDevicePanel = null;

    public Mds_mainGui() {
        initComponents();
        updateInfo();
        DataHelpers.initializeVariables();
        DataHelpers.createConnection();
        try {
            updateOrderCount();
        } catch (SQLException ex) {
            Logger.getLogger(Mds_mainGui.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTimeInfo = new javax.swing.JLabel();
        jRepairAmountInfo = new javax.swing.JLabel();
        jWhatToDo = new javax.swing.JComboBox();
        jDoItButton = new javax.swing.JButton();
        jAboutServiceButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 650));

        jLabel1.setText("Mobile Device Service");

        jLabel4.setText("What to do : ");

        jTimeInfo.setText("time info");

        jRepairAmountInfo.setText("jLabel3");

        jWhatToDo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jWhatToDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWhatToDoActionPerformed(evt);
            }
        });

        jDoItButton.setText("Do It");
        jDoItButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDoItButtonActionPerformed(evt);
            }
        });

        jAboutServiceButton.setText("About Us");

        jLabel2.setText("Currently registered devices ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTimeInfo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(120, 120, 120)
                        .addComponent(jWhatToDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jDoItButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jRepairAmountInfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(485, 485, 485)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(jAboutServiceButton)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jAboutServiceButton))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jWhatToDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDoItButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jTimeInfo)
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRepairAmountInfo)
                    .addComponent(jLabel2))
                .addGap(181, 181, 181))
        );

        jTabbedPane1.addTab("Main screen", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDoItButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDoItButtonActionPerformed

        System.out.println(jWhatToDo.getSelectedIndex());
        switch (jWhatToDo.getSelectedIndex()) {

            case 0: {
                if (registerDevicePanel == null) {
                    try {
                        registerDevicePanel = new Mds_registerDevicePanel(this);
                    } catch (SQLException ex) {
                        Logger.getLogger(Mds_mainGui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                jTabbedPane1.addTab(services[0], registerDevicePanel);
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount() - 1);
                break;
            }
            case 3: {
                if (repairDevicePanel == null) {
                    repairDevicePanel = new Mds_repairDevicePanel(this);
                }
                jTabbedPane1.addTab(services[1], repairDevicePanel);
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount() - 1);
                break;
            }
            case 4: {
                if (sendDevicePanel == null) {
                    sendDevicePanel = new Mds_sendDevicePanel(this);
                }
                jTabbedPane1.addTab(services[2], sendDevicePanel);
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount() - 1);
                break;
            }
            case 1: {

                if (findDevicePanel == null) {
                    findDevicePanel = new Mds_findSpecificDevicePanel(this);
                }
                jTabbedPane1.addTab(services[1], findDevicePanel);
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount() - 1);
                break;
            }
            case 2: {
                if (testDevicePanel == null) {
                    testDevicePanel = new Mds_testDevicePanel(this);
                }
                jTabbedPane1.addTab(services[2], testDevicePanel);
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount() - 1);
                break;
            }
        }


    }//GEN-LAST:event_jDoItButtonActionPerformed

    private void jWhatToDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWhatToDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jWhatToDoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new HiFiLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Mds_mainGui.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mds_mainGui().setVisible(true);
            }
        });
    }

    public void updateInfo() {
        Date date = new Date();
        jTimeInfo.setText(date.toString());
        services = new String[]{"Register Device", "Find specific registered device", "Test device", "Repair device", "Send device"};

        jWhatToDo.setModel(new javax.swing.DefaultComboBoxModel(services));

    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void updateOrderCount() throws SQLException {
        ResultSet rs;
        try {
            rs = DataHelpers.selectFrom("SELECT count(*) FROM mds_service_order");
            while (rs.next()) {
                jRepairAmountInfo.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mds_mainGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAboutServiceButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JButton jDoItButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jRepairAmountInfo;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jTimeInfo;
    private javax.swing.JComboBox jWhatToDo;
    // End of variables declaration//GEN-END:variables
}
