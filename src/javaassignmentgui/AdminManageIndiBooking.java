/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignmentgui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class AdminManageIndiBooking extends javax.swing.JFrame {
    
    AdminManageBookings amb = new AdminManageBookings();
    
    /**
     * Creates new form AdminManageIndiBooking
     */
    public AdminManageIndiBooking() {
        initComponents();
        setLabels();
        
        // set date
        date.setText(Renty.toDate());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        daysBookedLabel = new javax.swing.JLabel();
        totalPaymentLabel = new javax.swing.JLabel();
        paymentMethodLabel = new javax.swing.JLabel();
        pickupAddInput = new javax.swing.JTextField();
        returnAddInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewInput = new javax.swing.JTextArea();
        deleteBtn = new javax.swing.JButton();
        returnDateLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        carLabel = new javax.swing.JLabel();
        carPlateLabel = new javax.swing.JLabel();
        bookingDateLabel = new javax.swing.JLabel();
        pickupDateLabel = new javax.swing.JLabel();
        modifyBtn = new javax.swing.JButton();
        approveBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bookingIdLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
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
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel4.setText("Contact :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(820, 50, 110, 30);

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setText("Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 50, 110, 30);

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel5.setText("Email :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(460, 50, 110, 30);

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel6.setText("Car :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 150, 110, 30);

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel7.setText("Car Plate:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 200, 110, 30);

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel8.setText("Booking Date:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 310, 143, 30);

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel9.setText("Pickup Address:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(460, 150, 143, 30);

        jLabel12.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel12.setText("Return Address:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(460, 200, 143, 30);

        jLabel13.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel13.setText("Pickup Date:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 360, 143, 30);

        jLabel14.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel14.setText("Return Date:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 410, 143, 30);

        jLabel15.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel15.setText("Days Booked:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(460, 310, 121, 28);

        jLabel16.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel16.setText("Total Payment:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(460, 360, 135, 30);

        jLabel17.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel17.setText("Payment Method:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(460, 410, 168, 30);

        jLabel18.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel18.setText("Review:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(830, 310, 73, 28);

        jLabel19.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel19.setText("Customer Information");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(28, 11, 195, 30);

        jLabel20.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel20.setText("Car Information");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 110, 140, 30);

        jLabel21.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel21.setText("Booking Information");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(30, 270, 180, 30);

        daysBookedLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        daysBookedLabel.setText("value");
        jPanel1.add(daysBookedLabel);
        daysBookedLabel.setBounds(630, 310, 160, 30);

        totalPaymentLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        totalPaymentLabel.setText("value");
        jPanel1.add(totalPaymentLabel);
        totalPaymentLabel.setBounds(630, 360, 160, 30);

        paymentMethodLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        paymentMethodLabel.setText("value");
        jPanel1.add(paymentMethodLabel);
        paymentMethodLabel.setBounds(630, 410, 160, 30);

        pickupAddInput.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jPanel1.add(pickupAddInput);
        pickupAddInput.setBounds(620, 140, 610, 40);

        returnAddInput.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        returnAddInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnAddInputActionPerformed(evt);
            }
        });
        jPanel1.add(returnAddInput);
        returnAddInput.setBounds(620, 190, 610, 40);

        reviewInput.setColumns(20);
        reviewInput.setRows(5);
        jScrollPane1.setViewportView(reviewInput);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(930, 310, 300, 110);

        deleteBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn);
        deleteBtn.setBounds(440, 500, 170, 30);

        returnDateLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        returnDateLabel.setText("value");
        jPanel1.add(returnDateLabel);
        returnDateLabel.setBounds(170, 410, 180, 30);

        nameLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        nameLabel.setText("value");
        jPanel1.add(nameLabel);
        nameLabel.setBounds(170, 50, 200, 30);

        emailLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        emailLabel.setText("value");
        jPanel1.add(emailLabel);
        emailLabel.setBounds(630, 50, 180, 30);

        contactLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        contactLabel.setText("value");
        jPanel1.add(contactLabel);
        contactLabel.setBounds(930, 50, 180, 30);

        carLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        carLabel.setText("value");
        jPanel1.add(carLabel);
        carLabel.setBounds(170, 150, 180, 30);

        carPlateLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        carPlateLabel.setText("value");
        jPanel1.add(carPlateLabel);
        carPlateLabel.setBounds(170, 200, 180, 30);

        bookingDateLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        bookingDateLabel.setText("value");
        jPanel1.add(bookingDateLabel);
        bookingDateLabel.setBounds(170, 310, 180, 30);

        pickupDateLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        pickupDateLabel.setText("value");
        jPanel1.add(pickupDateLabel);
        pickupDateLabel.setBounds(170, 360, 180, 40);

        modifyBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        modifyBtn.setText("Modify");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(modifyBtn);
        modifyBtn.setBounds(630, 500, 170, 30);

        approveBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        approveBtn.setText("Approve");
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(approveBtn);
        approveBtn.setBounds(630, 460, 170, 30);

        rejectBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });
        jPanel1.add(rejectBtn);
        rejectBtn.setBounds(440, 460, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 110, 1240, 540);

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Booking ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 70, 110, 30);

        bookingIdLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        bookingIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookingIdLabel.setText("booking_id");
        getContentPane().add(bookingIdLabel);
        bookingIdLabel.setBounds(640, 70, 160, 30);

        backBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(40, 70, 110, 30);

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
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1300, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnAddInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnAddInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnAddInputActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        AdminManageBookings amb = new AdminManageBookings();
        amb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
        try {
            // TODO add your handling code here:
            amb.chosenBooking.setStatus("Approved");
            DataIO.WriteToText();
            setLabels();
            JOptionPane.showMessageDialog(null, "Booking Approved!", "Success!", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageIndiBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_approveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            DataIO.bookings.remove(amb.chosenBooking);
            DataIO.WriteToText();
            setLabels();
            JOptionPane.showMessageDialog(null, "Booking Deleted!", "Success!", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageIndiBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        try {
            // TODO add your handling code here:
            amb.chosenBooking.setStatus("Rejected");
            DataIO.WriteToText();
            setLabels();
            JOptionPane.showMessageDialog(null, "Booking Rejected!", "Denied!", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageIndiBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        try {
            // TODO add your handling code here:
            String updatedPickupAdd = pickupAddInput.getText();
            String updatedReturnAdd = returnAddInput.getText();
            String updatedReview = reviewInput.getText();
            
            if (updatedPickupAdd.equals("") || updatedReturnAdd.equals("") || updatedReview.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            amb.chosenBooking.setPickupAdd(updatedPickupAdd);
            amb.chosenBooking.setReturnAdd(updatedReturnAdd);
            amb.chosenBooking.setReview(updatedReview);
            
            DataIO.WriteToText();
            
            JOptionPane.showMessageDialog(null, "Booking Edited!", "Success!", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageIndiBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_modifyBtnActionPerformed

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
        DataIO.exitProgram();
    }//GEN-LAST:event_exitIconMouseClicked

    private void editCarNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCarNavMouseClicked

        try {
            this.setVisible(false);

            AdminEditCars aec = new AdminEditCars();
            aec.setVisible(true);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(AdminManageIndiBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(AdminManageIndiBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManageIndiBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManageIndiBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManageIndiBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminManageIndiBooking().setVisible(true);
            }
        });
    }
    
    public void setLabels() {
        // disable buttons by default
        rejectBtn.setVisible(false);
        approveBtn.setVisible(false);
        deleteBtn.setVisible(false);
        modifyBtn.setVisible(false);
        
        // getting values from previous selected booking
        bookingIdLabel.setText(amb.chosenBooking.getBookingID());
        
        // Pre fill values (user details)
        nameLabel.setText(amb.chosenBooking.getName());
        emailLabel.setText(amb.chosenBooking.getEmail());
        contactLabel.setText(amb.chosenBooking.getContact());
        
        // Pre fill values (car information)
        carLabel.setText(amb.chosenBooking.getCar());
        carPlateLabel.setText(amb.chosenBooking.getCarPlate());
        pickupAddInput.setText(amb.chosenBooking.getPickupAdd());
        returnAddInput.setText(amb.chosenBooking.getReturnAdd());
        
        // Pre fill values (booking details)
        bookingDateLabel.setText(amb.chosenBooking.getBookingDate());
        pickupDateLabel.setText(amb.chosenBooking.getPickupDate());
        returnDateLabel.setText(amb.chosenBooking.getReturnDate());
        
        daysBookedLabel.setText(String.valueOf(amb.chosenBooking.getDays()));
        totalPaymentLabel.setText(amb.chosenBooking.getTotal());
        paymentMethodLabel.setText(amb.chosenBooking.getPaymentMethod());
        
        
        // Review 
        reviewInput.setText(amb.chosenBooking.getReview());
        
        // Check which buttons to show
        if (amb.chosenBooking.getStatus().equals("Pending")) {
            rejectBtn.setVisible(true);
            approveBtn.setVisible(true);
        } else {
            deleteBtn.setVisible(true);
            modifyBtn.setVisible(true);
        } 

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton approveBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bookingDateLabel;
    private javax.swing.JLabel bookingIdLabel;
    private javax.swing.JLabel carLabel;
    private javax.swing.JLabel carPlateLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel date;
    private javax.swing.JLabel daysBookedLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel editCarNav;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel generateReportNav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel manageBookingNav;
    private javax.swing.JLabel manageCusNav;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel paymentMethodLabel;
    private javax.swing.JTextField pickupAddInput;
    private javax.swing.JLabel pickupDateLabel;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JTextField returnAddInput;
    private javax.swing.JLabel returnDateLabel;
    private javax.swing.JTextArea reviewInput;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel totalPaymentLabel;
    // End of variables declaration//GEN-END:variables
}
