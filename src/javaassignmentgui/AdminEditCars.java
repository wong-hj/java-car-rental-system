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
import javax.swing.table.DefaultTableModel;

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        userBtn = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
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
        actionLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        carPlateInput = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        switchActionButton = new javax.swing.JButton();
        AdminBgMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 700));
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/renty_smalllogo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Panel");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add/Edit Cars");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        userBtn.setBackground(new java.awt.Color(255, 255, 255));
        userBtn.setForeground(new java.awt.Color(255, 255, 255));
        userBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/user.png"))); // NOI18N
        userBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        date.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("08/04/2002");
        date.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manage Bookings");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manage Customers");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userBtn)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(date)
                                .addComponent(jLabel6))
                            .addComponent(userBtn)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1300, 70);

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
        actionButton.setBounds(20, 440, 300, 30);

        BrandInput.setBackground(new java.awt.Color(204, 204, 204));
        BrandInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        BrandInput.setForeground(new java.awt.Color(51, 51, 51));
        BrandInput.setToolTipText("");
        jPanel2.add(BrandInput);
        BrandInput.setBounds(100, 100, 220, 30);

        ModelInput.setBackground(new java.awt.Color(204, 204, 204));
        ModelInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        ModelInput.setForeground(new java.awt.Color(51, 51, 51));
        ModelInput.setToolTipText("");
        jPanel2.add(ModelInput);
        ModelInput.setBounds(100, 140, 220, 30);

        ColorInput.setBackground(new java.awt.Color(204, 204, 204));
        ColorInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        ColorInput.setForeground(new java.awt.Color(51, 51, 51));
        ColorInput.setToolTipText("");
        jPanel2.add(ColorInput);
        ColorInput.setBounds(100, 220, 220, 30);

        SpeedInput.setBackground(new java.awt.Color(204, 204, 204));
        SpeedInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        SpeedInput.setForeground(new java.awt.Color(51, 51, 51));
        SpeedInput.setToolTipText("");
        jPanel2.add(SpeedInput);
        SpeedInput.setBounds(100, 260, 160, 30);

        PaxInput.setBackground(new java.awt.Color(204, 204, 204));
        PaxInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        PaxInput.setForeground(new java.awt.Color(51, 51, 51));
        PaxInput.setToolTipText("");
        jPanel2.add(PaxInput);
        PaxInput.setBounds(100, 300, 220, 30);

        PriceInput.setBackground(new java.awt.Color(204, 204, 204));
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

        actionLabel.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        actionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actionLabel.setText("Modify Car");
        jPanel2.add(actionLabel);
        actionLabel.setBounds(0, 10, 340, 30);

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

        AdminBgMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/renty_logo.png"))); // NOI18N
        AdminBgMain.setText("jLabel1");
        getContentPane().add(AdminBgMain);
        AdminBgMain.setBounds(-3, 0, 1300, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
        
        String car_plate = model.getValueAt(carsTable.getSelectedRow(), 0).toString();
        String car_brand = model.getValueAt(carsTable.getSelectedRow(), 1).toString();
        String car_model = model.getValueAt(carsTable.getSelectedRow(), 2).toString();
        String car_type = model.getValueAt(carsTable.getSelectedRow(), 3).toString();
        String car_color = model.getValueAt(carsTable.getSelectedRow(), 4).toString();
        String car_speed = model.getValueAt(carsTable.getSelectedRow(), 5).toString();
        String car_pax = model.getValueAt(carsTable.getSelectedRow(), 6).toString();
        String car_price = model.getValueAt(carsTable.getSelectedRow(), 7).toString();
        String car_status = model.getValueAt(carsTable.getSelectedRow(), 8).toString();
        
        Car chosenCar = DataIO.chosenCar(car_plate);
        carChosen = chosenCar;
        
        carPlateInput.setText(car_plate);
        BrandInput.setText(car_brand);
        ModelInput.setText(car_model);
        typeComboBox.setSelectedItem(car_type);
        ColorInput.setText(car_color);
        SpeedInput.setText(car_speed);
        PaxInput.setText(car_pax);
        PriceInput.setText(car_price);
        statusComboBox.setSelectedItem(car_status);
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
    
    public static boolean checkFields() throws IOException {
        
        boolean flag = true;

        if (carChosen.getCarPlate().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select or enter a car plate", "Error!", JOptionPane.ERROR_MESSAGE);
            flag = false;
        } else if (carChosen.getCarPlate().equals("") || carChosen.getBrand().equals("") || carChosen.getModel().equals("") || carChosen.getType().equals("") || carChosen.getColor().equals("") || carChosen.getSpeed().equals("") || carChosen.getPrice().equals("")) {
            // Check for null
            JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Error!", JOptionPane.ERROR_MESSAGE);
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

                existingCar = DataIO.chosenCar(carPlate);
                
                if (existingCar == null) {
                    carChosen.setCarPlate(carPlate);
                    carChosen.setBrand(brand);
                    carChosen.setModel(model);
                    carChosen.setType(type);
                    carChosen.setColor(color);
                    carChosen.setSpeed(speed + "km/h");
                    carChosen.setSeat(paxInt);
                    carChosen.setPrice("RM" + price);
                    carChosen.setStatus(status);

                    DataIO.cars.add(carChosen);
                    DataIO.WriteToText();
                    clearFields();
                    showCars();
                    
                    JOptionPane.showMessageDialog(null, "Car successfully added!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Car already exist!", "Add fail!", JOptionPane.ERROR_MESSAGE);
                }
 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid seat!", "Error!", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JButton switchActionButton;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel userBtn;
    // End of variables declaration//GEN-END:variables
}
