package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        //student name and there activities in a map
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa()>=3.9);

        Map<String, List<String>> student_map = StudentDataBase.getAllStudents().stream()
                .filter(studentPredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(student_map);

        Map<String, List<String>> student_map_parallel = StudentDataBase.getAllStudents().parallelStream()
                .filter(studentPredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(student_map_parallel);

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);




    }


}
