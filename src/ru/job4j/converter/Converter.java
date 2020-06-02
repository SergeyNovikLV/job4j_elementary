package ru.job4j.converter;

/**
 * Class Converter решение задачи Ном. 5. Конвертер валюты  из первого раздела Тип данных
 * @author novik
 * @since 20.05.2020
 * @version 1
*/

public class Converter {

    /**
     * Method rubleToEuro.
     * @param value - value.
     * @return rsl - результат конвертации в евро.
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Method rubleToDollar.
     * @param value - value.
     * @return rsl - результат конвертации в доллары.
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Method main, вызывает методы конвертации и выводит на экран результы конвертации.
     * @param args - args.
     */

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        /*
         * Код для проверки корректности конвертации в евро.
         * переменная in - входные данные количество рублей.
         * переменная expectedEuro -ожидаемое значение количество евро.
         * переменная out -результат работы программы.
         * переменная passedRblTest - сравнивает  ожидаемое значение с результатом вычеслений.
         */
        int inRbl = 140;
        int expectedEuro = 2;
        int out = rubleToEuro(inRbl);
        boolean passedRblTest = expectedEuro == out;
        System.out.println("140 rubles are 2. Test result : " + passedRblTest);

        /*
         * Код для проверки корректности конвертации в доллары.
         * переменная in - входные данные количество рублей.
         * переменная expectedEuro -ожидаемое значение количество долларах.
         * переменная out -результат работы программы.
         * переменная passedRblTest - сравнивает  ожидаемое значение с результатом вычеслений.
         */
        int inRbl2 = 140;
        int expectedDollar = 2;
        int out2 = rubleToDollar(inRbl2);
        boolean passedEurTest = expectedDollar == out2;
        System.out.println("140 rubles are 2. Test result : " + passedEurTest);
    }
}
