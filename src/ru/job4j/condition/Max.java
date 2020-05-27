package ru.job4j.condition;
/*
Метод max должен возвращать максимальное число из first и second.
То есть в конце метода должно быть ключевое слово return, которое возвращает вычисленное значение.
 */
public class Max {
    public static int max(int left, int right) {
        boolean maxInt = left > right;
        int result = maxInt ? left : right;
        return result;
    }
}