package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>(100);
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item i : items) {
            if (key.equals(i.getName())) {
                result.add(i);
            }
        }
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (Item i : items) {
            if (i.getId() == id) {
                rsl = i.getId();
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = indexOf(id) != -1;
         if (rsl) {
           items.set(id, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = indexOf(id) != -1;
         if (rsl) {
             items.remove(id);
        }
        return rsl;
    }
}