package ru.job4j.converter;
/*

Задание.

1. Реализовать метод конвертации рублей в евро и доллары.

Вам нужно заменить -1 на формулу для вычисления валюты.

1 доллар = 60 рублей.
1 евро = 70 рублей.

2. Доработайте метод main. Добавьте в него примеры выводов всех видов конвертаций.
*/

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        // Euro convertation test
        int inRbl = 140;
        int expectedEuro = 2;
        int out = rubleToEuro(inRbl);
        boolean passedRblTest = expectedEuro == out;
        System.out.println("140 rubles are 2. Test result : " + passedRblTest);
        // Dollar convertation test
        int inRbl2 = 140;
        int expectedDollar = 2;
        int out2 = rubleToDollar(inRbl2);
        boolean passedEurTest = expectedDollar == out2;
        System.out.println("140 rubles are 2. Test result : " + passedEurTest);
    }
}
