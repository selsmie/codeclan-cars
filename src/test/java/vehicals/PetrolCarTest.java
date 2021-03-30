package vehicals;

import components.Engine;
import components.TyreType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.DamageType;
import vehicles.FuelType;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    Engine engine;
    Tyres tyres;
    PetrolCar car;

    @Before
    public void before(){
        engine = new Engine(8);
        tyres = new Tyres(TyreType.NORMAL);
        car = new PetrolCar("BMW", "A1", 1000, FuelType.PETROL, engine, tyres);

    }

    @Test
    public void hasMake(){
        assertEquals("BMW", car.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("A1", car.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(1000, car.getPrice(), 0.0);
    }

    @Test
    public void hasFuelType(){
        assertEquals(FuelType.PETROL, car.getFuelType());
    }

    @Test
    public void hasEngineSize(){
        assertEquals(8, car.getEngineSize());
    }

    @Test
    public void hasTyreType(){
        assertEquals(TyreType.NORMAL, car.getTyreType());
    }

    @Test
    public void hasDamage(){
        car.addDamage(DamageType.MINOR);
        assertEquals(1, car.getDamages());
    }

    @Test
    public void damageAffectsPrice(){
        car.addDamage(DamageType.MINOR);
        assertEquals(900, car.getPrice(), 0.0);
    }
}
