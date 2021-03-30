package vehicles;

import behaviours.ICar;
import behaviours.IEngine;
import behaviours.ITyres;
import components.TyreType;
import components.Tyres;

import java.util.ArrayList;

public abstract class Car implements ICar {
    private String make;
    private String model;
    private double price;
    private FuelType fuel;
    private IEngine engine;
    private ITyres tyres;
    private ArrayList<DamageType> damages;

    public Car(String make, String model, double price, FuelType fuel, IEngine engine, ITyres tyres){
        this.make = make;
        this.model = model;
        this.price = price;
        this.fuel = fuel;
        this.engine = engine;
        this.tyres = tyres;
        this.damages = new ArrayList<>();
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

    public void addDamage(DamageType damageType){
        this.damages.add(damageType);
        this.reducePriceAsDamaged(damageType);
    }

    public int getDamages(){
        return this.damages.size();
    }

    public void reducePriceAsDamaged(DamageType damageType){
        this.price -= damageType.getDamageValue();
    }

    public double totalDamageCost(){
        double counter = 0;
        for (DamageType damage: this.damages){
            counter += damage.getDamageValue();
        }
        return counter;
    }

    public void repair(){
        this.price += this.totalDamageCost();
        this.damages.clear();
    }

}
