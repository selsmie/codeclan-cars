package vehicles;

import behaviours.IEngine;
import behaviours.ITyres;
import components.TyreType;
import components.Tyres;

public class PetrolCar extends Car{

    public PetrolCar(String make, String model, double price, FuelType fuel, IEngine engine, ITyres tyres) {
        super(make, model, price, fuel, engine, tyres);
    }
}
