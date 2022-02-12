package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        String[] first = left.split(". Task.");
        String[] second = right.split(". Task.");
        for (int i = 0; i < Math.max(first.length, second.length); i++) {
            int one = Integer.parseInt(first[i]);
            int two = Integer.parseInt(second[i]);
            result = Integer.compare(one, two);
        }
        return result;
    }
}
