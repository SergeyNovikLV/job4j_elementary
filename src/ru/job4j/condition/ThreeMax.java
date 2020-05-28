package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first > second) {
            result = first;
        } else {
            result = second;
        }

        if (result < third) {
            result = third;
        } else {
            return result;
        }
        return result;
    }
}
