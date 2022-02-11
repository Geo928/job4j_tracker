package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ItemAscByNameTest {
    @Test
    public void sortAscending() {
        List<Item> items = Arrays.asList(
                new Item("One"),
                new Item("Two"),
                new Item("Three"),
                new Item("Four")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Four"),
                new Item("One"),
                new Item("Three"),
                new Item("Two")
        );
        assertThat(items, is(expected));
    }
}