package AdvJava.Aug10SatJavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4,66,55,44,66,77,88,99,88,77,66,55,66,77,88,99,88,77));

        //creating an object of stream, which has no value and doing nothing
        //until we use it to process
        Stream<Integer> integerStream = numbers.stream();

        List<Integer> processedList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x % 11 == 0)
                .collect(Collectors.toList());

        Map<String, Integer> collect = numbers.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x % 11 == 0)
                .distinct()
                .collect(Collectors.toMap(k -> "Number: "+k,v -> v));

        System.out.println(processedList);
        System.out.println(collect);

    }
}
