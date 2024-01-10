package Employee_Pack;

import java.util.Arrays;

public class Employee implements Cloneable {
    private String name;
    private double[] salaries;

    public Employee(String name, double[] salaries) {
        this.name = name;
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalary(int month, double amount) {
        if (month >= 1 && month <= 12) {
            salaries[month - 1] = amount;
        } else {
            System.out.println("Nieprawidłowy numer miesiąca.");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        double[] originalSalaries = {2000.0, 2100.0, 2200.0, 2300.0, 2400.0, 2500.0, 2600.0, 2700.0, 2800.0, 2900.0, 3000.0, 3100.0};
        Employee originalEmployee = new Employee("John", originalSalaries);
        Employee clonedEmployee = (Employee) originalEmployee.clone();

        originalEmployee.setSalary(5, 2600.0);

        System.out.println("Zarobki oryginalnego pracownika: " + Arrays.toString(originalEmployee.getSalaries()));
        System.out.println("Zarobki sklonowanego pracownika: " + Arrays.toString(clonedEmployee.getSalaries()));
    }
}