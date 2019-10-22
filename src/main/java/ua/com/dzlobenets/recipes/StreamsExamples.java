package ua.com.dzlobenets.recipes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExamples {
    static void simpleArraysAsStream() {
        String[] groups = {"Guns N Roses", "UFO", "Skid Row", "Cinderella"};
        String collectedGroups = String.join(",", groups);
        System.out.println(collectedGroups);
    }

    static void simpleIterate() {
        Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
                .limit(10)
                .forEach(System.out::print);

        String collect = Stream.iterate(LocalDateTime.now(), d -> d.plusDays(1))
                .limit(10)
                .map(Objects::toString)
                .collect(Collectors.joining(" | "));
        System.out.println(collect);

    }


    static void genereste(){
        String collect = Stream.generate(ThreadLocalRandom.current()::nextInt)
                .limit(10)
                .map(Objects::toString)
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }

    public static void main(String[] args) {
        simpleArraysAsStream();
        simpleIterate();
        genereste();

    }
}
