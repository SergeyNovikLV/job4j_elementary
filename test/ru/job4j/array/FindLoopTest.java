package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas16Then4() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 12, 16, 18};
        int value = 16;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas20Then5() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 12, 16, 18};
        int value = 20;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
}