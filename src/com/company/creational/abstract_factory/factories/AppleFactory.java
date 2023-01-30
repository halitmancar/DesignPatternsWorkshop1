package com.company.creational.abstract_factory.factories;

import com.company.creational.abstract_factory.computer.Computer;
import com.company.creational.abstract_factory.computer.Macbook;
import com.company.creational.abstract_factory.phone.IPhone;
import com.company.creational.abstract_factory.phone.Phone;

public class AppleFactory extends ElectronicsFactory{
    @Override
    public Phone producePhone() {
        return new IPhone();
    }

    @Override
    public Computer produceComputer() {
        return new Macbook();
    }
}
