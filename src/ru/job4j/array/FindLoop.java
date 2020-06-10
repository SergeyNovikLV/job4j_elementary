package ru.job4j.array;
/*
  нужно сделать поиск по массиву, но не во всем массиве, а только в указанном диапазоне.
    data - массив чисел,

    el - элемент, который нужно найти,

    start - индекс, с которого начинаем поиск,

    finish - индекс, которым заканчиваем поиск.

     Напишите минимум два тест-метода: один метод находит элемент, а другой нет.

     Доработайте требуемый функционал класса
 */
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
            }
        }
        return rst;
    }
        public static int indexOf(int[] data, int el, int start, int finish) {
            int rst = -1; // если элемента нет в массиве, то возвращаем -1.for (int index = 0; index < data.length; index++) {
               for (int index = start; index <= finish; index++) {
                   if (data[index] == el) {
                       rst = index;
                   }
               }
            return rst;
        }
    }

