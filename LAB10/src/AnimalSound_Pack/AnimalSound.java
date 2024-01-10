package AnimalSound_Pack;

public interface AnimalSound {
    String  makeSound();


    interface  DomesticAnimalSound{
        String makeHappySound();

    }
}

class Dog implements AnimalSound , AnimalSound.DomesticAnimalSound {


    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String makeHappySound() {
        return "Wag tail";
    }
}
