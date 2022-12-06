/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignmentgui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bryan
 */
public class AdminManageCustomers extends javax.swing.JFrame {

    public static Customer chosenCustomer = null;
    
    /**
     * Creates new form AdminManageCustomers
     */
    public AdminManageCustomers() {
        initComponents();
        clearLabels();
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        approveBtn = new javax.swing.JButton();
        denyBtn = new javax.swing.JButton();
        awawdawd = new javax.swing.JLabel();
        awdawdadaw = new javax.swing.JLabel();
        wadwadadawdaw = new javax.swing.JLabel();
        awdawdawdaw = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        addressLabel = new javax.swing.JTextArea();
        somelabel1 = new javax.swing.JLabel();
        somelabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
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

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Gender", "Age", "Contact", "Email", "Address", "Approval"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);
        if (customerTable.getColumnModel().getColumnCount() > 0) {
            customerTable.getColumnModel().getColumn(0).setResizable(false);
            customerTable.getColumnModel().getColumn(1).setResizable(false);
            customerTable.getColumnModel().getColumn(2).setResizable(false);
            customerTable.getColumnModel().getColumn(3).setResizable(false);
            customerTable.getColumnModel().getColumn(4).setResizable(false);
            customerTable.getColumnModel().getColumn(5).setResizable(false);
            customerTable.getColumnModel().getColumn(6).setResizable(false);
            customerTable.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 120, 910, 540);

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Customer");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 70, 290, 40);

        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Currently managing:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 328, 30);

        deleteBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn);
        deleteBtn.setBounds(86, 492, 140, 40);

        approveBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        approveBtn.setText("Approve");
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(approveBtn);
        approveBtn.setBounds(12, 440, 136, 40);

        denyBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        denyBtn.setText("Deny");
        denyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyBtnActionPerformed(evt);
            }
        });
        jPanel2.add(denyBtn);
        denyBtn.setBounds(166, 440, 130, 40);

        awawdawd.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        awawdawd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        awawdawd.setText("Age:");
        jPanel2.add(awawdawd);
        awawdawd.setBounds(12, 144, 126, 30);

        awdawdadaw.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        awdawdadaw.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        awdawdadaw.setText("Contact:");
        jPanel2.add(awdawdadaw);
        awdawdadaw.setBounds(12, 192, 126, 30);

        wadwadadawdaw.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        wadwadadawdaw.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        wadwadadawdaw.setText("Email:");
        jPanel2.add(wadwadadawdaw);
        wadwadadawdaw.setBounds(12, 240, 126, 30);

        awdawdawdaw.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        awdawdawdaw.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        awdawdawdaw.setText("Address:");
        jPanel2.add(awdawdawdaw);
        awdawdawdaw.setBounds(12, 288, 126, 30);

        usernameLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("username");
        jPanel2.add(usernameLabel);
        usernameLabel.setBounds(6, 47, 292, 30);

        genderLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(genderLabel);
        genderLabel.setBounds(90, 90, 190, 30);

        ageLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(ageLabel);
        ageLabel.setBounds(70, 140, 210, 30);

        contactLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        contactLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(contactLabel);
        contactLabel.setBounds(100, 190, 180, 30);

        emailLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(emailLabel);
        emailLabel.setBounds(80, 240, 200, 30);

        addressLabel.setEditable(false);
        addressLabel.setColumns(20);
        addressLabel.setRows(5);
        jScrollPane3.setViewportView(addressLabel);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 320, 280, 110);

        somelabel1.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        somelabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        somelabel1.setText("Gender:");
        jPanel2.add(somelabel1);
        somelabel1.setBounds(12, 95, 126, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(960, 120, 310, 540);

        somelabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        somelabel.setForeground(new java.awt.Color(255, 255, 255));
        somelabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        somelabel.setText("Search:");
        getContentPane().add(somelabel);
        somelabel.setBounds(30, 80, 70, 30);

        searchField.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(searchField);
        searchField.setBounds(110, 80, 210, 30);

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

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (chosenCustomer != null) {
            try {
                // TODO add your handling code here:
                DataIO.customers.remove(chosenCustomer);
                DataIO.WriteToText();
                JOptionPane.showMessageDialog(null, "Customer Deleted!", "Info", JOptionPane.INFORMATION_MESSAGE);
                clearLabels();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        // TODO add your handling code here:
        
        approveBtn.setEnabled(false);
        denyBtn.setEnabled(false);
        
        DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
        
        int row = customerTable.getSelectedRow();
        String username = model.getValueAt(customerTable.convertRowIndexToModel(row), 0).toString();
        
        
        Customer chosenCus = DataIO.checkUsername(username);
        chosenCustomer = chosenCus;
        
        usernameLabel.setText(chosenCustomer.getUsername());
        genderLabel.setText(chosenCustomer.getGender());
        ageLabel.setText(String.valueOf(chosenCustomer.getAge()));
        contactLabel.setText(chosenCustomer.getPhoneNum());
        emailLabel.setText(chosenCustomer.getEmail());
        addressLabel.setText(chosenCustomer.getAddress());
        
        if (chosenCustomer.getApproval() == 1) {
            denyBtn.setEnabled(true);
        } else if (chosenCustomer.getApproval() == 0) {
            approveBtn.setEnabled(true);
        } else {}
    }//GEN-LAST:event_customerTableMouseClicked

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
        if (chosenCustomer != null) {
            try {
                // TODO add your handling code here:
                chosenCustomer.setApproval(1);
                DataIO.WriteToText();
                clearLabels();
                JOptionPane.showMessageDialog(null, "Customer approved!", "Info", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
        
    }//GEN-LAST:event_approveBtnActionPerformed

    private void denyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyBtnActionPerformed
        if (chosenCustomer != null) {
            try {
                // TODO add your handling code here:
                chosenCustomer.setApproval(0);
                DataIO.WriteToText();
                clearLabels();
                JOptionPane.showMessageDialog(null, "Customer denied!", "Info", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_denyBtnActionPerformed

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

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        customerTable.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(searchField.getText()));
    }//GEN-LAST:event_searchFieldKeyReleased

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
            java.util.logging.Logger.getLogger(AdminManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminManageCustomers().setVisible(true);
            }
        });
    }
    
    public void clearLabels() {
        
        // remove chosen
        chosenCustomer = null;
        
        // show table
        showCustomers();
        
        // clear fields
        usernameLabel.setText("");
        genderLabel.setText("");
        ageLabel.setText("");
        contactLabel.setText("");
        emailLabel.setText("");
        addressLabel.setText("");
        
        // return buttons to original state
        approveBtn.setEnabled(true);
        denyBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
    }
    
    public void showCustomers() {
        DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
        
        if(model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        Object[] tableLines = DataIO.customers.toArray();

        for (Object tableLine : tableLines) {
           String line = tableLine.toString().trim();
           //split result with "|"
           String[] dataRow = line.split("\\|");
           
           // replace password with *
           dataRow[1] = "*****";
           
           //add result in table
           model.addRow(dataRow);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextArea addressLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton approveBtn;
    private javax.swing.JLabel awawdawd;
    private javax.swing.JLabel awdawdadaw;
    private javax.swing.JLabel awdawdawdaw;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel date;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton denyBtn;
    private javax.swing.JLabel editCarNav;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel generateReportNav;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel manageBookingNav;
    private javax.swing.JLabel manageCusNav;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel somelabel;
    private javax.swing.JLabel somelabel1;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel wadwadadawdaw;
    // End of variables declaration//GEN-END:variables
}
