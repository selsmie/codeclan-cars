package vehicles;

import behaviours.ICar;
import behaviours.IEngine;
import behaviours.ITyres;
import components.TyreType;
import components.Tyres;

public abstract class Car implements ICar {
    private String make;
    private String model;
    private double price;
    private FuelType fuel;
    private IEngine engine;
    private ITyres tyres;

    public Car(String make, String model, double price, FuelType fuel, IEngine engine, ITyres tyres){
        this.make = make;
        this.model = model;
        this.price = price;
        this.fuel = fuel;
        this.engine = engine;
        this.tyres = tyres;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public FuelType getFuelType() {
        return fuel;
    }

    public int getEngineSize() {
        return engine.getEngineSize();
    }

    public TyreType getTyreType() {
        return tyres.getTyreType();
    }

}
