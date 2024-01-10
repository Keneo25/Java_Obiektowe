package Animal_Pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Animal implements Comparable<Animal> {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }


    @Override
    public int compareTo(Animal otherAnimal) {

        if (this.age == otherAnimal.age) {
            return this.species.compareTo(otherAnimal.species);
        }
        return Integer.compare(this.age, otherAnimal.age);
    }

    @Override
    public String toString() {
        return species + " - Age: " + age;
    }
}


class Dog extends Animal {
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }


    @Override
    public int compareTo(Animal otherAnimal) {
        if (otherAnimal instanceof Dog) {

            Dog otherDog = (Dog) otherAnimal;
            int breedComparison = this.breed.compareTo(otherDog.breed);
            if (breedComparison == 0) {

                return super.compareTo(otherAnimal);
            } else {
                return breedComparison;
            }
        } else {

            return super.compareTo(otherAnimal);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - Breed: " + breed;
    }
}


public class TestAnimal {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Cat", 3));
        animalList.add(new Dog("Dog", 5, "Labrador"));
        animalList.add(new Animal("Lion", 7));
        animalList.add(new Dog("Dog", 4, "Golden Retriever"));
        animalList.add(new Animal("Elephant", 10));


        Collections.sort(animalList);


        System.out.println("Posortowana lista zwierząt i psów:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }
}