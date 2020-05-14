package in.blagush.learn.java.optional;

import java.util.Optional;

public class Runner {

    public static void main(String[] args) {

        // Create

        String name1 = "John";
        Optional<String> optional1 = Optional.of(name1);
        System.out.println(optional1);

        String name2 = null;
        Optional<String> optional2 = Optional.ofNullable(name2);
        System.out.println(optional2);

        Optional<String> optional3 = Optional.empty();
        System.out.println(optional3);

        // Modify

        String name4 = "John";
        Optional<String> optional4 = Optional.of(name4).filter(String::isEmpty);
        System.out.println(optional4);

        String name5 = "John";
        Optional<String> optional5 = Optional.of(name5).map(i -> i.replace("o","a"));
        System.out.println(optional5);

        String name6 = "John";
        Optional<String> optional6 = Optional.ofNullable(name6)
                .map(i -> i.replace("o","a"))
                .or(() -> Optional.of("No name"));
        System.out.println(optional6);

        // Check

        String name7 = "John";

        boolean hasValue1 = Optional.ofNullable(name7).isPresent();
        System.out.println(hasValue1);

        boolean hasValue2 = Optional.ofNullable(name7).isEmpty();
        System.out.println(hasValue2);

        // Getting values

        String name8 = "John";
        Optional<String> optional8 = Optional.ofNullable(name8);
        if (optional8.isPresent()) {
            System.out.println(optional8.get());
        }

        String name9 = "John";
        Optional<String> optional9 = Optional.ofNullable(name9);
        System.out.println(optional9.orElse("No name"));

        String name10 = "John";
        Optional<String> optional10 = Optional.ofNullable(name10);
        System.out.println(optional10.orElseGet(() -> "No name"));

        String name11 = "John";
        Optional<String> optional11 = Optional.ofNullable(name11);
        System.out.println(optional11.orElseThrow(IllegalArgumentException::new));

        // Conditions

        String name12 = "John";
        Optional.ofNullable(name12)
                .ifPresent(i -> System.out.println("Name: " + i));

        String name13 = "John";
        Optional.ofNullable(name13)
                .ifPresentOrElse(i -> System.out.println("Name: " + i),
                        () -> System.out.println("No name"));

        // Stream

        String name14 = "John";
        Optional.of(name14)
        .stream()
        .forEach(System.out::println);



    }
}
