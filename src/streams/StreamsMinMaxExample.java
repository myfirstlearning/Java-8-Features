package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {


    public static int findMaxValue(List<Integer> integerList){

        return integerList.stream()
                //6->Y
                //7->Y
                //8->Y
                //9->Y
                //10->Y
                //X variable holds the max value for each element in the iterator
                .reduce(0,(x,y)->x>y ? x : y);

    }

    public static int findMinValue(List<Integer> integerList){

        return integerList.stream()
                //6->Y
                //7->Y
                //8->Y
                //9->Y
                //10->Y
                //X variable holds the max value for each element in the iterator
                .reduce(0,(x,y)->x<y ? x : y);

    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){

        return integerList.stream()
                //6->Y
                //7->Y
                //8->Y
                //9->Y
                //10->Y
                //X variable holds the max value for each element in the iterator
                .reduce((x,y)->x>y ? x : y);

    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){

        return integerList.stream()
                //6->Y
                //7->Y
                //8->Y
                //9->Y
                //10->Y
                //X variable holds the max value for each element in the iterator
                .reduce((x,y)->x<y ? x : y);

    }


    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        int maxValue = findMaxValue(integerList);
        System.out.println(" Max value is : " + maxValue);

        Optional<Integer> maxValOptional = findMaxValueOptional(new ArrayList<>());
        if(maxValOptional.isPresent()){
            System.out.println("MaxVal using optional : " + maxValOptional.get());
        }else {
            System.out.println("No max val found");
            System.out.println("Input list is empty");
        }

        //without optional
        int minVal = findMinValue(integerList);
        System.out.println("MinVal : " + minVal);

        Optional<Integer> minValOptional = findMinValueOptional(new ArrayList<>());
        if(minValOptional.isPresent()){
            System.out.println("MinVal using optional : " + minValOptional.get());
        }else {
            System.out.println("No min val found");
            System.out.println("Input list is empty");
        }

    }

}
