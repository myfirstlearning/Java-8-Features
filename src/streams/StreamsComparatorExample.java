package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

    }

    public static List<Student> sortStudentsByGPA(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

    }

    public static List<Student> sortStudentsByGPADesc(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

    }


    public static void main(String[] args) {

        System.out.println("Students sorted by Name : ");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Students sorted by GPA : ");
        sortStudentsByGPA().forEach(System.out::println);

        System.out.println("Students sorted by GPA DESC : ");
        sortStudentsByGPADesc().forEach(System.out::println);

    }

}
