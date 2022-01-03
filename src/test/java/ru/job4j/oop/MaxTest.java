package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax10() {
        int expected = 10;

        int result = Max.max(1, 10);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax13() {
        int expected = 13;
        int result = Max.max(13, 10, 12);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax17() {
        int expected = 17;
        int result = Max.max(10, 17, 12, 11);
        Assert.assertEquals(expected, result);
    }
}