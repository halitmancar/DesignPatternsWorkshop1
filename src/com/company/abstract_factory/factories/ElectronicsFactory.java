package com.company.abstract_factory.factories;

import com.company.abstract_factory.computer.Computer;
import com.company.abstract_factory.phone.Phone;

public abstract class ElectronicsFactory {
    public abstract Phone producePhone();
    public abstract Computer produceComputer();
}
