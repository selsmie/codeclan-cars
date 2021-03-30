package components;

import behaviours.ITyres;

public class Tyres implements ITyres {

//    private String tyreType;
    private TyreType tyreType;

    public Tyres(TyreType tyreType) {
        this.tyreType = tyreType;
    }

    public TyreType getTyreType(){
        return this.tyreType;
    }
}
