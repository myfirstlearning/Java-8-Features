package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minBy_example(){
        return StudentDataBase.getAllStudents()
                        .stream()
                        .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy_example(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {

        if(minBy_example().isPresent()){
            System.out.println("minBy_example : " + minBy_example());
        } else {
            System.out.println("Not Found");
        }

        if(maxBy_example().isPresent()){
            System.out.println("maxBy_example : " + maxBy_example());
        } else {
            System.out.println("Not Found");
        }

    }


}
