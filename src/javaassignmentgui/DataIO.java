
package javaassignmentgui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class DataIO {
    public static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static ArrayList<Admin> admins = new ArrayList<Admin>();

    public static void readFromTextFile(){
        try{
            Scanner s1 = new Scanner(new File("customer.txt")); 
            while(s1.hasNext()){
                
                String line = s1.nextLine().trim();
                String [] dataRow = line.split("\\|");
                String username = dataRow[0];
                String password = dataRow[1];
                String gender = dataRow[2];
                int age = Integer.parseInt(dataRow[3]);
                int phoneNum = Integer.parseInt(dataRow[4]);
                String email = dataRow[5];
                String address = dataRow[6];
                
                
                Customer c = new Customer(username, password, gender, age, phoneNum, email, address);
                customers.add(c);
            }
            
            Scanner s2 = new Scanner(new File("admin.txt"));
            while(s2.hasNext()){
                String line = s2.nextLine().trim();
                String [] dataRow = line.split("\\|");
                String username = dataRow[0];
                String password = dataRow[1];
                
                Admin a = new Admin(username, password);
                admins.add(a);
              
            }

        }catch(Exception e){
            System.out.println("Error in read .....");
        }
    }
    
    public static void WriteToText() throws FileNotFoundException{
        
        PrintWriter a = new PrintWriter("customer.txt");
        for(Customer cust : customers){
            String Customers = cust.getUsername() + "|" + cust.getPassword() + "|" + cust.getGender() + "|" + cust.getAge() + "|" + cust.getPhoneNum() + "|" + cust.getEmail() + "|" + cust.getAddress();
            a.println(Customers);
        }
        a.close();

        PrintWriter b = new PrintWriter("admin.txt");
        for(Admin admin : admins){
            String Admins = admin.getUsername() + "|" + admin.getPassword();
            b.println(Admins);
        }
        b.close();

    }

    public static Customer checkUsername(String username) {
        Customer found = null;
        for(Customer c : customers){
            if(username.equals(c.getUsername())){
                found = c;
                break;
            }
        }
        return found;
        
    }

    public static Admin checkAdminUsername(String username) {
        Admin found = null;
        for(Admin a : admins){
            if(username.equals(a.getUsername())){
                found = a;
                break;
            }
        }
        return found;
        
    }
}
