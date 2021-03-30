import behaviours.ICar;
import vehicles.Car;
import vehicles.PetrolCar;

import java.util.ArrayList;

public class Dealership {

    private String companyName;
    private ArrayList<ICar> showCars;
    private double till;

    public Dealership(String companyName, double till){
        this.companyName = companyName;
        this.till = till;
        this.showCars = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getShowCars() {
        return showCars.size();
    }

    public double getTill() {
        return till;
    }

    public void addCars(ICar car){
        this.showCars.add(car);
    }
}

