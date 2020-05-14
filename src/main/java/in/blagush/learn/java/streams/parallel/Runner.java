package in.blagush.learn.java.streams.parallel;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        Arrays.asList(1,2,3,4,5,6)
                .parallelStream()
                .forEach(x -> System.out.print(x + ""));

    }
}
