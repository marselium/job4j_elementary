package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to51then4() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 1);
        double dist = a.distance(b);
        double expected = 4.0;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when1422to3047then29pt68() {
        Point a = new Point(14, 22);
        Point b = new Point(30, 47);
        double dist = a.distance(b);
        double expected = 29.68;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when14100500to141200100then995999() {
        Point a = new Point(14, 100500);
        Point b = new Point(14, 200600);
        double dist = a.distance(b);
        double expected = 100100.0;
        Assert.assertEquals(expected, dist, 0.01);
    }
}