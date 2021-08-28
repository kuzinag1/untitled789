package org.example;

import org.springframework.stereotype.Component;


public class IMac implements Computer{

    @Override
    public void startOC() {
        System.out.println("Hello apple user");

    }
}
