package java8;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkshopStream {

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        inputs.add("A");
        inputs.add("B");
        inputs.add("   ");
        inputs.add("SOMKIAT");
        inputs.add("PUI");
        inputs.add("A");
        inputs.add("B");

        // Filter
        List<String> list2 = inputs.stream()
                .distinct()
                .filter(element -> element.contains("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);


        // Distinct
        Stream<String> result1 = inputs.stream().distinct();
        System.out.println("Size after distinct = "+ result1.count());

        List<String> list = inputs.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Size after distinct = "+ list.size());

        // Count
        long count = inputs.stream().count();
        System.out.println(count);

        // Create stream
        inputs.forEach(System.out::println);
        inputs.parallelStream().forEach(System.out::println);

    }

    void demoForEach(List<String> inputs) {
        for (String element: inputs) {
            System.out.println(element);
        }

        inputs.forEach( element -> System.out.println(element));
        inputs.forEach(System.out::println); // Method reference
        inputs.forEach(WorkshopStream::show); // Method reference
        inputs.forEach(element -> show(element));
    }

    static void show(String input) {
        System.out.println(input);
    }

}
