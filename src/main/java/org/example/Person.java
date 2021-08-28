package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
   // @Autowired
    //@Qualifier("IMac")
    private Computer computer;

    public Person() {
    }

    public Person(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("iMac")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public void startPC() {
        computer.startOC();
    }
}
