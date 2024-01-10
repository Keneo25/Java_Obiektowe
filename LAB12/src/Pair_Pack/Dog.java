package Pair_Pack;

import Animals_Pack.Animal;

public class Dog extends Animal{
  String name;

    public Dog(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Gneric{
    public static <T extends Animal> T findMax(Pair<? extends T> pair){
        T pierwsze = pair.age1;
        T drugie = pair.age1;
        if (pierwsze.getAge() > drugie.getAge()) {
            return pierwsze;
        } else {
            return drugie;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Animal animal = new Animal(12);
        Animal animal1 = new Animal(14);
        Dog dog = new Dog(23,"Damian");
        Dog dog1 = new Dog(47, "Bartek");

        Pair<Animal> animalPair = new Pair<>(animal,animal1);
        Pair<Dog> dogPair = new Pair<>(dog,dog1);
        Animal maxAnimal = Gneric.findMax(animalPair);
        Dog maxDog = Gneric.findMax(dogPair);
        System.out.println(maxAnimal.getAge());
        System.out.println(maxDog.getName().length());
    }
}
