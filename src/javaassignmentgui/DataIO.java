
package javaassignmentgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DataIO {
 
    public static boolean LoginReadFromTextFile(String fileName, String username, String password) throws FileNotFoundException{
        boolean login;
        Scanner s = new Scanner(new File(fileName));
        while(s.hasNext()) {
            String line = s.nextLine().trim();
            
            String [] dataRow = line.split("\\|");
            
            if(username.equals(dataRow[0])) {
                
                if(password.equals(dataRow[1])) {
                    
                    return login = true;
                } 
            } 
        }
        return login = false;
        
    }
}
