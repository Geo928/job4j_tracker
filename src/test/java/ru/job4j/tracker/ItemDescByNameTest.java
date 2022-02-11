package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {
    @Test
    public void descendingSort() {
        List<Item> items = Arrays.asList(
                new Item("One"),
                new Item("Two"),
                new Item("Three"),
                new Item("Four")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Two"),
                new Item("Three"),
                new Item("One"),
                new Item("Four")
        );
        assertThat(items, is(expected));
    }
}
