package Student_Pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam", 4.5, 2002));
        students.add(new Student("Konrad", 3.5, 2001));
        students.add(new Student("Bartek", 1.5, 2002));
        students.add(new Student("Piotr", 1.4, 2002));
        students.add(new Student("Łukasz", 5, 2005));


        Collections.sort(students);
        System.out.println("Posortowana Lista: \n");
        for(Student student : students){
            System.out.println(student.getName() + " Średnia ocen: " + student.averageGrade);
        }
    }


}
