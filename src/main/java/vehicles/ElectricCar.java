package vehicles;

import behaviours.IEngine;
import behaviours.ITyres;

public class ElectricCar extends Car {

    private int range;

    public ElectricCar(String make, String model, double price, FuelType fuel, IEngine engine, ITyres tyres, int range) {
        super(make, model, price, fuel, engine, tyres);
        this.range = range;
    }

    public int getRange() {
        return range;
    }
}
