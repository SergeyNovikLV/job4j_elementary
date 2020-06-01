package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double amountPercent = (amount * percent) / 100;
            amount = (int) (amount + amountPercent - salary);
            year++;
        }
        return year;
    }
}
