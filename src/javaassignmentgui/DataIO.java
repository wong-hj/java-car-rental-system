
package javaassignmentgui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


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
    
    private static boolean CheckExistingUser(String fileName, String username) throws FileNotFoundException {
        boolean userExist = false;
        
        Scanner s = new Scanner(new File(fileName));
        
        while(s.hasNext()) {
            
            
            String line = s.nextLine().trim();
            
            String [] dataRow = line.split("\\|");
            
            if(username.equals(dataRow[0])) {
                JOptionPane.showMessageDialog(null, "User already exist!", "Error!", JOptionPane.ERROR_MESSAGE);
                userExist = true;
            }
        
        }
        
        return userExist;
    }
    
    public static boolean RegisterUser(String fileName, String username, String password, String gender, String age, String phoneNum, String email, String address) throws FileNotFoundException {
        boolean register = false;
        Customer cust = new Customer(username, password, gender, age, phoneNum, email, address);
        boolean userExist = CheckExistingUser(fileName, username);
        
        if (userExist == false) {
            File oldFile = new File(fileName);
            
            String FullNewUserLine = username + "|" + password + "|" + gender + "|" + age + "|" + phoneNum + "|" + email + "|" + address + "\n";
            String FullNewUserLine1 = cust.getUsername() + "|" + cust.getPassword() + "|" + cust.getGender() + "|" + cust.getAge() + "|" + cust.getPhoneNum() + "|" + cust.getEmail() + "|" + cust.getAddress() + "\n";
            
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(oldFile, true));
                bw.append(FullNewUserLine);
                bw.close();
                
                register = true;
            } catch (IOException e) {
                System.out.println(e);
            }
            
        }
        
        return register;
    }
}
