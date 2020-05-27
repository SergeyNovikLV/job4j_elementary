package ru.job4j.condition;
/*
Внутри метода max нужно сравнить попарно первое со вторым и максимум из них сравнить с третьим числом.

В методе нужно использовать несколько раз тернарный оператор условия.

 */

public class MultiMax {

    public int max(int first, int second, int third) {
       int max = first > second ? first : second;
       int result = max > third ? max : third;

            return result;
        }
    }
