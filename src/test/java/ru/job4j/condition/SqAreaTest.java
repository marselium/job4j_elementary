package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP33K13Square18pt06() {
        double expected = 18.06;
        int p = 33;
        double k = 13;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP123K321Square11pt71() {
        double expected = 11.71;
        int p = 123;
        double k = 321;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}