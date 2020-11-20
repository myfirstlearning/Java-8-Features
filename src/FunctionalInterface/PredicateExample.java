package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate = (i) -> {return i%2==0;};
    static Predicate<Integer> p1 = (i)->i%2==0;
    static Predicate<Integer> p2 = (i)-> i%5==0;

    public static void predicateAnd(){
        //AND operation
        System.out.println("Predicate AND Result is : " + p1.and(p2).test(10)); //predicate chaining
        System.out.println("Predicate AND Result is : " + p1.and(p2).test(9)); //predicate chaining

    }

    public static void predicateOr(){
        //OR operation
        System.out.println("Predicate OR Result is : " + p1.or(p2).test(10)); //predicate chaining
        System.out.println("Predicate OR Result is : " + p1.or(p2).test(8)); //predicate chaining

    }

    public static void predicateNegate(){
        //Negate operation
        System.out.println("Predicate Negate Result is : " + p1.or(p2).negate().test(10)); //predicate chaining
        System.out.println("Predicate Negate Result is : " + p1.or(p2).negate().test(8)); //predicate chaining

    }

    public static void main(String[] args) {

        System.out.println(predicate.test(4));
        System.out.println(p1.test(4));

        predicateAnd();
        predicateOr();
        predicateNegate();

    }

}
