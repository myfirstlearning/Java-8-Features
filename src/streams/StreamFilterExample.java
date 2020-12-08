package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static List<Student> filterSudents(){

        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter(student -> student.getGender().equals("female")) //Stream<Student>
                //filters and sends only the students whose gender is female
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toList());

    }


    public static void main(String[] args) {


        //System.out.println("filterStudents : " + filterSudents());
        filterSudents().forEach(System.out::println);

    }

}
