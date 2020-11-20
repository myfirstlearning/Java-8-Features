package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void printName(){
        List<Student> studentList = StudentDataBase.getAllStudents();
    }

    public static void main(String[] args) {

        Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
        c1.accept("java8");

    }

}
