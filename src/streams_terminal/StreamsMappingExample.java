package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {

        List<String> nameList = StudentDataBase.getAllStudents()
                                        .stream()
                                        .collect(Collectors.mapping(Student::getName,Collectors.toList()));

        nameList.forEach(System.out::println);

        Set<String> nameSet = StudentDataBase.getAllStudents()
                                            .stream()
                                            .collect(Collectors.mapping(Student::getName,Collectors.toSet()));

        nameSet.forEach(System.out::println);


    }


}
