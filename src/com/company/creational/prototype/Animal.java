package com.company.creational.prototype;

public abstract class Animal {
    public int id;
    public int teeth;
    public boolean tail;

    public Animal(){

    }

    public Animal(Animal animal){
        if (animal!=null){
            this.id = animal.id;
            this.teeth = animal.teeth;
            this.tail = animal.tail;
        }
    }
    public abstract Animal clone();
}
