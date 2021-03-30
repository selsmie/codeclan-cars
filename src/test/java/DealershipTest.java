import components.Engine;
import components.TyreType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.DamageType;
import vehicles.ElectricCar;
import vehicles.FuelType;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    PetrolCar car;
    Engine engine;
    Tyres tyres;
    ElectricCar eCar;
    Customer customer;

    @Before
    public void before(){
        dealership = new Dealership("CodeClan Cars", 100000);
        car = new PetrolCar("BMW", "A1", 1000, FuelType.PETROL, engine, tyres);
        engine = new Engine(8);
        tyres = new Tyres(TyreType.NORMAL);
        eCar = new ElectricCar("BMW", "A1", 1000, FuelType.PETROL, engine, tyres, 500);
        customer = new Customer("Mark", 10000);
    }

    @Test
    public void getCompanyName() {
        assertEquals("CodeClan Cars", dealership.getCompanyName());
    }

    @Test
    public void getShowCars() {
        assertEquals(0, dealership.getShowCars());
    }

    @Test
    public void getTill() {
        assertEquals(100000, dealership.getTill(), 0.0);
    }

    @Test
    public void canAddCar() {
        dealership.addCars(car);
        assertEquals(1, dealership.getShowCars());
    }

    @Test
    public void dealershipCanBuyCar(){
        dealership.buyCar(car);
        assertEquals(1, dealership.getShowCars());
    }

    @Test
    public void dealershipCanSellToCustomer(){
        dealership.addCars(car);
        dealership.sellCar(car, customer);
        assertEquals(0, dealership.getShowCars());
        assertEquals(1, customer.getOwnedVehicles());
    }

    @Test
    public void dealshipCanRepairCar(){
        car.addDamage(DamageType.MODERATE);
        assertEquals(200, car.getPrice(), 0.0);
        dealership.repairCar(car);
        assertEquals(0, car.getDamages());
        assertEquals(1000, car.getPrice(), 0.0);
    }
}
