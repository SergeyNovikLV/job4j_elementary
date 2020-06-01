package ru.job4j.loop;
/*
Простым считается число, которое делится только на себя и на единицу.
Пример:
Если number =  5, метод должен вернуть true, так как 5 делится только 1 и на 5.
Если number = 4, метод должен вернуть false, так как 4 делится на 2 и на 4.
Объяснение:
Вы должны использовать цикл for. Внутри цикла нужно добавить оператор if с проверкой деления на число.
Проверка деления без остатка выполняется оператором %.

Например:
Проверим, что число num делится на 5 без остатка.
int num = ...;
...
boolean canDivBy5 = false;
if ((num % 5) == 0) {
   canDivBy5 = true;
}
Опишем алгоритм программы. Взять числа от 2 до number - 1 и проверить, что число number делится на эти числа. Если делится,
то это не простое число и продолжать дальнейшие вычисления не нужно. То есть тут нужно поставить оператор break;

 */
public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            return false;
        }
        for  (int index = 2; index < number; index++) {
            if ((number % index) == 0) {
                prime = false;
                break;
            }
       }
        return prime;
    }
}
