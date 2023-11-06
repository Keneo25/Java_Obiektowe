package com.people.zad1;

public class Person {
    public String name;
    public static int counter = 0;


    public Person(String name){
        this.name = name;
        counter++;
    }

    public String GetName(){
        return name;
    }

    public static int GetCounter(){
        return counter;
    }
    public static void main(String[] args) {
        Person person1 = new Person("Adam");
        Person person2 = new Person("Karol");

        System.out.println("Person 1: " + person1.GetName());
        System.out.println("Person 2: " + person2.GetName());

        int totalPersons = Person.GetCounter();
        System.out.println("Total persons created: " + totalPersons);


    }

}
