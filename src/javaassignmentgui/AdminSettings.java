package javaassignmentgui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AdminSettings extends javax.swing.JFrame {

    public static Admin adminChosen = null;
    
    public AdminSettings() {
        initComponents();
        superadminPanel.setVisible(false);
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

        jPanel2 = new javax.swing.JPanel();
        superadminPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        addAdminBtn = new javax.swing.JButton();
        deleteAdminBtn = new javax.swing.JButton();
        modifyAdminBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modifyUsernameField = new javax.swing.JTextField();
        modifyPassField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        advAdminBtn = new javax.swing.JButton();
        adminName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        viewPassword = new javax.swing.JButton();
        modifyPassword = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
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
        AdminBgMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        superadminPanel.setBackground(new java.awt.Color(153, 153, 153));
        superadminPanel.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Manage Admins");

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admin Username", "Admin Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminTable);
        if (adminTable.getColumnModel().getColumnCount() > 0) {
            adminTable.getColumnModel().getColumn(0).setResizable(false);
            adminTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addAdminBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        addAdminBtn.setText("Add");
        addAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminBtnActionPerformed(evt);
            }
        });

        deleteAdminBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        deleteAdminBtn.setText("Delete");
        deleteAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAdminBtnActionPerformed(evt);
            }
        });

        modifyAdminBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        modifyAdminBtn.setText("Modify");
        modifyAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyAdminBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Admin Username:");

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Admin Password:");

        modifyUsernameField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N

        modifyPassField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Search:");

        searchField.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout superadminPanelLayout = new javax.swing.GroupLayout(superadminPanel);
        superadminPanel.setLayout(superadminPanelLayout);
        superadminPanelLayout.setHorizontalGroup(
            superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superadminPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(superadminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(superadminPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(superadminPanelLayout.createSequentialGroup()
                                .addComponent(modifyAdminBtn)
                                .addGap(44, 44, 44)
                                .addComponent(addAdminBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteAdminBtn))
                            .addGroup(superadminPanelLayout.createSequentialGroup()
                                .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modifyPassField)
                                    .addGroup(superadminPanelLayout.createSequentialGroup()
                                        .addComponent(modifyUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(29, 29, 29))))
        );
        superadminPanelLayout.setVerticalGroup(
            superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superadminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(superadminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, superadminPanelLayout.createSequentialGroup()
                        .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(superadminPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, superadminPanelLayout.createSequentialGroup()
                        .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(modifyUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(modifyPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(superadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifyAdminBtn)
                            .addComponent(deleteAdminBtn)
                            .addComponent(addAdminBtn))
                        .addGap(43, 43, 43))))
        );

        jPanel2.add(superadminPanel);
        superadminPanel.setBounds(438, 78, 734, 292);

        advAdminBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        advAdminBtn.setText("Manage Admins");
        advAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advAdminBtnActionPerformed(evt);
            }
        });
        jPanel2.add(advAdminBtn);
        advAdminBtn.setBounds(438, 26, 168, 40);

        adminName.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        adminName.setText("<ADMIN NAME>");
        jPanel2.add(adminName);
        adminName.setBounds(139, 36, 169, 28);

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel6.setText("Change Password:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(34, 70, 161, 28);

        viewPassword.setFont(new java.awt.Font("Perpetua", 0, 21)); // NOI18N
        viewPassword.setText("View");
        viewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(viewPassword);
        viewPassword.setBounds(276, 112, 68, 25);

        modifyPassword.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        modifyPassword.setText("Modify");
        modifyPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(modifyPassword);
        modifyPassword.setBounds(34, 159, 110, 43);

        passwordField.setText("jPasswordField1");
        jPanel2.add(passwordField);
        passwordField.setBounds(34, 104, 236, 43);

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel5.setText("Welcome, ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(36, 36, 97, 28);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 90, 1240, 550);

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

        AdminBgMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/renty_logo.png"))); // NOI18N
        AdminBgMain.setText("jLabel1");
        getContentPane().add(AdminBgMain);
        AdminBgMain.setBounds(0, 0, 1300, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPasswordActionPerformed
        // TODO add your handling code here:
        if (viewPassword.getText().equals("View")) {
            passwordField.setEchoChar((char)0);
            viewPassword.setText("Hide");
        } else if (viewPassword.getText().equals("Hide")) {
            passwordField.setEchoChar('*');
            viewPassword.setText("View");
        }
        
    }//GEN-LAST:event_viewPasswordActionPerformed

    private void advAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advAdminBtnActionPerformed
        // TODO add your handling code here:
        
        String pass = "advadmin123";
        String result = JOptionPane.showInputDialog("Enter password to access Advanced admin:");
        
        if (pass.equals(result)) {
            JOptionPane.showMessageDialog(null, "You now have access to Advanced Admin!", "Success!", JOptionPane.INFORMATION_MESSAGE);
            superadminPanel.setVisible(true);
            advAdminBtn.setEnabled(false);
        } else if (!pass.equals(result)) {
            JOptionPane.showMessageDialog(null, "Password Error!", "Error!", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_advAdminBtnActionPerformed

    private void addAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminBtnActionPerformed
        // TODO add your handling code here:
        String username = modifyUsernameField.getText();
        String password = modifyPassField.getText();
        
        Admin adminToModify = DataIO.checkAdminUsername(username);
        
        if (adminToModify == null) {
            // check password
            if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "Username or Password can't be empty!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else if (username.length() < 4 || password.length() < 4) {
                JOptionPane.showMessageDialog(null, "Username or Password is too short, please select a longer username or password!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    Admin adminToAdd = new Admin(username, password);
                    
                    DataIO.admins.add(adminToAdd);
                    DataIO.WriteToText();
                    JOptionPane.showMessageDialog(null, "Successfully added admin.");
                    setLabels();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AdminSettings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "User already exist!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addAdminBtnActionPerformed

    private void deleteAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAdminBtnActionPerformed
        // TODO add your handling code here:
        String username = modifyUsernameField.getText();
        String password = modifyPassField.getText();
        
        Admin adminToDelete = DataIO.checkAdminUsername(username);
        
        if (adminToDelete != null) {
            // check password
            if (username.equals(adminToDelete.getUsername()) && password.equals(adminToDelete.getPassword())) {
                try {
                    DataIO.admins.remove(adminToDelete);
                    DataIO.WriteToText();
                    JOptionPane.showMessageDialog(null, "Successfully deleted admin.");
                    setLabels();
                    adminChosen = null;
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AdminSettings.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "User not found, please make sure details are matching before deleting!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "User not found!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteAdminBtnActionPerformed

    private void modifyAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyAdminBtnActionPerformed
        // TODO add your handling code here:
        String username = modifyUsernameField.getText().replace("\n", " ");
        String password = modifyPassField.getText().replace("\n", " ");
        
        Admin adminToModify = DataIO.checkAdminUsername(adminChosen.getUsername());
        
        // assuming cant change username
        if (!adminToModify.getUsername().equals(username)) {
            JOptionPane.showMessageDialog(null, "Username can't be changed, either delete the admin or add a new one!", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            // check password
            if (password.equals("")) {
                JOptionPane.showMessageDialog(null, "Password can't be empty!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else if (password.length() < 4) {
                JOptionPane.showMessageDialog(null, "Password is too short, please select a longer password!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    adminChosen.setPassword(password);

                    DataIO.WriteToText();
                    JOptionPane.showMessageDialog(null, "Successfully Updated Profile.");
                    setLabels();
                    adminChosen = null;

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AdminSettings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_modifyAdminBtnActionPerformed

    private void modifyPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyPasswordActionPerformed
        // TODO add your handling code here:
        String password = passwordField.getText();
        
        if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password cant be empty!", "Error!", JOptionPane.ERROR_MESSAGE);
        } else if (password.length() < 4) {
            JOptionPane.showMessageDialog(null, "Password is too short, please select a better password!", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Renty.loginAdmin.setPassword(password);
                
                DataIO.WriteToText();
                JOptionPane.showMessageDialog(null, "Successfully Updated Profile.");
                setLabels();
                adminChosen = null;
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminSettings.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_modifyPasswordActionPerformed

    private void adminTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTableMouseClicked
        // TODO add your handling code here:
        deleteAdminBtn.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel)adminTable.getModel();
        
        int row = adminTable.getSelectedRow();
        String adminUsername = model.getValueAt(adminTable.convertRowIndexToModel(row), 0).toString();
        
        adminChosen = DataIO.checkAdminUsername(adminUsername);
        
        modifyUsernameField.setText(adminChosen.getUsername());
        modifyPassField.setText(adminChosen.getPassword());
        
        if(Renty.loginAdmin.getUsername().equals(adminChosen.getUsername())) {
            deleteAdminBtn.setEnabled(false);
        }
    }//GEN-LAST:event_adminTableMouseClicked

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
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)adminTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        adminTable.setRowSorter(tr);
        
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
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSettings().setVisible(true);
            }
        });
    }
    
    public void showAdmins() {
        DefaultTableModel model = (DefaultTableModel)adminTable.getModel();
        
        if(model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        Object[] tableLines = DataIO.admins.toArray();

        for (Object tableLine : tableLines) {
           String line = tableLine.toString().trim();
           //split result with "|"
           String[] dataRow = line.split("\\|");
           //add result in table
           model.addRow(dataRow);
        }
    }
    
    public void setLabels() {
        // set admin username
        String adminname = Renty.loginAdmin.getUsername();
        String sentence = adminname + " !";
        adminName.setText(sentence);
        
        // set original password
        passwordField.setText(Renty.loginAdmin.getPassword());
        
        // show table (adv admin)
        showAdmins();
        
        // clear adv admin fields
        modifyUsernameField.setText("");
        modifyPassField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminBgMain;
    private javax.swing.JButton addAdminBtn;
    private javax.swing.JLabel adminName;
    private javax.swing.JTable adminTable;
    private javax.swing.JButton advAdminBtn;
    private javax.swing.JLabel date;
    private javax.swing.JButton deleteAdminBtn;
    private javax.swing.JLabel editCarNav;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel generateReportNav;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel manageBookingNav;
    private javax.swing.JLabel manageCusNav;
    private javax.swing.JButton modifyAdminBtn;
    private javax.swing.JTextField modifyPassField;
    private javax.swing.JButton modifyPassword;
    private javax.swing.JTextField modifyUsernameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel superadminPanel;
    private javax.swing.JPanel topBar;
    private javax.swing.JButton viewPassword;
    // End of variables declaration//GEN-END:variables
}
