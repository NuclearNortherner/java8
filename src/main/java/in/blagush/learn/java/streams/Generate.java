package in.blagush.learn.java.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Generate {
    public static void main(String[] args) {

        // 1 empty stream
        Stream stream = Stream.empty();
        System.out.println(stream.count());

        // 2 stream from List
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        Stream<String> stream1 = list.stream();
        System.out.println(stream1.count());

        // 3 stream from Map
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);

        stream = map.entrySet().stream();
        System.out.println(stream.count());
        list.forEach(System.out::println);
        map.entrySet().stream().forEach(System.out::println);

    }
}
