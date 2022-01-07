package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int length = 0;
        for (int i = 0; i < size; i++) {
            Item rsl = items[i];
            if (rsl != null) {
                result[length] = rsl;
                length++;
            }
        }
        return Arrays.copyOf(result, length);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int length = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                result[length] = items[i];
                length++;
            }
        }
        return Arrays.copyOf(result, length);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}