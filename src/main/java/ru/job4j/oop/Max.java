package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }
}
