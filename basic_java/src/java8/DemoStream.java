package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        // Create
        Stream<String> stream = list.stream();

        // Working with parallel
        Stream<String> pstream = list.parallelStream();

        DemoStream demo = new DemoStream();
//        demo.count(list);
        demo.iterate(list);
//        demo.filter(list);
//        demo.mapping(list);
//        demo.matching(list);
//        demo.collecting(list);
//        demo.reduction();
    }

    private void count(List<String> list) {
        Stream<String> stream = list.stream();
        long countAll = list.stream().count();
        long countDistinct = stream.distinct().count();
        System.out.println(countAll + ", " + countDistinct);
    }

    private void iterate(List<String> list) {
        list.forEach(e -> System.out.println(">" + e));
        list.stream().forEach(e -> System.out.println(">>" + e));
        boolean found = list.stream().anyMatch(e -> e.contains("a"));

        list.parallelStream().forEach(e -> System.out.println(">>>" + e));
    }

    private void filter(List<String> list) {
        Stream<String> results = list.stream().filter(e -> e.contains("a"));
        results.forEach(e -> System.out.println("=" + e));
    }

    private void mapping(List<String> list) {
        Stream<String> results = list.stream().map( e -> e.toUpperCase());
        results.forEach(e -> System.out.println(">>" + e));
    }

    private void matching(List<String> list) {
        boolean isValid = list.stream()
                .anyMatch(element -> element.contains("h")); // true
        boolean isValidOne = list.stream()
                .allMatch(element -> element.contains("h")); // false
        boolean isValidTwo = list.stream()
                .noneMatch(element -> element.contains("h")); // false

        System.out.println("isValid= " + isValid);
        System.out.println("isValidOne= " + isValidOne);
        System.out.println("isValidTwo= " + isValidTwo);
    }

    private void reduction() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result1 = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total 1: " + result1);

        int result2 = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Total 2: " + result2);

        Integer result3 = integers.stream().reduce(0, Integer::sum);
        System.out.println("Total 3: " + result3);
    }

    private void collecting(List<String> list) {
        List<String> resultList = list.stream()
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        resultList.forEach(e -> System.out.println("c>" + e));
    }
}
