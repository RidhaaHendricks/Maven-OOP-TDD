package za.ac.cput;

public class Bus extends Vehicle {

    private int noStandingPass;
    private final int ticketPrice = 15;
    private int totalPassengers;

    public Bus() {
    }

    public Bus(String carID, String model, String make, double price, int noStandingPass, int totalPassengers) {
        super(carID, model, make, price);
        this.noStandingPass = noStandingPass;
        this.totalPassengers = totalPassengers;
    }

    public int getNoStandingPass() {
        return noStandingPass;
    }

    public void setNoStandingPass(int noStandingPass) {
        this.noStandingPass = noStandingPass;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

    public double CalcTotalTicketPrice(){
        double totalTick = 0.0;

        totalTick = ticketPrice * getNoStandingPass();

        return totalTick;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Car ID =' " + getCarID() + '\'' +
                ", Model =' " + getModel() + '\'' +
                ", Make =' " + getMake() + '\'' +
                ", Price = " + getPrice() + '\'' +
                ", Number of Standing Pass='" + noStandingPass + '\'' +
                ", Ticket Price = " + ticketPrice + '\'' +
                ", Total Passengers = " + totalPassengers +
                '}';
    }
}
