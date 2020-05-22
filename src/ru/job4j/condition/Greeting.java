package ru.job4j.condition;
/*
- создайте переменную с именем idea типа String и присвойте ей значение "I like Java!";
 - выведите на консоль эту переменную через команду System.out.println(idea);
 - присоедините к переменной idea строку "But I am a newbie.";
- создайте переменную year с типом int и присвойте ей текущий год.
 - присоедините к переменной idea переменную year;
- выведите на консоль эту переменную через команду System.out.println(idea);

Вы должны создать одну строку, вывести ее на печать.
Потом к этой строки конкатенацией добавить вторую часть фразы - вывести потом на печать.
А потом добавить третью часть - год и выввести на печать.
 */
public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String idea2 = idea + " But I am a newbie. ";
        System.out.println(idea2);
        int year = 2020;
        String idea3 = idea2 + year;
        System.out.println(idea3);
   }
}