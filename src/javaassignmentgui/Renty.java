
package javaassignmentgui;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Renty {
   
    public static Customer loginUser = null;
    public static Admin loginAdmin = null;
//    public static Car carChosen = null;
    

    public static void main(String[] args) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        // TODO code application logic here
        DataIO.readFromTextFile();
        Login start = new Login();
        start.setVisible(true);
    }
    
    public static String toDate(){
        String todate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        return todate;
    }
    
}
