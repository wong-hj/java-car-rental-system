
package javaassignmentgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CarDetails extends javax.swing.JFrame {

    /**
     * Creates new form CarDetails
     */
    public CarDetails() {
        initComponents();
        String path = null;
        
        carTxt.setText(RentCar.carChosen.getBrand() + " " + RentCar.carChosen.getModel());
        priceTxt.setText(RentCar.carChosen.getPrice());
        colorTxt.setText(RentCar.carChosen.getColor());
        speedTxt.setText(RentCar.carChosen.getSpeed());
        typeTxt.setText(RentCar.carChosen.getType());
        seaterTxt.setText(String.valueOf(RentCar.carChosen.getSeat()));
        statusTxt.setText(RentCar.carChosen.getStatus());
        plateTxt.setText(RentCar.carChosen.getCarPlate());
        date.setText(Renty.toDate());
        
        String type = RentCar.carChosen.getType();
        
        if(type.equals("SUV")) {
            path = "src/resource/suv-car.png";
            
        } else if(type.equals("Sedan")) {
            path = "src/resource/sedan.png";
            
        } else if(type.equals("Hatchback")) {
            path = "src/resource/hatchback.png";
            
        } else {
            path = "src/resource/racing-car.png";
        }
        
        
        File resourcesDirectory = new File(path);
        typeImg.setIcon(new ImageIcon(resourcesDirectory.getAbsolutePath()));
        
        showReview();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        topBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        rentCarBtn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        typeImg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        carTxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        typeTxt = new javax.swing.JLabel();
        colorTxt = new javax.swing.JLabel();
        speedTxt = new javax.swing.JLabel();
        seaterTxt = new javax.swing.JLabel();
        plateTxt = new javax.swing.JLabel();
        statusTxt = new javax.swing.JLabel();
        priceTxt = new javax.swing.JLabel();
        bookCarBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));
        topBar.setPreferredSize(new java.awt.Dimension(1300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/rent_smalllogo.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Main Menu");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Car Details");
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

        rentCarBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rentCarBtn.setForeground(new java.awt.Color(255, 255, 255));
        rentCarBtn.setText("Rent Car");
        rentCarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rentCarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentCarBtnMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");

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
                .addComponent(rentCarBtn)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 590, Short.MAX_VALUE)
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
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(date)
                        .addComponent(rentCarBtn)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        jPanel1.setLayout(null);

        typeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/suv-car.png"))); // NOI18N
        jPanel1.add(typeImg);
        typeImg.setBounds(40, 50, 130, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 90, 210, 210);

        jPanel2.setLayout(null);

        carTxt.setFont(new java.awt.Font("Perpetua", 0, 40)); // NOI18N
        carTxt.setText("Lamborghini Urus");
        jPanel2.add(carTxt);
        carTxt.setBounds(23, 16, 673, 39);

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel4.setText("Type:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(23, 90, 68, 28);

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel5.setText("Color:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(23, 130, 58, 28);

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel6.setText("Speed:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(23, 170, 59, 28);

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel7.setText("Seater:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(433, 87, 61, 28);

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel8.setText("Car Plate:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(431, 127, 88, 28);

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel9.setText("Status:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(431, 170, 59, 28);

        typeTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        typeTxt.setText("SUV");
        jPanel2.add(typeTxt);
        typeTxt.setBounds(111, 90, 147, 28);

        colorTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        colorTxt.setText("Purple");
        jPanel2.add(colorTxt);
        colorTxt.setBounds(111, 130, 147, 28);

        speedTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        speedTxt.setText("100km/h");
        jPanel2.add(speedTxt);
        speedTxt.setBounds(111, 170, 147, 28);

        seaterTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        seaterTxt.setText("5");
        jPanel2.add(seaterTxt);
        seaterTxt.setBounds(552, 87, 89, 28);

        plateTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        plateTxt.setText("JUN 9991");
        jPanel2.add(plateTxt);
        plateTxt.setBounds(552, 127, 117, 28);

        statusTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        statusTxt.setText("Available");
        jPanel2.add(statusTxt);
        statusTxt.setBounds(552, 170, 117, 28);

        priceTxt.setFont(new java.awt.Font("Felix Titling", 0, 40)); // NOI18N
        priceTxt.setText("RM 100");
        jPanel2.add(priceTxt);
        priceTxt.setBounds(660, 10, 210, 48);

        bookCarBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        bookCarBtn.setText("Book Car Now");
        bookCarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(bookCarBtn);
        bookCarBtn.setBounds(706, 167, 158, 34);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(330, 90, 880, 210);

        jLabel17.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel17.setText("Reviews");

        reviewTxt.setColumns(20);
        reviewTxt.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        reviewTxt.setRows(5);
        reviewTxt.setEnabled(false);
        jScrollPane1.setViewportView(reviewTxt);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(100, 320, 1110, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 1310, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       this.setVisible(false);
        
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void bookCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCarBtnActionPerformed
        
        
        try {
            String days = countDays(RentCar.pickup_Date, RentCar.return_Date);
            String total = "RM " + calcTotal(days, RentCar.carChosen.getPrice());
            String review = "Pending";
            String status = "Pending";
            String LatestBID = DataIO.checkLatestBooking();
            String BID = "B" + (Integer.parseInt(LatestBID.substring(1,LatestBID.length()))+1);
            if (JOptionPane.showConfirmDialog(null, "The booking will be " + total + " for " + days + " day/s\nDo you want to make this booking?", "人手不足，敬請見諒。",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                Booking book = new Booking(BID, Renty.loginUser.getUsername(), Renty.loginUser.getPhoneNum(), Renty.loginUser.getEmail(), carTxt.getText(), plateTxt.getText(), "-", "-", Renty.toDate(), RentCar.pickup_Date, RentCar.return_Date, Integer.parseInt(days), total, "-", "-", review, status);
                DataIO.bookings.add(book);
                DataIO.WriteToText();

                JOptionPane.showMessageDialog(null, "Booking placed, please wait for admin approval to proceed for payment.\nIf the booking is not approved within 1 day, do place same booking again.\nSorry for inconvenience.", "test");

                this.setVisible(false);
                MainMenu mm = new MainMenu();
                mm.setVisible(true);
            } else {
                return;
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CarDetails.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_bookCarBtnActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
       this.setVisible(false);
       DataIO.logout();
    }//GEN-LAST:event_exitIconMouseClicked

    private void rentCarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentCarBtnMouseClicked
        this.setVisible(false);
        
        RentCar rent = new RentCar();
        rent.setVisible(true);
    }//GEN-LAST:event_rentCarBtnMouseClicked
    
    private void showReview(){
        ArrayList<Booking> reviews = DataIO.getReview(RentCar.carChosen.getCarPlate());
        
        Object[] lines = reviews.toArray();

        for (Object line : lines) {
           int counter = 0;
           String dataline = line.toString().trim();
           //split result with "|"
           String[] dataRow = dataline.split("\\|");
           
           if(!dataRow[15].equals("Pending") && counter <= 3) {
                reviewTxt.append(
                     dataRow[15] + " - " + dataRow[1] + "\n\n"
                );
                
                counter++;
           }
        }
        
        if(reviewTxt.getText().equals("")) {
            reviewTxt.setText("No reviews yet.");
        }
    }
    
    private static String countDays(String pickupdate, String returndate) throws ParseException{
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date pickupD = sdf.parse(pickupdate);
        Date returnD = sdf.parse(returndate);
        
        long diff = returnD.getTime() - pickupD.getTime();
        float daysdiff = (diff / (1000*60*60*24));
        int dayInt = (int) daysdiff;
        String day = String.valueOf(dayInt + 1);
        
        return day;
    }
    
    private static String calcTotal(String day, String price) {
        int dayInt = Integer.parseInt(day);
        String priceOnly = price.substring(2);
        double priceDob = Double.valueOf(priceOnly);
        
        return String.format("%.2f", dayInt * priceDob);
    }
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
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookCarBtn;
    private javax.swing.JLabel carTxt;
    private javax.swing.JLabel colorTxt;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel plateTxt;
    private javax.swing.JLabel priceTxt;
    private javax.swing.JLabel rentCarBtn;
    private javax.swing.JTextArea reviewTxt;
    private javax.swing.JLabel seaterTxt;
    private javax.swing.JLabel speedTxt;
    private javax.swing.JLabel statusTxt;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel typeImg;
    private javax.swing.JLabel typeTxt;
    // End of variables declaration//GEN-END:variables
}
