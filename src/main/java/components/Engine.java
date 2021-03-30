package components;

import behaviours.IEngine;

public class Engine implements IEngine{

    private int engineSize;

    public Engine(int engineSize){
        this.engineSize = engineSize;
    }

    public int getEngineSize(){
        return this.engineSize;
    }
}
