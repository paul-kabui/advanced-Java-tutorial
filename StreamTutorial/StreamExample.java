package StreamTutorial;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample{
    public static void main(String[] args){

        //cannot reuse intermidiate operation
        Stream<String> fruitStream = Stream.of("apple", "banana", "orange", "lemon","pineapple");
        fruitStream.filter(
            s -> s.contains("a"))
            .map(s -> s.toUpperCase())
            .sorted()
            .forEach(System.out::println);

        //collect the elements of a stream to a collection
        //LinkedHashSet maintains the inssertion order
        List<String> fruitsList = Arrays.asList("apple", "banana", "orange","apple","lemon","pineapple");
        Set<String> fruitSet = fruitsList
            .stream()
            .filter(s -> s.contains("a"))
            .map(s -> s.toUpperCase())
            .collect(Collectors.toCollection(() -> new LinkedHashSet<>()));
        System.out.println(fruitSet);

        // Reusing intermidiate operation of a stream chain
        Supplier<Stream<String>> streamSupplier = () -> {
            return  Stream.of("apple", "banana", "orange", "lemon","pineapple").map(String:: toUpperCase)
            .sorted();

        };
        //continue the above operation
        //TODO continue from page 362
        streamSupplier.get()
        .filter(s -> s.startsWith("a"))
        .forEach(System.out::println);
        
    } 
}