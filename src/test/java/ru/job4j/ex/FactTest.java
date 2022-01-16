package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenWhenNumberLessThanNull() {
    new Fact().calc(-1);
    }

    @Test
    public void whenFactorialIsSix() {
        int expected = 6;
        int rsl = new Fact().calc(3);
        assertThat(rsl, is(expected));
    }
}