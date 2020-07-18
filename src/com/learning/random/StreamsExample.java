package com.learning.random;

//a simple program to demonstrate the use of stream in java

import java.util.*;
import java.util.stream.*;

public class StreamsExample {

    public static void main(String args[]) {

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        System.out.println(square);

        // create a list of String
        List<String> names =
                Arrays.asList("CCC", "AAA", "DDD", "EEE", "FFF");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("A")).
                collect(Collectors.toList());
        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        // demonstration of reduce method
        int even =
                number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

        System.out.println(even);

        //------------------------------------------------

        // Converting String array to stream
        String[] arr = { "CCC", "AAA", "DDD", "EEE", "FFF" };

        // Using Arrays.stream to convert an
        // array into Stream
        Stream<String> stm = Arrays.stream(arr);

        // Displaying elements in Stream
        stm.forEach(str -> System.out.print(str + " "));

        //Convert stream to Array
        Object[] array = stm.toArray();

        // Print the array of stream
        System.out.println("Array from Stream: "
                + Arrays.toString(array));
    }
}
