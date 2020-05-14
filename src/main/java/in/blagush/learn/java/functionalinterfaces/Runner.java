package in.blagush.learn.java.functionalinterfaces;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Runner {

    public static void main(String[] args) {

        // Supplier<T>   - get()

        System.out.println("\n---Supplier<T>---\n");

        Supplier<LocalDateTime> supplier1 = LocalDateTime::now;
        System.out.println(supplier1.get());

        Supplier<String> supplier2 = () -> new String("Hoho");
        System.out.println(supplier2.get());


        // Consumer<T> and BiConsumer<T, U>   -  accept

        System.out.println("\n---Consumer<T> and BiConsumer<T, U>---\n");

        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("cmon");

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> biConsumer1 = map::put;
        biConsumer1.accept("Chicken", 100);
        System.out.println(map);


        // Predicate<T> and BiPredicate<T, U>    - testing.test()

        System.out.println("\n---Predicate<T> and BiPredicate<T, U>---\n");

        Predicate<String> predicate1 = String::isEmpty;
        System.out.println(predicate1.test("Test"));

        Predicate<Integer> predicate2 = x -> x > 10;
        System.out.println(predicate2.test(12));

        BiPredicate<Integer, Integer> biPredicate1 = (x, y) -> (x > 5) && (y > 5);
        System.out.println(biPredicate1.test(6,7));


        // 2 дефолтных метода Predicate:
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        // and(Predicate)
        Predicate<String> brownEggs = egg.and(brown);
        System.out.println(brownEggs.test("really brown and cheap eggs"));

        // negate()
        Predicate<String> otherEggs = egg.and(brown.negate());
        System.out.println(otherEggs.test("really brown and cheap eggs"));


        // Function<T, R> and BiFunction<T, U, R>

        System.out.println("\n---Function<T, R> and BiFunction<T, U, R>---\n");

        Function<String, Integer> function1 = String::length;
        System.out.println(function1.apply("cluck"));

        BiFunction<String, String, String> function2 = (string, toAdd) -> string + toAdd;
        System.out.println(function2.apply("hey, ", "you"));


        // UnaryOperator<T> and BinaryOperator<T>    - apply

        System.out.println("\n---UnaryOperator<T> and BinaryOperator<T>---\n");

        UnaryOperator<String> unary1 = x -> x.toUpperCase();
        System.out.println(unary1.apply("ho"));

        BinaryOperator<String> binary1 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(binary1.apply("cmon, ", "babe"));




    }


}
