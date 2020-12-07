package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        for (String s : names){
            System.out.println(s);
        }

        names.remove(0);

        System.out.println(names);

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);

    }

}
