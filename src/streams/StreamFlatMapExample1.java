package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMapExample1 {

    public static void main(String[] args) {

        String[][] data = new String[][]{{"a","b"},{"c","d"},{"e","f"}};

        Stream<String[]> temp = Arrays.stream(data);

        //filter a stream of string[], and return a string[]?
        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

    }

}
