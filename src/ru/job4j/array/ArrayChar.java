package ru.job4j.array;
import java.util.Arrays;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
         if (pref[index] == word[index]) {
             result = true;
         } else {
             result = false;
         }
        }
        return result;
    }
}
