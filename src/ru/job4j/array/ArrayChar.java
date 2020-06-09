package ru.job4j.array;
import java.util.Arrays;
/*
Метод принимает два массива символов.
В цикле for вам нужно сравнить значения ячеек с одинаковым индексом.
Если все ячейки из массива  соответствуют таким же ячейкам в массиве word, значит, нужно вернуть true.
 index
 */
public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
         if (word[index] == pref[index]) {
             result = true;
         } else {
             result = Arrays.equals(word, pref);
         }
        }
        return result;
    }
}
