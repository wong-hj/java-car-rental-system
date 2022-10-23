
package javaassignmentgui;

public class JavaAssignmentGUI {
   
    public static Customer loginUser = null;
    public static void main(String[] args) {
        // TODO code application logic here
        DataIO.readFromTextFile();
        Login start = new Login();
        start.setVisible(true);
    }
    
}
