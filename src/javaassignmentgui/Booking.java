
package javaassignmentgui;


public class Booking {
    
    private String BookingID;
    private String name;
    private String contact;
    private String email;
    private String car;
    private String carPlate;
    private String pickupAdd;
    private String returnAdd;
    private String bookingDate;
    private String pickupDate;
    private String returnDate;
    private int days;
    private String total;
    private String paymentMethod;
    private String paymentDetails;
    private String review;

    public Booking(String BookingID, String name, String contact, String email, String car, String carPlate, String pickupAdd, String returnAdd, String bookingDate, String pickupDate, String returnDate, int days, String total, String paymentMethod, String paymentDetails, String review) {
        this.BookingID = BookingID;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.car = car;
        this.carPlate = carPlate;
        this.pickupAdd = pickupAdd;
        this.returnAdd = returnAdd;
        this.bookingDate = bookingDate;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.days = days;
        this.total = total;
        this.paymentMethod = paymentMethod;
        this.paymentDetails = paymentDetails;
        this.review = review;
    }

    public String getBookingID() {
        return BookingID;
    }

    public void setBookingID(String BookingID) {
        this.BookingID = BookingID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getPickupAdd() {
        return pickupAdd;
    }

    public void setPickupAdd(String pickupAdd) {
        this.pickupAdd = pickupAdd;
    }

    public String getReturnAdd() {
        return returnAdd;
    }

    public void setReturnAdd(String returnAdd) {
        this.returnAdd = returnAdd;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    
    public String toString() {
        return BookingID + "|" + name + "|" + contact + "|" + email + "|" + car + "|" + carPlate + "|" + pickupAdd + "|" + returnAdd + "|" + bookingDate  + "|" + pickupDate  + "|" + returnDate + "|" + days  + "|" + total  + "|" + paymentMethod + "|" + paymentDetails + "|" + review;
    }
    
//    public String simplifiedToString() {
//        return BookingID + "|" + contact + "|" + email + "|" + car + "|" + carPlate + "|" + bookingDate  + "|" + returnDate  + "|" + days  + "|" + total  + "|" + paymentMethod + "|" + review;
//    }
    
    
    
}
