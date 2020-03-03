package za.ac.cput;

import java.util.Scanner;

public class RunVehicle {

    public static void main(String args[]){

        Car cr = new Car();
        Bus bs = new Bus();

        int opt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Option: 1 - Car, 2 - Bus");
        opt = sc.nextInt();

        if (opt == 1){
            System.out.println("Enter Car ID: ");
            cr.setCarID(sc.next());
            System.out.println("Enter Car Model: ");
            cr.setModel(sc.next());
            System.out.println("Enter Car Make: ");
            cr.setMake(sc.next());
            System.out.println("Car Price: 20000");
            cr.setPrice(20000.00);
            System.out.println(cr.toString());
        } else if(opt == 2){
            System.out.println("Enter Bus ID: ");
            bs.setCarID(sc.next());
            System.out.println("Enter Bus Model: ");
            bs.setModel(sc.next());
            System.out.println("Enter Bus Make: ");
            bs.setMake(sc.next());
            System.out.println("Enter Number of Standing Passengers: ");
            bs.setNoStandingPass(sc.nextInt());
            System.out.println("Bus Price: 120000");
            bs.setPrice(120000.00);
            System.out.println(bs.toString());
        }

    }
}
