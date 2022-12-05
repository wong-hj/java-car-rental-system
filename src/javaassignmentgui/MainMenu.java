/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignmentgui;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Horngjun
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
       
        date.setText(Renty.toDate());
        username.setText(Renty.loginUser.getUsername());
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
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        rentBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();
        settingBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        payBtn = new javax.swing.JButton();
        backgroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Greetings,");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 60, 190, 50);

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to RENTY, the Car Rental System.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 600, 30);

        date.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("date");
        date.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(date);
        date.setBounds(1110, 110, 180, 40);

        username.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("username");
        getContentPane().add(username);
        username.setBounds(240, 60, 320, 50);

        rentBtn.setBackground(new java.awt.Color(102, 204, 255));
        rentBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        rentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car1.png"))); // NOI18N
        rentBtn.setText("  Rent a Car");
        rentBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(rentBtn);
        rentBtn.setBounds(60, 290, 360, 60);

        reportBtn.setBackground(new java.awt.Color(102, 204, 255));
        reportBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        reportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/clipboard.png"))); // NOI18N
        reportBtn.setText("  Booking, Reports");
        reportBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reportBtn);
        reportBtn.setBounds(60, 470, 360, 60);

        settingBtn.setBackground(new java.awt.Color(102, 204, 255));
        settingBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        settingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/mechanical-gears-.png"))); // NOI18N
        settingBtn.setText("  Settings");
        settingBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingBtnActionPerformed(evt);
            }
        });
        getContentPane().add(settingBtn);
        settingBtn.setBounds(60, 560, 360, 60);

        exitBtn.setBackground(new java.awt.Color(153, 0, 0));
        exitBtn.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.setBorder(null);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn);
        exitBtn.setBounds(1110, 570, 120, 40);

        loginBtn.setBackground(new java.awt.Color(153, 0, 0));
        loginBtn.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Back to Login");
        loginBtn.setBorder(null);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn);
        loginBtn.setBounds(830, 570, 260, 40);

        payBtn.setBackground(new java.awt.Color(102, 204, 255));
        payBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        payBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cheque.png"))); // NOI18N
        payBtn.setText(" Payment");
        payBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });
        getContentPane().add(payBtn);
        payBtn.setBounds(60, 380, 360, 60);

        backgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        backgroundImg.setText("jLabel2");
        getContentPane().add(backgroundImg);
        backgroundImg.setBounds(-3, -4, 1310, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        Setting setting = new Setting();
        setting.setVisible(true);
    }//GEN-LAST:event_settingBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        DataIO.exitProgram();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void rentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBtnActionPerformed
        this.setVisible(false);
        
        RentCar rent = new RentCar();
        rent.setVisible(true);
    }//GEN-LAST:event_rentBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        this.setVisible(false);
        ViewBooking vb = new ViewBooking();
        vb.setVisible(true);
    }//GEN-LAST:event_reportBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        this.setVisible(false);
        
        BookingPay bp = new BookingPay();
        bp.setVisible(true);
    }//GEN-LAST:event_payBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        Renty.loginUser = null;
        
        this.setVisible(false);
        
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JLabel date;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton rentBtn;
    private javax.swing.JButton reportBtn;
    private javax.swing.JButton settingBtn;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
