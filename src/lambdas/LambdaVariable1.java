package lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    static int value = 5;

    public static void main(String[] args) {
        //local variable
        //int value = 4;

        Consumer<Integer> c1 = (i)->{
            value++;
            System.out.println(value+i);
        };

        c1.accept(4);

    }

}
