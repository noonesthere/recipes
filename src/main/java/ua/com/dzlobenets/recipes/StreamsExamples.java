package ua.com.dzlobenets.recipes;

public class StreamsExamples {
    static void simpleArraysAsStream() {
        String[] groups = {"Guns N Roses", "UFO", "Skid Row", "Cinderella"};
        String collectedGroups = String.join(",", groups);
        System.out.println(collectedGroups);
    }

    public static void main(String[] args) {
        simpleArraysAsStream();
    }
}
