package ru.job4j.condition;
/*
В переменную result запишите результат сравнения переменных first и second.
 - сравнить, что first больше second.
- сравнить, что first меньше second.
 - сравнить, что first равна second.
 */
public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result1 = first > second; // first больше second?
                System.out.println(result1);

        boolean result2 = first < second; // first меньше second?
                System.out.println(result2);

        boolean result3 = first == second; // first равна second?
                System.out.println(result3);
    }
}