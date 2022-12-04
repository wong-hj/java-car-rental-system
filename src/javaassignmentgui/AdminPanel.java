package javaassignmentgui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
        
        // set admin name
        username.setText(Renty.loginAdmin.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminSettings = new javax.swing.JButton();
        generateReportBtn = new javax.swing.JButton();
        manageCustomersBtn = new javax.swing.JButton();
        editCarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        AdminBgMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        adminSettings.setBackground(new java.awt.Color(102, 204, 255));
        adminSettings.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        adminSettings.setForeground(new java.awt.Color(0, 0, 0));
        adminSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car1.png"))); // NOI18N
        adminSettings.setText("  Settings");
        adminSettings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSettingsMouseClicked(evt);
            }
        });
        getContentPane().add(adminSettings);
        adminSettings.setBounds(60, 200, 360, 60);

        generateReportBtn.setBackground(new java.awt.Color(102, 204, 255));
        generateReportBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        generateReportBtn.setForeground(new java.awt.Color(0, 0, 0));
        generateReportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/mechanical-gears-.png"))); // NOI18N
        generateReportBtn.setText("  Generate Report");
        generateReportBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        generateReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportBtnActionPerformed(evt);
            }
        });
        getContentPane().add(generateReportBtn);
        generateReportBtn.setBounds(60, 560, 360, 60);

        manageCustomersBtn.setBackground(new java.awt.Color(102, 204, 255));
        manageCustomersBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        manageCustomersBtn.setForeground(new java.awt.Color(0, 0, 0));
        manageCustomersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/mechanical-gears-.png"))); // NOI18N
        manageCustomersBtn.setText("  Manage Customers");
        manageCustomersBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manageCustomersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomersBtnActionPerformed(evt);
            }
        });
        getContentPane().add(manageCustomersBtn);
        manageCustomersBtn.setBounds(60, 470, 360, 60);

        editCarBtn.setBackground(new java.awt.Color(102, 204, 255));
        editCarBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        editCarBtn.setForeground(new java.awt.Color(0, 0, 0));
        editCarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car1.png"))); // NOI18N
        editCarBtn.setText("  Add/ Manage Cars");
        editCarBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editCarBtn);
        editCarBtn.setBounds(60, 290, 360, 60);

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to RENTY, the Car Rental System.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 600, 30);

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cheque.png"))); // NOI18N
        jButton2.setText("  Manage Bookings");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 380, 360, 60);

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Greetings,");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 60, 190, 50);

        username.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("username");
        getContentPane().add(username);
        username.setBounds(240, 60, 320, 50);

        AdminBgMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/renty_logo.png"))); // NOI18N
        AdminBgMain.setText("jLabel1");
        getContentPane().add(AdminBgMain);
        AdminBgMain.setBounds(-3, 0, 1300, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomersBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminManageCustomers amc = new AdminManageCustomers();
        amc.setVisible(true);
        
    }//GEN-LAST:event_manageCustomersBtnActionPerformed

    private void editCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCarBtnActionPerformed
        try {
            // TODO add your handling code here:
            this.setVisible(false);
            AdminEditCars aec = new AdminEditCars();
            aec.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editCarBtnActionPerformed

    private void generateReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateReportBtnActionPerformed

    private void adminSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSettingsMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminSettings as = new AdminSettings();
        as.setVisible(true);
    }//GEN-LAST:event_adminSettingsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminManageBookings amb = new AdminManageBookings();
        amb.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminBgMain;
    private javax.swing.JButton adminSettings;
    private javax.swing.JButton editCarBtn;
    private javax.swing.JButton generateReportBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageCustomersBtn;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
