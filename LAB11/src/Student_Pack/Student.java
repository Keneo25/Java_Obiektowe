package Student_Pack;

public class Student implements Cloneable {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class StudentTest{
    public static void main(String[] args) throws CloneNotSupportedException {
        Student RealStudent = new Student("Adam", 20 ,4.5);
        Student FakeStudent = (Student) RealStudent.clone();

        RealStudent.setGrade(6.0);
        System.out.println(RealStudent.getGrade());
        System.out.println(FakeStudent.getGrade());
    }
}
