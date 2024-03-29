
package javaassignmentgui;

public class Customer extends User{
    private String gender;
    private int age;
    private String phoneNum;
    private String email;
    private String address;
    private int approval;

    public Customer(String username, String password, String gender, int age, String phoneNum, String email, String address, int approval) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
        this.approval = approval;
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

    public int getApproval() {
        return approval;
    }

    public void setApproval(int approval) {
        this.approval = approval;
    }
    
    @Override
    public String toString() {
        return username + "|" + password + "|" + gender + "|" + age + "|" + phoneNum + "|" + email + "|" + address + "|" + approval;
    }
}
