package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    public static void groupStudentByGender(){

        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                                                                .stream()
                                                                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);

    }

    public static void customizedGroupingBy(){

        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .collect(Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);

    }

    public static void twoLevelGrouping_1(){
        Map<Integer,Map<String,List<Student>>> studentTwoLevelMap = StudentDataBase.getAllStudents()
                                                                    .stream()
                                                                    .collect(Collectors.groupingBy(Student::getGradeLevel,
                                                                            Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE")));


        System.out.println(studentTwoLevelMap);
    }

    public static void twoLevelGrouping_2(){
        Map<String,Integer> studentTwoLevelMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                                                Collectors.summingInt(Student::getNoteBooks)));


        System.out.println(studentTwoLevelMap);
    }

    public static void threeArgumentGroupBy(){

        LinkedHashMap<String, Set<Student>> studentThreeArgGroup = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new,toSet()));


        System.out.println(studentThreeArgGroup);
    }

    public static void calculateTopGpa(){

        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                                                                    .stream()
                                                                    .collect(groupingBy(Student::getGradeLevel,
                                                                            maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptional);


        Map<Integer, Student> studentMapOptional1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        System.out.println(studentMapOptional1);

    }

    public static void calculateLeastGpa(){

        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptional);


        Map<Integer, Student> studentMapOptional1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        System.out.println(studentMapOptional1);

    }

    public static void main(String[] args) {

        groupStudentByGender();

        customizedGroupingBy();

        twoLevelGrouping_1();

        twoLevelGrouping_2();

        calculateTopGpa();

        calculateLeastGpa();

    }


}
