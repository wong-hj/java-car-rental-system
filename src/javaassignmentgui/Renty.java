
package javaassignmentgui;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Renty {
   
    public static Customer loginUser = null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        DataIO.readFromTextFile();
        Login start = new Login();
        start.setVisible(true);
    }
    
    public static String toDate(){
        String todate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        
        return todate;
    }
    
}
