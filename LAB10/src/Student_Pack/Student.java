package Student_Pack;

public class Student implements Comparable<Student>{
    String name;
    double averageGrade;
    int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public int compareTo(Student student) {
        return Double.compare(student.averageGrade, this.averageGrade);
    }
}






