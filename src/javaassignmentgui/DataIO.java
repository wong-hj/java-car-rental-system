package javaassignmentgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataIO {
    // create objects for arraylist
    public static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static ArrayList<Admin> admins = new ArrayList<Admin>();
    public static ArrayList<Car> cars = new ArrayList<Car>();
    public static ArrayList<Booking> bookings = new ArrayList<Booking>();
    public static ArrayList<Log> logging = new ArrayList<Log>();
    
    //read data from text files
    public static void readFromTextFile(){
        try{
            //Scanner on customer text file
            Scanner s1 = new Scanner(new File("customer.txt")); 
            //while text file has next line, loop
            while(s1.hasNext()){
                
                String line = s1.nextLine().trim(); //remove blank spaces from front and back
                String [] dataRow = line.split("\\|"); //split with delimiter "|"
                String username = dataRow[0];
                String password = dataRow[1];
                String gender = dataRow[2];
                int age = Integer.parseInt(dataRow[3]);
                String phoneNum = dataRow[4];
                String email = dataRow[5];
                String address = dataRow[6];
                int approval = Integer.parseInt(dataRow[7]);
                
                Customer c = new Customer(username, password, gender, age, phoneNum, email, address, approval);
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
            
            //Scanner on cars text file
            Scanner s3 = new Scanner(new File("cars.txt"));
            //while text file has next line, loop
            while(s3.hasNext()){
                String line = s3.nextLine().trim(); //remove blank spaces from front and back
                String [] dataRow = line.split("\\|"); //split with delimiter "|"
                //assign values to variables
                String carPlate = dataRow[0];
                String brand = dataRow[1];
                String model = dataRow[2];
                String type = dataRow[3];
                String color = dataRow[4];
                String speed = dataRow[5];
                int seat = Integer.parseInt(dataRow[6]);
                String price = dataRow[7];
                String status = dataRow[8];
                
                //create object as an instance of car class
                Car c = new Car(carPlate, brand, model, type, color, speed, seat, price, status);
                //cars is an object for custom arrayList 
                //c is an object for car class
                cars.add(c);
              
            }

            Scanner s4 = new Scanner(new File("booking.txt"));
            
            while(s4.hasNext()){
                String line = s4.nextLine().trim();
                String [] dataRow = line.split("\\|");
                String bid = dataRow[0];
                String name = dataRow[1];
                String contact = dataRow[2];
                String email = dataRow[3];
                String car = dataRow[4];
                String carPlate = dataRow[5];
                String pickupAdd = dataRow[6];
                String returnAdd = dataRow[7];
                String bookingDate = dataRow[8];
                String pickupDate = dataRow[9];
                String returnDate = dataRow[10];
                int days = Integer.parseInt(dataRow[11]);
                String total = dataRow[12];
                String paymentMethod = dataRow[13];
                String paymentDetails = dataRow[14];
                String review = dataRow[15];
                String status = dataRow[16];
                
                Booking d = new Booking(bid, name, contact, email, car, carPlate, pickupAdd, returnAdd, bookingDate, pickupDate, returnDate, days, total, paymentMethod, paymentDetails, review, status);
                bookings.add(d);
                
            }
                        
            Scanner s5 = new Scanner(new File("log.txt"));
            
            while(s5.hasNext()){
                String line = s5.nextLine().trim();
                String [] dataRow = line.split("\\|");
                String user = dataRow[0];
                String role = dataRow[1];
                String datetime = dataRow[2];
                String action = dataRow[3];
                String status = dataRow[4];

                Log l = new Log(user, role, datetime, action, status);
                logging.add(l);
                
            }

        }catch(Exception e){
            System.out.println("Error in read .....");
        }
    }
    
    //write data to text
    public static void WriteToText() throws FileNotFoundException{
        
        PrintWriter a = new PrintWriter("customer.txt");
        //for loop customers arraylist
        for(Customer cust : customers){
            String Customers = cust.getUsername() + "|" + cust.getPassword() + "|" + cust.getGender() + "|" + cust.getAge() + "|" + cust.getPhoneNum() + "|" + cust.getEmail() + "|" + cust.getAddress() + "|" + cust.getApproval();
            //print write in text file
            a.println(Customers);
        }
        //close print writer
        a.close();

        PrintWriter b = new PrintWriter("admin.txt");
        for(Admin admin : admins){
            String Admins = admin.getUsername() + "|" + admin.getPassword();
            b.println(Admins);
        }
        b.close();
        
        PrintWriter c = new PrintWriter("cars.txt");
        for(Car car : cars){
            String Cars = car.getCarPlate() + "|" + car.getBrand() + "|" + car.getModel() + "|" + car.getType() + "|" + car.getColor() + "|" + car.getSpeed() + "|" + car.getSeat() + "|" + car.getPrice() + "|" + car.getStatus();
            c.println(Cars);
        }
        c.close();
        
        PrintWriter d = new PrintWriter("booking.txt");
        for(Booking book : bookings){
            String Book = book.getBookingID() + "|" + book.getName() + "|" + book.getContact() + "|" + book.getEmail() + "|" + book.getCar()
                    + "|" + book.getCarPlate() + "|" + book.getPickupAdd() + "|" + book.getReturnAdd() + "|" + book.getBookingDate()
                    + "|" + book.getPickupDate() + "|" + book.getReturnDate() + "|" + book.getDays() + "|" + book.getTotal() + "|" + book.getPaymentMethod()
                     + "|" + book.getPaymentDetails() + "|" + book.getReview() + "|" + book.getStatus();
            d.println(Book);
        }
        d.close();
        
        PrintWriter e = new PrintWriter("log.txt");
        for(Log log : logging){
            String Logs = log.getUser() + "|" + log.getRole() + "|" + log.getDatetime() + "|" + log.getAction() + "|" + log.getStatus();
            e.println(Logs);
        }
        e.close();

    }
    
    //check user existence in system with username passed
    public static Customer checkUsername(String username) {
        Customer found = null;
        //for loop customers
        for(Customer c : customers){
            //if username matches then.. 
            if(username.equals(c.getUsername())){
                found = c;
                break;
            }
        }
        return found;
        
    }
    //check admin existence in system with username passed
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
    
    //return chosen car with carplate
    public static Car chosenCar(String carPlate) {
        Car carChosen = null;
        for(Car car : cars){
            if(carPlate.equals(car.getCarPlate())){
                carChosen = car;
                break;
            }
        }
        return carChosen;
    }
    
    //get latest booking ( for auto increment ID )
    public static String checkLatestBooking() {
        
       
        String bookingID = "";
        if(!bookings.isEmpty()){
            Iterator i = bookings.iterator();
            for(Booking book : bookings){
                if(i.hasNext()){
                    bookingID = book.getBookingID();
                    
                }
            }
        } else {
            bookingID = "B0";
        }
        
        return bookingID;
    }
    
    //filter cars with pickup date and return date input from customer
    public static ArrayList<Car> filterCar(LocalDate pickupDate, LocalDate returnDate) {
        
        ArrayList<String> conflictCar = new ArrayList<String>();

        for(Booking book : bookings){
            
            String BookedPickUpDate = book.getPickupDate();
            String BookedReturnDate = book.getReturnDate(); 
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
            
            LocalDate checkinDate = LocalDate.parse(BookedPickUpDate, formatter);
            LocalDate checkoutDate = LocalDate.parse(BookedReturnDate, formatter);
            
            //validate user enter date with booked date if conflict then remove roomid from comboBox
            
            if(!book.getStatus().equals("Cancelled")){
                //if date conflicted with current bookings then add into conflict car arraylist
                if(pickupDate.compareTo(checkoutDate) <= 0 && returnDate.compareTo(checkinDate) >= 0){

                    conflictCar.add(book.getCarPlate());

                }
            }
            
        }
        
        ArrayList<Car> filteredCars = new ArrayList<Car>();
        
        //clone a cars arraylist to filteredCars
        for(Car car : cars){
            filteredCars.add(car);
        }
        
        //compare conflicCar arraylist and filteredCars arraylist,
        //if matches then remove cars from arraylist
        for(String conflict : conflictCar) {
            
            for(int i = 0; i < filteredCars.size(); i++){

                if(filteredCars.get(i).getCarPlate().equals(conflict)){
                    filteredCars.remove(i);
                    i--;
                }

            }
        }
        //return filteredCars in the end
        return filteredCars;
    }
    
    //return availableCars for customer to view
    public static ArrayList<Car> availableCars() {
        
        ArrayList<Car> availableCars = new ArrayList<Car>();
        for(Car car : cars){
            
            //filter only cars with Available status
            if(car.getStatus().equals("Available")){
                availableCars.add(car);  
            }
        }
        
        return availableCars;
        
    }
    
    //Method Overloading
    public static ArrayList<Booking> userBookings(String username) {
        
        ArrayList<Booking> userBookings = new ArrayList<Booking>();
        for(Booking book : bookings){
            
            if(username.equals(book.getName()) && 
                    (book.getStatus().equals("Rejected") || book.getStatus().equals("Approved") || book.getStatus().equals("Pending") || book.getStatus().equals("Cancelled"))){
                userBookings.add(book);  
            }
        }
        
        return userBookings;
        
    }
    
    public static ArrayList<Booking> userBookings(String username, String status, String status2) {
        
        ArrayList<Booking> userBookings = new ArrayList<Booking>();
        for(Booking book : bookings){
            
            if(username.equals(book.getName()) && (book.getStatus().equals(status) || book.getStatus().equals(status2))){
                userBookings.add(book);  
            }
        }
        
        return userBookings;
        
    }
    
    //get chosen booking
    public static Booking chosenBooking(String BID) {
        Booking chosenBooking = null;
        for(Booking book : bookings){
            if(BID.equals(book.getBookingID())){
                chosenBooking = book;
                break;
            }
        }
        return chosenBooking;
    }
    
    //get reviews for each car
    public static ArrayList<Booking> getReview(String carPlate) {

        ArrayList<Booking> reviewCars = new ArrayList<Booking>();
        
        for(Booking book: bookings) {
            if(carPlate.equals(book.getCarPlate())) {
                reviewCars.add(book);
            }
        }
        
        return reviewCars;
    }
    
    //background checking for booking status
    public static void updateBooking() throws FileNotFoundException {
        Date todate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            //for loop bookings arraylist
            for(int i = 0; i < bookings.size(); i++){
                    //if booking's status is Approved
                    if(bookings.get(i).getStatus().equals("Approved")){
                        
                        String sdate = bookings.get(i).getPickupDate();
                        Date pdate = sdf.parse(sdate);
                        //if todate is after pickupDate then set Status to Cancelled
                        if(pdate.compareTo(todate) < 0) {
                            bookings.get(i).setStatus("Cancelled");
                        }
                        //if booking's status is Pending
                    } else if (bookings.get(i).getStatus().equals("Pending")) {
                        
                        Calendar c = Calendar.getInstance();
                        String sdate = bookings.get(i).getBookingDate();
                        Date bdate = sdf.parse(sdate);
                        c.setTime(bdate);
                        c.add(Calendar.DAY_OF_MONTH, 1);
                        
                        //if todate is after or equals to 1 day after bookingDate then delete booking
                        if(c.getTime().compareTo(todate) <= 0) {
                                bookings.remove(i);
                                i--;
                        }
                        //if booking's status is Paid
                    } else if (bookings.get(i).getStatus().equals("Paid")) {
                        Date rdate = sdf.parse(bookings.get(i).getReturnDate());
                        //if todate is after returnDate then set Status to Completed
                        if( rdate.compareTo(todate) < 0 ) {
                            
                            bookings.get(i).setStatus("Completed");
                        }
                    } else {
                        
                    }
            }
        }catch (ParseException ex) {
                        Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
        }          
        WriteToText();}
    
    //logout function
    public static void logout() {
        
        String role = null;
        String username = null;

        if(Renty.loginAdmin != null) {
            role = "admin";
            username = Renty.loginAdmin.getUsername();
        } else if(Renty.loginUser != null) {
            role = "customer";
            username = Renty.loginUser.getUsername();
        } else {
            role = "guest";
            username = "guest";
        }

        Log.writeLog(username, role, "logout", "success");
        Renty.loginUser = null;
        Renty.loginAdmin = null;

        Login login = new Login();
        login.setVisible(true);
 
    }

   
}
        


        
    

