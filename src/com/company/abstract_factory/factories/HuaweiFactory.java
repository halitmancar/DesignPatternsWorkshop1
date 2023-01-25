package com.company.abstract_factory.factories;

import com.company.abstract_factory.computer.Computer;
import com.company.abstract_factory.computer.Huawei;
import com.company.abstract_factory.phone.HuaweiPhone;
import com.company.abstract_factory.phone.Phone;

public class HuaweiFactory extends ElectronicsFactory{
    @Override
    public Phone producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public Computer produceComputer() {
        return new Huawei();
    }
}
