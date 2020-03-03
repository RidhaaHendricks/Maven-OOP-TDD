package za.ac.cput;

public class Vehicle {

    private String carID;
    private String model;
    private String make;
    private double price;

    public Vehicle() {

    }

    public Vehicle(String carID) {
        this.carID = carID;
    }

    public Vehicle(String carID, String model, String make, double price) {
        this.carID = carID;
        this.model = model;
        this.make = make;
        this.price = price;
    }

    public String getCarID() {
        return carID;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Car ID =' " + carID + '\'' +
                ", Model =' " + model + '\'' +
                ", Make =' " + make + '\'' +
                ", Price = " + price +
                '}';
    }
}
