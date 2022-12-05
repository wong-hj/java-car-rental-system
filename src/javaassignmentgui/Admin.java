
package javaassignmentgui;


public class Admin extends User {

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String toString() {
        return username + "|" + password;
    }
    
}
