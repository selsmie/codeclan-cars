package vehicals;

import components.Engine;
import components.TyreType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.FuelType;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine(8);
        tyres = new Tyres(TyreType.NORMAL);
        electricCar = new ElectricCar("BMW", "A1", 1000, FuelType.PETROL, engine, tyres, 500);
    }

    @Test
    public void hasMake(){
        assertEquals("BMW", electricCar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("A1", electricCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(1000, electricCar.getPrice(), 0.0);
    }

    @Test
    public void hasFuelType(){
        assertEquals(FuelType.PETROL, electricCar.getFuelType());
    }

    @Test
    public void hasEngineSize(){
        assertEquals(8, electricCar.getEngineSize());
    }

    @Test
    public void hasTyreType(){
        assertEquals(TyreType.NORMAL, electricCar.getTyreType());
    }

    @Test
    public void hasRange() {
        assertEquals(500, electricCar.getRange());
    }
}
