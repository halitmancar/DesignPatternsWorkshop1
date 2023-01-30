package com.company.behavioral.chain_of_responsibility.cross_cutting;

public abstract class AbstractCrossCutter {
    public AbstractCrossCutter nextCrossCutter;

    public void processData(String data){
        process(data);
        if (nextCrossCutter!=null){
            nextCrossCutter.processData(data);
        }
    }

    abstract void process(String data);
}
