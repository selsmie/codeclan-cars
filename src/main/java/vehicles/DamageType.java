package vehicles;

public enum DamageType {
    MINOR(100),
    MODERATE(800),
    EXCESSIVE(4000);

    private final double damage;

    DamageType(double damage){this.damage = damage;}

    public double getDamageValue(){
        return this.damage;
    }
}
