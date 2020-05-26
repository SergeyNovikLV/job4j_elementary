package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void checkDistanceBetweenCoordinates() {
        int in1 = 0;
        int in2 = 2;
        int in3 = 0;
        int in4 = 2;
        double expected = 4.0;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);

    }
}