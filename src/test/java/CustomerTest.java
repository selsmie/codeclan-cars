import components.Engine;
import components.TyreType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.FuelType;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    PetrolCar car;
    Engine engine;
    Tyres tyres;
    ElectricCar eCar;

    @Before
    public void before(){
        car = new PetrolCar("BMW", "A1", 1000, FuelType.PETROL, engine, tyres);
        engine = new Engine(8);
        tyres = new Tyres(TyreType.NORMAL);
        customer = new Customer("Mark", 10000);
        eCar = new ElectricCar("BMW", "A1", 1000, FuelType.PETROL, engine, tyres, 500);
    }

    @Test
    public void getName() {
        assertEquals("Mark", customer.getName());
    }

    @Test
    public void getWallet() {
        assertEquals(10000, customer.getWallet(), 0.0);
    }

    @Test
    public void getOwnedVehicles() {
        assertEquals(0, customer.getOwnedVehicles());
    }

    @Test
    public void addVehicle() {
        customer.addVehicle(car);
        assertEquals(1, customer.getOwnedVehicles());
    }

    @Test
    public void addVehicleElectric() {
        customer.addVehicle(eCar);
        assertEquals(1, customer.getOwnedVehicles());
    }
}
