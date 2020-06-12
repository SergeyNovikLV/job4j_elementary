package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        int leftLastEl = left[left.length - 1];
        int rightLastEl = right[right.length - 1];
            if (leftLastEl != rightLastEl) {
                result = false;
            }
        return result;
    }
}
