package in.blagush.learn.java.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMap {

    public static void main(String[] args) {

        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(v -> v.length() <= 5));
        System.out.println(map);

        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));



    }

}
