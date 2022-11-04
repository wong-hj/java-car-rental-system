
package javaassignmentgui;

public class Customer {
    private String username;
    private String password;
    private String gender;
    private int age;
    private int phoneNum;
    private String email;
    private String address;
    private int approval;

    public Customer(String username, String password, String gender, int age, int phoneNum, String email, String address, int approval) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
        this.approval = approval;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getApproval() {
        return approval;
    }

    public void setApproval(int approval) {
        this.approval = approval;
    }
    
    
    public String toString() {
        return username + "," + password + "," + age + "," + phoneNum + "," + email + "," + address + "," + approval;
    }
}
