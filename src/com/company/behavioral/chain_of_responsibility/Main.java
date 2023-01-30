package com.company.behavioral.chain_of_responsibility;

import com.company.behavioral.chain_of_responsibility.cross_cutting.AbstractCrossCutter;
import com.company.behavioral.chain_of_responsibility.patterns.CrossCuttingPattern;

public class Main {
    public static void main(String[] args) {
        AbstractCrossCutter crossCutter = CrossCuttingPattern.getChainOfCrossCutters();
        crossCutter.processData("Hello!");
    }
}
