package com.company.abstract_factory.factories;

import com.company.abstract_factory.computer.Computer;
import com.company.abstract_factory.computer.Macbook;
import com.company.abstract_factory.phone.IPhone;
import com.company.abstract_factory.phone.Phone;

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
