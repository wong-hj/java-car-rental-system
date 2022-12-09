package javaassignmentgui;

import java.awt.print.PrinterException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FeedbackReport extends javax.swing.JFrame {

    /**
     * Creates new form FeedbackReport
     */
    public FeedbackReport() {
        initComponents();
        generateReport();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        printReportBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportTxt = new javax.swing.JTextArea();
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
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        backBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(30, 80, 120, 30);

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Feedback Report");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 80, 360, 50);

        printReportBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        printReportBtn.setText("Print Report");
        printReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReportBtnActionPerformed(evt);
            }
        });
        getContentPane().add(printReportBtn);
        printReportBtn.setBounds(570, 620, 160, 40);

        reportTxt.setEditable(false);
        reportTxt.setColumns(20);
        reportTxt.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        reportTxt.setRows(5);
        jScrollPane1.setViewportView(reportTxt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 170, 730, 420);

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
        jLabel11.setToolTipText("");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

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
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editCarNav)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageBookingNav)
                .addGap(33, 33, 33)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(manageCusNav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateReportNav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitIcon)
                .addGap(36, 36, 36))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitIcon)
                    .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(date)
                        .addComponent(editCarNav)
                        .addComponent(generateReportNav)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(manageBookingNav)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageCusNav)
                .addGap(15, 15, 15))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/renty_logo.png"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1300, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminGenerateReport agr = new AdminGenerateReport();
        agr.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void printReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReportBtnActionPerformed

        try {
            // TODO add your handling code here:
            if (reportTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please generate Report first.", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                reportTxt.print();
            }
        } catch (PrinterException ex) {
            Logger.getLogger(BookingReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printReportBtnActionPerformed

    private void manageCusNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCusNavMouseClicked
        this.setVisible(false);

        AdminManageCustomers amc = new AdminManageCustomers();
        amc.setVisible(true);
    }//GEN-LAST:event_manageCusNavMouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked

        this.setVisible(false);
        DataIO.logout();
    }//GEN-LAST:event_exitIconMouseClicked

    private void editCarNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCarNavMouseClicked
        try {
            this.setVisible(false);

            AdminEditCars aec = new AdminEditCars();
            aec.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminSettings.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminSettings as = new AdminSettings();
        as.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(FeedbackReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackReport().setVisible(true);
            }
        });
    }
    
    public void generateReport() {
        reportTxt.setText("");
        
        reportTxt.append(
        "\t\t Feedback Analysis \n\n"
        );
        
        for (Car car: DataIO.cars) {
            String carPlate = car.getCarPlate();
            
            // print car name and car plate
            reportTxt.append(
            car.getCarPlate() + " " + car.getCar() + "\n"
            );
            // check for reviews
            for (Booking book: DataIO.bookings) {
                if (book.getCarPlate().equals(carPlate)) {
                    if (!book.getReview().equals("-")) {
                        // dont print if no reviews
                        reportTxt.append(
                        book.getName() + " - " + book.getReview() + "\n"
                        );
                    }
                }
            }
            
            // space a line for next car's reviews
            reportTxt.append(
            "\n"
            );
            
        }
        
        reportTxt.append(
            "\n----------------------------------------------------------\n" +

            "End of report!\n" +
            "Generated on " + Renty.toDate()
        );
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel date;
    private javax.swing.JLabel editCarNav;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel generateReportNav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel manageBookingNav;
    private javax.swing.JLabel manageCusNav;
    private javax.swing.JButton printReportBtn;
    private javax.swing.JTextArea reportTxt;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
