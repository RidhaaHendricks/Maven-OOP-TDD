package za.ac.cput;

public class Car extends Vehicle {

    private int noOfLiftPeople;
    private double liftPrice;

    public Car() {
    }

    public Car(String carID, String model, String make, double price, int noOfLiftPeople, double liftPrice) {
        super(carID, model, make, price);
        this.noOfLiftPeople = noOfLiftPeople;
        this.liftPrice = liftPrice;
    }

    public int getNoOfLiftPeople() {
        return noOfLiftPeople;
    }

    public double getLiftPrice() {
        return liftPrice;
    }

    public void setNoOfLiftPeople(int noOfLiftPeople) {
        this.noOfLiftPeople = noOfLiftPeople;
    }

    public void setLiftPrice(double liftPrice) {
        this.liftPrice = liftPrice;
    }

    public double CalcMonthlyPrice(){
        double total = 0.0;

        total = (getLiftPrice() * getNoOfLiftPeople()) * 4;

        return total;
    }

    @Override
    public String toString() {
        return "Car{" + getCarID() + '\'' +
                ", Model =' " + getModel() + '\'' +
                ", Make =' " + getMake() + '\'' +
                ", Price = " + getPrice() + '\'' +
                ", Number of Lift People = " + noOfLiftPeople + '\'' +
                ", Lift Price = " + liftPrice +
                ", Total = " + CalcMonthlyPrice() +
                '}';
    }
}
