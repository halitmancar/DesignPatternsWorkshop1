package com.company.behavioral.chain_of_responsibility.patterns;

import com.company.behavioral.chain_of_responsibility.cross_cutting.*;

public class CrossCuttingPattern {
    public static AbstractCrossCutter getChainOfCrossCutters(){
        AbstractCrossCutter authorization = new Authorization();
        AbstractCrossCutter dbLogger = new DBLogger();
        AbstractCrossCutter fileLogger = new FileLogger();
        AbstractCrossCutter redisCacher = new RedisCaching();

        authorization.nextCrossCutter = dbLogger;
        dbLogger.nextCrossCutter = fileLogger;
        fileLogger.nextCrossCutter = redisCacher;

        return authorization;
    }
}
