package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String first = left.split("\\.")[0];
        String second = right.split("\\.")[0];
        return Integer.compare(Integer.parseInt(first), Integer.parseInt(second));
    }

    public static void main(String[] args) {
        LexSort lex = new LexSort();
        int rsl = lex.compare("1. Task.", "2. task. 3.  5. 5.");
        System.out.println(rsl);
    }
}

