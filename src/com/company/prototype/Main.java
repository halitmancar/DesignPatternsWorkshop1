package com.company.prototype;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.id=1;
        cat.color="black";
        cat.tail=true;
        cat.teeth=10;

        Cat cat1 = (Cat) cat.clone();
        System.out.println(cat1.color);
        System.out.println(cat1.tail);
    }
}
