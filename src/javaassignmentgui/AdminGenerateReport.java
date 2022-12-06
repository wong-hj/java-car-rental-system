/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignmentgui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminGenerateReport extends javax.swing.JFrame {

    public AdminGenerateReport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageCusNav = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        editCarNav = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        manageBookingNav = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        generateReportNav = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bookingReport = new javax.swing.JButton();
        carsReport = new javax.swing.JButton();
        customerReport = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 700));
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/rent_smalllogo.png"))); // NOI18N

        manageCusNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        manageCusNav.setForeground(new java.awt.Color(255, 255, 255));
        manageCusNav.setText("Manage Customers");
        manageCusNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageCusNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageCusNavMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Settings");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        date.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date");
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit.png"))); // NOI18N
        exitIcon.setToolTipText("Exit");
        exitIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });

        editCarNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        editCarNav.setForeground(new java.awt.Color(255, 255, 255));
        editCarNav.setText("Add/Edit Cars");
        editCarNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editCarNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCarNavMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");

        manageBookingNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        manageBookingNav.setForeground(new java.awt.Color(255, 255, 255));
        manageBookingNav.setText("Manage Bookings");
        manageBookingNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageBookingNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBookingNavMouseClicked(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setToolTipText("");

        generateReportNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        generateReportNav.setForeground(new java.awt.Color(255, 255, 255));
        generateReportNav.setText("Generate Report");
        generateReportNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateReportNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateReportNavMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generateReportNav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editCarNav)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageCusNav)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageBookingNav)
                .addGap(131, 131, 131)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitIcon)
                .addGap(38, 38, 38))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(topBarLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(manageCusNav)
                                    .addComponent(jLabel11)
                                    .addComponent(editCarNav)))))
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(topBarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exitIcon)
                                    .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(date)
                                        .addComponent(manageBookingNav))))
                            .addGroup(topBarLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(generateReportNav)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel1.setText("Generate Report");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 150, 350, 50);

        bookingReport.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        bookingReport.setText("Booking Report");
        bookingReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingReportActionPerformed(evt);
            }
        });
        getContentPane().add(bookingReport);
        bookingReport.setBounds(890, 310, 170, 60);

        carsReport.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        carsReport.setText("Cars Report");
        carsReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carsReportMouseClicked(evt);
            }
        });
        carsReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsReportActionPerformed(evt);
            }
        });
        getContentPane().add(carsReport);
        carsReport.setBounds(220, 310, 180, 60);

        customerReport.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        customerReport.setText("Customer Report");
        customerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerReportActionPerformed(evt);
            }
        });
        getContentPane().add(customerReport);
        customerReport.setBounds(550, 310, 190, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/renty_logo.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1300, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageCusNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCusNavMouseClicked
        this.setVisible(false);

        AdminManageCustomers amc = new AdminManageCustomers();
        amc.setVisible(true);
    }//GEN-LAST:event_manageCusNavMouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked

        DataIO.exitProgram();
    }//GEN-LAST:event_exitIconMouseClicked

    private void editCarNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCarNavMouseClicked

        try {
            this.setVisible(false);
            
            AdminEditCars aec = new AdminEditCars();
            aec.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminGenerateReport.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_editCarNavMouseClicked

    private void manageBookingNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBookingNavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminManageBookings amb = new AdminManageBookings();
        amb.setVisible(true);
    }//GEN-LAST:event_manageBookingNavMouseClicked

    private void generateReportNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateReportNavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminGenerateReport agr = new AdminGenerateReport();
        agr.setVisible(true);
    }//GEN-LAST:event_generateReportNavMouseClicked

    private void carsReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carsReportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carsReportMouseClicked

    private void carsReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsReportActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CarsReport cr = new CarsReport();
        cr.setVisible(true);
    }//GEN-LAST:event_carsReportActionPerformed

    private void customerReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerReportActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CustomerReport cr = new CustomerReport();
        cr.setVisible(true);
    }//GEN-LAST:event_customerReportActionPerformed

    private void bookingReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingReportActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BookingReport br = new BookingReport();
        br.setVisible(true);
    }//GEN-LAST:event_bookingReportActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGenerateReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton bookingReport;
    private javax.swing.JButton carsReport;
    private javax.swing.JButton customerReport;
    private javax.swing.JLabel date;
    private javax.swing.JLabel editCarNav;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel generateReportNav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel manageBookingNav;
    private javax.swing.JLabel manageCusNav;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
