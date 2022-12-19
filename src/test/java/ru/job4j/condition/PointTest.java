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

    @Test
    public void when123To456then4pt24() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double dist = a.distance(b);
        double expected = 5.19;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when000To100then1() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 0, 0);
        double dist = a.distance(b);
        double expected = 1;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when3023To3022139then20() {
        Point a = new Point(30, 2, 3);
        Point b = new Point(30, 22, 139);
        double dist = a.distance(b);
        double expected = 137.46;
        Assert.assertEquals(expected, dist, 0.01);
    }

}