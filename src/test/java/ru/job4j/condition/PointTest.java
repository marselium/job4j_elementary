package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out = Point.dist(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when11to51then4() {
        double expected = 4;
        int x1 = 1;
        int x2 = 1;
        int y1 = 5;
        int y2 = 1;
        double out = Point.dist(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1422to3047then18pt79() {
        double expected = 18.79;
        int x1 = 14;
        int x2 = 22;
        int y1 = 30;
        int y2 = 47;
        double out = Point.dist(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1414to10050012001000then995999() {
        double expected = 995999;
        int x1 = 14;
        int x2 = 14;
        int y1 = 1005001;
        int y2 = 2001000;
        double out = Point.dist(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.001);
    }
}