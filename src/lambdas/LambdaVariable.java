package lambdas;

import java.util.function.Consumer;

public class LambdaVariable {


    public static void main(String[] args) {

        int i = 10;
        Consumer<Integer> c1 = (i1)->{
            System.out.println("Value is : " + i);
        };

        c1.accept(4);

    }

}
