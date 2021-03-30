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

    public void buyCar(Car car) {
        if (this.till >= car.getPrice()){
            this.till -= car.getPrice();
            this.showCars.add(car);
        }
    }

    public void sellCar(Car car, Customer customer) {
        if (customer.canBuyCar(car)){
            double cash = customer.buyCar(car);
            this.till += cash;
            this.showCars.remove(car);
        }
    }

    public void repairCar(Car car) {
        car.repair();
    }
}

