/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignmentgui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class AdminEditCars extends javax.swing.JFrame {

    public static Car carChosen = null;
    
    /**
     * Creates new form AdminEditCars
     */
    public AdminEditCars() throws IOException {
        initComponents();
        showCars();
        
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
        carsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        actionButton = new javax.swing.JButton();
        BrandInput = new javax.swing.JTextField();
        ModelInput = new javax.swing.JTextField();
        ColorInput = new javax.swing.JTextField();
        SpeedInput = new javax.swing.JTextField();
        PaxInput = new javax.swing.JTextField();
        PriceInput = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        carPlateInput = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        actionLabel = new javax.swing.JLabel();
        switchActionButton = new javax.swing.JButton();
        someLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        topBar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        manageCusNav = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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
        getContentPane().setLayout(null);

        carsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Plate", "Brand", "Model", "Type", "Color", "Speed", "Pax", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carsTable.getTableHeader().setReorderingAllowed(false);
        carsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carsTable);
        if (carsTable.getColumnModel().getColumnCount() > 0) {
            carsTable.getColumnModel().getColumn(0).setResizable(false);
            carsTable.getColumnModel().getColumn(1).setResizable(false);
            carsTable.getColumnModel().getColumn(2).setResizable(false);
            carsTable.getColumnModel().getColumn(3).setResizable(false);
            carsTable.getColumnModel().getColumn(4).setResizable(false);
            carsTable.getColumnModel().getColumn(5).setResizable(false);
            carsTable.getColumnModel().getColumn(6).setResizable(false);
            carsTable.getColumnModel().getColumn(7).setResizable(false);
            carsTable.getColumnModel().getColumn(8).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 140, 850, 500);

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cars List");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 80, 130, 40);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel2.setText("km/h");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(270, 260, 50, 30);

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel8.setText("Brand:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 100, 80, 30);

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel9.setText("Model:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 140, 80, 30);

        jLabel10.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel10.setText("Type:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 180, 80, 30);

        jLabel11.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel11.setText("Color:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 220, 80, 30);

        jLabel12.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel12.setText("Status:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 380, 80, 30);

        jLabel13.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel13.setText("Speed:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 260, 80, 30);

        jLabel14.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel14.setText("Pax:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 300, 80, 30);

        jLabel15.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel15.setText("Price:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(20, 340, 80, 30);

        actionButton.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        actionButton.setText("Modify");
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonActionPerformed(evt);
            }
        });
        jPanel2.add(actionButton);
        actionButton.setBounds(20, 440, 300, 36);

        BrandInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        BrandInput.setForeground(new java.awt.Color(51, 51, 51));
        BrandInput.setToolTipText("");
        jPanel2.add(BrandInput);
        BrandInput.setBounds(100, 100, 220, 30);

        ModelInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        ModelInput.setForeground(new java.awt.Color(51, 51, 51));
        ModelInput.setToolTipText("");
        jPanel2.add(ModelInput);
        ModelInput.setBounds(100, 140, 220, 30);

        ColorInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        ColorInput.setForeground(new java.awt.Color(51, 51, 51));
        ColorInput.setToolTipText("");
        jPanel2.add(ColorInput);
        ColorInput.setBounds(100, 220, 220, 30);

        SpeedInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        SpeedInput.setForeground(new java.awt.Color(51, 51, 51));
        SpeedInput.setToolTipText("");
        jPanel2.add(SpeedInput);
        SpeedInput.setBounds(100, 260, 160, 30);

        PaxInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        PaxInput.setForeground(new java.awt.Color(51, 51, 51));
        PaxInput.setToolTipText("");
        jPanel2.add(PaxInput);
        PaxInput.setBounds(100, 300, 220, 30);

        PriceInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        PriceInput.setForeground(new java.awt.Color(51, 51, 51));
        PriceInput.setToolTipText("");
        jPanel2.add(PriceInput);
        PriceInput.setBounds(100, 340, 220, 30);

        typeComboBox.setBackground(new java.awt.Color(204, 204, 204));
        typeComboBox.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        typeComboBox.setForeground(new java.awt.Color(51, 51, 51));
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUV", "Sedan", "Hatchback", "Racing" }));
        jPanel2.add(typeComboBox);
        typeComboBox.setBounds(100, 180, 220, 30);

        jLabel16.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel16.setText("Car Plate:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(20, 60, 80, 30);

        carPlateInput.setBackground(new java.awt.Color(204, 204, 204));
        carPlateInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        carPlateInput.setForeground(new java.awt.Color(51, 51, 51));
        carPlateInput.setToolTipText("");
        carPlateInput.setEnabled(false);
        jPanel2.add(carPlateInput);
        carPlateInput.setBounds(100, 60, 220, 30);

        statusComboBox.setBackground(new java.awt.Color(204, 204, 204));
        statusComboBox.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        statusComboBox.setForeground(new java.awt.Color(51, 51, 51));
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));
        jPanel2.add(statusComboBox);
        statusComboBox.setBounds(100, 380, 220, 30);

        actionLabel.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        actionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actionLabel.setText("Modify Car");
        jPanel2.add(actionLabel);
        actionLabel.setBounds(0, 10, 340, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(920, 140, 340, 500);

        switchActionButton.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        switchActionButton.setText("Switch to Add Car");
        switchActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchActionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(switchActionButton);
        switchActionButton.setBounds(920, 100, 340, 30);

        someLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        someLabel.setForeground(new java.awt.Color(255, 255, 255));
        someLabel.setText("Search:");
        getContentPane().add(someLabel);
        someLabel.setBounds(40, 90, 70, 30);

        searchField.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(searchField);
        searchField.setBounds(130, 90, 220, 30);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/rent_smalllogo.png"))); // NOI18N

        manageCusNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        manageCusNav.setForeground(new java.awt.Color(255, 255, 255));
        manageCusNav.setText("Manage Customers");
        manageCusNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageCusNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageCusNavMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Settings");
        jLabel18.setToolTipText("");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
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
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
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
                        .addComponent(jLabel18)
                        .addComponent(date)
                        .addComponent(editCarNav)
                        .addComponent(generateReportNav)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        AdminBgMain.setBounds(-3, 0, 1300, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
        
        int row = carsTable.getSelectedRow();
        String car_plate = model.getValueAt(carsTable.convertRowIndexToModel(row), 0).toString();

        Car chosenCar = DataIO.chosenCar(car_plate);
        carChosen = chosenCar;
        
        carPlateInput.setText(carChosen.getCarPlate());
        BrandInput.setText(carChosen.getBrand());
        ModelInput.setText(carChosen.getModel());
        typeComboBox.setSelectedItem(carChosen.getType());
        ColorInput.setText(carChosen.getColor());
        SpeedInput.setText(carChosen.getSpeed());
        PaxInput.setText(String.valueOf(carChosen.getSeat()));
        PriceInput.setText(carChosen.getPrice());
        statusComboBox.setSelectedItem(carChosen.getStatus());
    }//GEN-LAST:event_carsTableMouseClicked

    private void switchActionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchActionButtonActionPerformed
        // TODO add your handling code here:
        String currentAction = actionLabel.getText();
        
        if (currentAction.equals("Add Car")) {
            switchActionButton.setText("Switch to Add Car");
            actionLabel.setText("Modify Car");
            actionButton.setText("Modify");
            clearFields();
            carPlateInput.setEnabled(false);
            
        } else {
            switchActionButton.setText("Switch to Modify Car");
            actionLabel.setText("Add Car");
            actionButton.setText("Add");
            clearFields();
            carPlateInput.setEnabled(true);
        }
    }//GEN-LAST:event_switchActionButtonActionPerformed

    private void actionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonActionPerformed
        // TODO add your handling code here:
        String getAction = actionButton.getText();
        
        if (getAction.equals("Modify")) {
            try {
                boolean safeData = checkFields();
                
                if (safeData) {
                    modifyCar();
                }
            } catch (IOException ex) {
                Logger.getLogger(AdminEditCars.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (getAction.equals("Add")) {
            try {
                boolean safeData = checkFields();
                
                if (safeData) {
                    addCar();
                }
            } catch (IOException ex) {
                Logger.getLogger(AdminEditCars.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_actionButtonActionPerformed

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

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminSettings as = new AdminSettings();
        as.setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        carsTable.setRowSorter(tr);
        
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
            java.util.logging.Logger.getLogger(AdminEditCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEditCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEditCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEditCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminEditCars().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AdminEditCars.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
    public boolean checkFields() throws IOException {
        
        boolean flag = true;
        
        String action = actionButton.getText();

        if (carChosen == null && action.equals("Modify")) {
            JOptionPane.showMessageDialog(null, "Please Select or enter a car plate to modify.", "Error!", JOptionPane.ERROR_MESSAGE);
            flag = false;
        }
        
        return flag;
    }
    
    public void modifyCar() {
        String brand = BrandInput.getText();
        String model = ModelInput.getText();
        String type = typeComboBox.getSelectedItem().toString();
        String color = ColorInput.getText();
        String speed = SpeedInput.getText();
        String pax = PaxInput.getText();
        String price = PriceInput.getText();
        String status = statusComboBox.getSelectedItem().toString();
        
        int paxInt = 0;
        
        if (brand.equals("") || model.equals("") || color.equals("") || speed.equals("") || pax.equals("") || price.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                paxInt = Integer.parseInt(pax);
                               
                carChosen.setBrand(brand);
                carChosen.setModel(model);
                carChosen.setType(type);
                carChosen.setColor(color);
                carChosen.setSpeed(speed + "km/h");
                carChosen.setSeat(paxInt);
                carChosen.setPrice("RM" + price);
                carChosen.setStatus(status);
                
                DataIO.WriteToText();
                clearFields();
                showCars();
                
                JOptionPane.showMessageDialog(null, "Car successfully modified!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid seat!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void addCar() {
        Car existingCar = null;
        
        String carPlate = carPlateInput.getText();
        String brand = BrandInput.getText();
        String model = ModelInput.getText();
        String type = typeComboBox.getSelectedItem().toString();
        String color = ColorInput.getText();
        String speed = SpeedInput.getText();
        String pax = PaxInput.getText();
        String price = PriceInput.getText();
        String status = statusComboBox.getSelectedItem().toString();
        
        int paxInt = 0;
        
        if (carPlate.equals("") || brand.equals("") || model.equals("") || color.equals("") || speed.equals("") || pax.equals("") || price.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                paxInt = Integer.parseInt(pax);
                int speedInt = Integer.parseInt(speed);
                int priceInt = Integer.parseInt(price);

                existingCar = DataIO.chosenCar(carPlate);
                
                if (existingCar == null) {
                    String newSpeed = speed + "km/h";
                    String newPrice = "RM" + price;

                    Car newCar = new Car(carPlate, brand, model, type, color, newSpeed, paxInt, newPrice, status);
                    DataIO.cars.add(newCar);
                    DataIO.WriteToText();
                    clearFields();
                    showCars();
                    
                    JOptionPane.showMessageDialog(null, "Car successfully added!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Car already exist!", "Add fail!", JOptionPane.ERROR_MESSAGE);
                }
 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid fields entered!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void clearFields() {
        carChosen = null;
        
        carPlateInput.setText("");
        BrandInput.setText("");
        ModelInput.setText("");
        typeComboBox.setSelectedItem("SUV");
        ColorInput.setText("");
        SpeedInput.setText("");
        PaxInput.setText("");
        PriceInput.setText("");
        statusComboBox.setSelectedItem("Available");
    }
    
    public void showCars() {
        DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
        
        if(model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        Object[] tableLines = DataIO.cars.toArray();

        for (Object tableLine : tableLines) {
           String line = tableLine.toString().trim();
           //split result with "|"
           String[] dataRow = line.split("\\|");
           
           // removing km/h
           int index = dataRow[5].indexOf("km/h");
           dataRow[5] = dataRow[5].substring(0, index);
           
           // removing RM
           dataRow[7] = dataRow[7].substring(2);
           
           //add result in table
           model.addRow(dataRow);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminBgMain;
    private javax.swing.JTextField BrandInput;
    private javax.swing.JTextField ColorInput;
    private javax.swing.JTextField ModelInput;
    private javax.swing.JTextField PaxInput;
    private javax.swing.JTextField PriceInput;
    private javax.swing.JTextField SpeedInput;
    private javax.swing.JButton actionButton;
    private javax.swing.JLabel actionLabel;
    private javax.swing.JTextField carPlateInput;
    private javax.swing.JTable carsTable;
    private javax.swing.JLabel date;
    private javax.swing.JLabel editCarNav;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel generateReportNav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel someLabel;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JButton switchActionButton;
    private javax.swing.JPanel topBar;
    private javax.swing.JComboBox<String> typeComboBox;
    // End of variables declaration//GEN-END:variables
}
