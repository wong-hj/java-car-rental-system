
package javaassignmentgui;

public class Car {
    private String carPlate;
    private String brand;
    private String model;
    private String type;
    private String color;
    private String speed;
    private int seat;
    private String price;
    private String status;

    public Car(String carPlate, String brand, String model, String type, String color, String speed, int seat, String price, String status) {
        this.carPlate = carPlate;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.seat = seat;
        this.price = price;
        this.status = status;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getSeat() {
        
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getCar(){
        return brand + " " + model;
    }
    public String toString() {
        return carPlate + "|" + brand + "|" + model + "|" + type + "|" + color + "|" + speed + "|" + seat + "|" + price + "|" + status;
    }
    
    
}
