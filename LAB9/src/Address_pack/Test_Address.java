package Address_pack;

public class Test_Address {
    public static void main(String[] args) {
        Adress adress1 = new Adress("Main Street", 123, 12345, "Cityville");
        Person person1 = new Person("Ola", "Nowak", adress1);


        System.out.println(person1);
    }
}
