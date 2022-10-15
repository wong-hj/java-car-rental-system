
package javaassignmentgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DataIO {
 
    public static boolean LoginReadFromTextFile(String fileName, String username, String password) throws FileNotFoundException{
        boolean login;
        Scanner s = new Scanner(new File(fileName));
        while(s.hasNext()) {
            
            Customer cust = new Customer(username, password);
            
            String line = s.nextLine().trim();
            
            String [] dataRow = line.split("\\|");
            
            
            if(cust.getUsername().equals(dataRow[0])) {
                
                if(cust.getPassword().equals(dataRow[1])) {
                    
                    return login = true;
                } 
            } 
        }
        return login = false;
        
    }
}
