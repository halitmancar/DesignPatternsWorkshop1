package com.company.creational.abstract_factory.services;

import com.company.creational.abstract_factory.computer.Computer;
import com.company.creational.abstract_factory.factories.ElectronicsFactory;
import com.company.creational.abstract_factory.phone.Phone;

public class CustomerService implements ICustomerService{

    private Computer computer;
    private Phone phone;

    public CustomerService(ElectronicsFactory electronicsFactory) {
        this.computer = electronicsFactory.produceComputer();
        this.phone = electronicsFactory.producePhone();
    }

    @Override
    public void buy() {
        computer.produce();
        phone.produce();
        System.out.println("Satın alınacak ürünler üretildi...");
    }
}
