package Animals_Pack;

public class Dog extends Animal {
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
    class Generic{
    public static <T extends Animal> T findMax(T element1,T element2){
        if (element1.getAge() > element2.getAge()){
            return element1;
        }
        else if (element1.getAge() < element2.getAge()){
            return element2;
        } else if (element1.getAge() == element2.getAge()){
            return null;
        }
        return null;
    }
}

class Test{
    public static void main(String[] args) {
        Animal animal = new Animal(19);
        Animal animal1 =new Animal(13);
        Dog dog = new Dog(12,"Adam");
        Dog dog1 = new Dog(24,"Puszek");

        Animal maxAnimal = Generic.findMax(animal,animal1);
        System.out.println(maxAnimal.getAge());
        Dog maxDog = Generic.findMax(dog,dog1);
        System.out.println(maxDog.getName().length());
    }
}
