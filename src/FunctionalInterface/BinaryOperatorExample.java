package FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (a,b)-> a*b;
    static Comparator<Integer> comparator = (a,b)-> a.compareTo(b);

    public static void main(String[] args) {

        System.out.println("BinaryOperator Result : " + binaryOperator.apply(3,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of MaxBy is : " + maxBy.apply(4,5));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of MaxBy is : " + minBy.apply(4,5));

    }

}
