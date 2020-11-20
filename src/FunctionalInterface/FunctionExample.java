package FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name)->name.toUpperCase();

    static Function<String, String> addSomething = (name)->name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is : " + function.apply("java8"));
        System.out.println("Result andThen is : " + function.andThen(addSomething).apply("java8"));
        //compose executes the addsomething first and passes result to function
        System.out.println("Result andThen is : " + function.compose(addSomething).apply("java8"));
    }

}
