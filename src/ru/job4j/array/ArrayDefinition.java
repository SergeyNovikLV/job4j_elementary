package ru.job4j.array;

import java.util.Arrays;

/*
Задание.


2. Создайте внутри метода main массив String на 4 ячейки. Дайте имя переменной созданного массива - names.

3. Заполните массив произвольными именами. Заполнение производить через обращение по индексу.

Например.

names[0] = "Petr Arsentev";
4. После этого выведите каждую ячейку на консоль.
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Aleksej";
        names[2] = "Ivan";
        names[3] = "Sergej";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
