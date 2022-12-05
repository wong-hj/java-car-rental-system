
package javaassignmentgui;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Log {
    
    private String user;
    private String role;
    private String datetime;
    private String action;
    private String status;

    public Log(String user, String role, String datetime, String action, String status) {
        this.user = user;
        this.role = role;
        this.datetime = datetime;
        this.action = action;
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
    public static void writeLog(String user, String role, String action, String status) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        String sdate = formatter.format(date);  
        
        try {
            
            Log log = new Log(user, role, sdate, action, status);
            DataIO.logging.add(log);
            DataIO.WriteToText();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
