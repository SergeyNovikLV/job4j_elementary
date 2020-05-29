package ru.job4j.loop;
/*
Факториал для числа 5 будет равен 120 (1 * 2 * 3 * 4 * 5).
Объяснение:
1. Используя цикл for, вы должны пройтись от 1 до n и перемножить эти числа.
2. Факториал для 0 должен возвращать единицу.
 */
public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}