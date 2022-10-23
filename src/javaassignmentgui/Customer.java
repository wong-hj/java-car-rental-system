
package javaassignmentgui;

public class Customer {
    private String username;
    private String password;
    private String gender;
    private String age;
    private String phoneNum;
    private String email;
    private String address;

    public Customer(String username, String password, String gender, String age, String phoneNum, String email, String address) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
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
    
    
  
}
