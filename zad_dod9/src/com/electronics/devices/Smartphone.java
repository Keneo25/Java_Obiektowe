package com.electronics.devices;

import org.w3c.dom.ls.LSOutput;

public record Smartphone(String model, int baterryCapacity, String operatingSystem){
    public Smartphone() {
        this("Xiaomi",3000,"Android");
    }


}
