package com.company.prototype;

public class Cat extends Animal{

    public String color;
    private String sex;
    private boolean sterilize;

    public Cat(){

    }

    public Cat(Cat cat){
        super(cat);
        if (cat!=null){
            if (cat!=null){
                this.color = cat.color;
                this.sex = cat.sex;
                this.sterilize = cat.sterilize;
            }
        }
    }

    @Override
    public Animal clone() {
        return new Cat(this);
    }
}
