package org.example;

import org.springframework.stereotype.Component;

@Component
public class AsusRog implements Computer {
    @Override
    public void startOC() {
        System.out.println("Hello gamer");
    }
}
