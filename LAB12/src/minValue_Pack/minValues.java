package minValue_Pack;

import java.util.Arrays;

public class minValues {
    public static <T extends Comparable<T>> T minValue(T[] array){
            if(array == null || array.length == 0){
                throw new IllegalArgumentException("Błąd");
            }
            T min = array[0];
            for(int i =1;i<array.length;i++){
                if(array[i].compareTo(min) < 0){
                    min = array[i];
                }
            }
            return min;
    }
}

class minValuesTest{
    public static void main(String[] args) {
        Integer[] intArray = {4,2,1,4,5};
        System.out.println("Najmniejsza: " + minValues.minValue(intArray));

        Double[] doubleArray = {3.4,5.8,22.9,5.0,1.7,1.6};
        System.out.println("Najmniejsza: " + minValues.minValue(doubleArray));

        String[] strArray = {"apple", "banana", "orange", "pear"};
        System.out.println("Najmniejsza wartość w tablicy łańcuchów znaków: " + minValues.minValue(strArray));

        Person[] person = {
                new Person("Adam", 18),
                new Person("Kamil", 20),
                new Person("Mariola", 11),
                new Person("Agata", 7),

        };
        System.out.println("Wynik: " + minValues.minValue(person));

    }
}
class Person implements Comparable<Person>{
    String namme;
    int age;
    public Person(String namme, int age) {
        this.namme = namme;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "namme='" + namme + '\'' +
                ", age=" + age +
                '}';
    }
}
