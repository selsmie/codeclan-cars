package vehicles;

public class Damage {

    private DamageType damageType;

    public Damage(DamageType damageType){
        this.damageType = damageType;
    }

    public double getDamage(){
        return this.damageType.getDamageValue();
    }
}
