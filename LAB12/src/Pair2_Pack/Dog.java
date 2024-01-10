package Pair2_Pack;

import Animals_Pack.Animal;

public class Dog extends Animal {

    private int age;

    public Dog(int age, int age1) {
        super(age);
        this.age = age1;
    }
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}

class Generic{
    public static <T extends Animal> T  findMinMaxAge(Dog[] arr,  Pair<? super Dog> result){
        return null;
    }
}
