package com.electronics.devices;

public class TestSmartphone {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone();
        Smartphone smartphone2 = new Smartphone("Apple",3444,"IOS");
        System.out.println(smartphone1);
        System.out.println(smartphone2);
        System.out.println(smartphone1.model());
        System.out.println(smartphone2.model());
        System.out.println(smartphone1.operatingSystem());
        System.out.println(smartphone2.operatingSystem());
        System.out.println(smartphone1.baterryCapacity());
        System.out.println(smartphone2.baterryCapacity());
        System.out.println(smartphone1.equals(smartphone2));
    }
}
