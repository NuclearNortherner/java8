package in.blagush.learn.java.collections;

import java.util.*;
import java.util.function.BiFunction;

public class NewMethods {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Magician");
        list1.add("Assistant");
        System.out.println(list1); // [Magician, Assistant]
        list1.removeIf(s -> s.startsWith("A"));
        System.out.println(list1); // [Magician]


        List<Integer> list2 = Arrays.asList(1, 2, 3);
        list2.replaceAll(x -> x * 2);
        System.out.println(list2); // [2, 4, 6]

        List<String> cats = Arrays.asList("Annie", "Ripley");
        cats.forEach(System.out::println);


        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1: v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Tom", "Tram");

        favorites.merge("Tom", "Skyride", mapper);

        System.out.println(favorites);

        System.out.println("---");

        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);
        BiFunction<String, Integer, Integer> mapper2 = (k, v) -> v + 1;
        Integer jenny = counts.computeIfPresent("Jenny", mapper2);
        Integer sam = counts.computeIfPresent("Sam", mapper2);
        System.out.println(counts); // {Jenny=2}
        System.out.println(jenny); // 2
        System.out.println(sam); // null


    }

}
