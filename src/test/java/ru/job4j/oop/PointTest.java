package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point x = new Point(0, 2);
        Point y = new Point(0, 0);
        double z = x.distance(y);
        Assert.assertEquals(expected, z, 0.01);
    }

    @Test
    public void when12to12then1dot41() {
        double expected = 1.41;
        Point x = new Point(1, 1);
        Point y = new Point(2, 2);
        double z = x.distance(y);
        Assert.assertEquals(expected, z, 0.01);
    }

    @Test
    public void when13to48then4dot47() {
        double expected = 4.47;
        Point x = new Point(1, 4);
        Point y = new Point(3, 8);
        double z = x.distance(y);
        Assert.assertEquals(expected, z, 0.01);
    }

    @Test
    public void when157to4910then5dot83() {
        double expected = 5.83;
        Point x = new Point(1, 5, 7);
        Point y = new Point(4, 9, 10);
        double distance = x.distance3d(y);
        Assert.assertEquals(expected, distance, 0.01);
    }

    @Test
    public void when296to61012then7dot28() {
        double expected = 7.28;
        Point x = new Point(2, 9, 6);
        Point y = new Point(6, 10, 12);
        double distance = x.distance3d(y);
        Assert.assertEquals(expected, distance, 0.01);
    }
}