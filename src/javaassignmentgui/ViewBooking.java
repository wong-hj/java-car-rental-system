/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignmentgui;

import java.awt.Color;
import java.awt.List;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Horngjun
 */
public class ViewBooking extends javax.swing.JFrame {
    
    

    /**
     * Creates new form RentCar
     */
    public ViewBooking() {
        initComponents();
        bookingTable.setDefaultEditor(Object.class, null);
        date.setText(Renty.toDate());
        
        readBookingTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jButton1 = new javax.swing.JButton();
        topBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        checkDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        receiptTxt = new javax.swing.JTextArea();
        printBtn = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 770));
        setSize(new java.awt.Dimension(1500, 770));
        getContentPane().setLayout(null);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));
        topBar.setPreferredSize(new java.awt.Dimension(1300, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/rent_smalllogo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Main Menu");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Booking History");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        date.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("date");

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit.png"))); // NOI18N
        exitIcon.setToolTipText("Exit");
        exitIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });

        checkDate.setText("jLabel6");

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(88, 88, 88)
                .addComponent(checkDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 751, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitIcon)
                .addGap(34, 34, 34))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(date)
                        .addComponent(jLabel5)
                        .addComponent(checkDate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1500, 60);

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Booking History");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 260, 50);

        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BID", "Contact", "Email", "Car", "Car Plate", "Booking Date", "Pick Up Date", "Return Date", "Days", "Total Price", "Payment Method", "Review"
            }
        ));
        bookingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookingTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 1040, 550);

        searchField.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText(" Search...");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(searchField);
        searchField.setBounds(750, 70, 310, 40);

        receiptTxt.setColumns(20);
        receiptTxt.setRows(5);
        jScrollPane2.setViewportView(receiptTxt);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1080, 70, 390, 600);

        printBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        printBtn.setText("Print");
        printBtn.setEnabled(false);
        getContentPane().add(printBtn);
        printBtn.setBounds(1240, 680, 100, 40);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        backgroundImage.setMinimumSize(new java.awt.Dimension(1300, 700));
        backgroundImage.setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(-3, -4, 1510, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        DefaultTableModel model = (DefaultTableModel)bookingTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        bookingTable.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(searchField.getText()));
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        if(searchField.getText().equals(" Search...")){
            searchField.setText("");
            searchField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        if(searchField.getText().equals("")){
            searchField.setText(" Search...");
            searchField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_searchFieldFocusLost

    
    private void bookingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingTableMouseClicked
        receiptTxt.setText("");
        
        DefaultTableModel model = (DefaultTableModel)bookingTable.getModel();
        int selectedRowIndex = bookingTable.getSelectedRow();
        
        String bookid = model.getValueAt(selectedRowIndex, 0).toString();
        
        Booking chosenBooking = DataIO.chosenBooking(bookid);

        receiptTxt.append(
                "\t\t Receipt \n\n" +

                "Booking ID: \t\t" + chosenBooking.getBookingID() + "\n" +
                "\n--------------------------------------------------------------------------------------------\n" +
                "Name:\t\t" + chosenBooking.getName() + "\n\n" + 
                "Contact:\t\t" + chosenBooking.getContact() + "\n\n" + 
                "Email:\t\t" + chosenBooking.getEmail() + "\n" + 
                "\n--------------------------------------------------------------------------------------------\n" +
                "Car:\t\t" + chosenBooking.getCarPlate() + " - " + chosenBooking.getCar() + "\n\n" + 
                "Pick Up Address:\t" + chosenBooking.getPickupAdd() + "\n\n" + 
                "Return Address:\t" + chosenBooking.getReturnAdd() + "\n" + 
                "\n--------------------------------------------------------------------------------------------\n" +
                "Booking Date:\t\t" + chosenBooking.getBookingDate() + "\n\n" + 
                "Pick Up Date:\t\t" + chosenBooking.getPickupDate() + "\n\n" + 
                "Return Date:\t\t" + chosenBooking.getReturnDate() + "\n\n" + 
                "Days:\t\t" + chosenBooking.getDays() + "\n" + 
                "\n--------------------------------------------------------------------------------------------\n" +
                      
                "Payment Method:\t" + chosenBooking.getPaymentMethod() + "\n\n" + 
                "Payment Details:\t" + chosenBooking.getPaymentDetails() + "\n\n" + 
                "Total:\t\t" + chosenBooking.getTotal() + "\n\n" + 
                
                "\tThank you, Please come again!\n" +
                "\tGenerated on " + Renty.toDate()
        );

        printBtn.setEnabled(true);
        
    }//GEN-LAST:event_bookingTableMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        try {
            DataIO.WriteToText();
            System.exit(0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitIconMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBooking().setVisible(true);
            }
        });
    }
    
    public void readBookingTable(){
       
        
        DefaultTableModel model = (DefaultTableModel)bookingTable.getModel();
        
        if(model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        ArrayList<Booking> userBookings = DataIO.userBookings(Renty.loginUser.getUsername());
        
        Object[] tableLines = userBookings.toArray();

        for (Object tableLine : tableLines) {
           String line = tableLine.toString().trim();
           //split result with "|"
           String[] dataRow = line.split("\\|");
           //add result in table
           Vector row = new Vector();
           
           int[] Rows = new int[] {0, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 15};
           for(int Index : Rows){
               row.add(dataRow[Index]);
           }
           model.addRow(row);
           
        }
        
    }
    
    
        
                
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTable bookingTable;
    private javax.swing.JLabel checkDate;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextArea receiptTxt;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
