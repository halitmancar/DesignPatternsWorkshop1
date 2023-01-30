package com.company.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Bureaucrat {
    public String name;
    public String surname;
    public String position;
    public List<Bureaucrat> subordinates;

    public Bureaucrat(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.subordinates = new ArrayList<>();
    }

    public void add(Bureaucrat bureaucrat){
        subordinates.add(bureaucrat);
    }
    public void remove(Bureaucrat bureaucrat){
        subordinates.remove(bureaucrat);
    }

    @Override
    public String toString() {
        return "Bureaucrat{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
