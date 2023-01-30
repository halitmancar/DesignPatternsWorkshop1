package com.company.structural.composite;

public class Main {
    public static void main(String[] args) {
        Bureaucrat president = new Bureaucrat("Halit", "Mancar", "President");
        Bureaucrat primeMinister = new Bureaucrat("Burak", "Kaya", "Prime Minister");

        Bureaucrat ministerOfEconomy = new Bureaucrat("Berkay", "Yıldız", "Minister of Economy");
        Bureaucrat ministerOfJustice = new Bureaucrat("Doruk", "Senay", "Minister of Justice");
        Bureaucrat ministerOfTechnology = new Bureaucrat("Erdi", "Tuna", "Minister of Technology");

        president.add(primeMinister);
        primeMinister.add(ministerOfEconomy);
        primeMinister.add(ministerOfJustice);
        primeMinister.add(ministerOfTechnology);

        System.out.println(president.toString());
        for (Bureaucrat bureaucrat: president.subordinates){
            System.out.println(bureaucrat.toString());
            for (Bureaucrat bureaucrat1: bureaucrat.subordinates){
                System.out.println(bureaucrat1.toString());
            }
        }
    }
}
