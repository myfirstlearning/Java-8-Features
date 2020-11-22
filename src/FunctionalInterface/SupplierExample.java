package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {


    public static void main(String[] args) {

        Supplier<Student> studentSupplier = ()->{
            return new Student("Amruth",3,3.0,"male", Arrays.asList("Cooking","Music","Singing"));
        };

        Supplier<List<Student>> listSupplier = ()-> StudentDataBase.getAllStudents();

        System.out.println("Supplier Result : " + studentSupplier.get());
        System.out.println("Supplier Result : " + listSupplier.get());
    }

}
