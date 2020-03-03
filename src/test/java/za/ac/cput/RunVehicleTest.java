package za.ac.cput;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunVehicleTest {

    // Check for Encapsulation
    @Test
    public void testGetCarID() {
        Vehicle veh = new Vehicle("52134");

        veh.setCarID("12345");
        assertEquals("12345", veh.getCarID());
    }

    // Check for Inheritance
    @Test
    public void TestInherit() {
        Car cr = new Car("12345", "1996", "Toyota", 20000, 4, 150);
        Bus bs = new Bus("12345", "1996", "Mercedes", 120000, 32, 62);
        Vehicle veh = new Vehicle();

        assertSame("12345", cr.getCarID());
        assertSame("Mercedes", bs.getMake());
    }

    // Testing Method CalcTotalTicketPrice from Bus.class
    @Test
    public void testBusCalcTotalTicketPrice(){

        Bus bs = new Bus("12345", "1996", "Mercedes", 120000, 32, 62);

        assertEquals( (int) 480, (int) bs.CalcTotalTicketPrice());
    }

    // Testing Method CalcMonthlyPrice from Car.class
    @Test
    public void testCarCalcMonthlyPrice(){

        Car cr = new Car("12345", "1996", "Toyota", 20000, 4, 150);

        assertEquals( (int) 2400, (int) cr.CalcMonthlyPrice());
    }
}