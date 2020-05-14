package in.blagush.learn.java.streams.parallel;

import java.util.Arrays;

public class CompareStrAndPrllStr {

    public static void main(String[] args) {

        System.out.print(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().orElseGet(() -> 8));

    }

}
