package Employee_Pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    String firstName;
    String lastName;
    String position;


    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(o.lastName.length(), this.lastName.length());
    }

}


class Employee_Test{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ola", "Michałowska", "1"));
        employees.add(new Employee("Adam", "DEDwdw", "2"));
        employees.add(new Employee("Konrad", "Trzciński", "3"));
        employees.add(new Employee("Kamil", "Śmiłekk", "4"));

        Collections.sort(employees);



        System.out.println("Posortowane: ");
        for(Employee employee : employees){
            System.out.println("Imie: "+ employee.getFirstName() + " Nazwisko: " + employee.getLastName()+ " Liczba: " + employee.getLastName().length() + " Pozycja: " +employee.getPosition() );
        }

    }

}
