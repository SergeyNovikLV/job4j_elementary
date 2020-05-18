package ru.job4j.calculator;

/*
1. Реализуйте методы manWeight и womanWeight. Нужно дописать код, чтобы методы возвращали идеальный вес для мужчины и женщины.
Вместо -1 вам нужно написать формулу.
Добавьте в метод main демонстрацию работы методов.
Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
*/

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        double woman = Fit.womanWeight(170);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}