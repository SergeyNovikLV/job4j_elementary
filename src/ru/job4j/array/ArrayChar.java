package ru.job4j.array;
import java.util.Arrays;
/*
исправил == на !=
 */
public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
