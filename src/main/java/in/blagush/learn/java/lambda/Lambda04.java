package in.blagush.learn.java.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {

        // old way
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int number : numbers) {
            System.out.println(number);
        }

        // new way by java8.in.blagush.learn.java.lambda
        numbers.forEach((Integer value) -> System.out.println(value));

        // new way by reference methods
        numbers.forEach(System.out::println);

    }
}
