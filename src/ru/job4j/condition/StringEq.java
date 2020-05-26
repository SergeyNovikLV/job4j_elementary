package ru.job4j.condition;
/*
допишите код в методе check. Нужно сравнить переменную root и переменную login.
 */
public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
       return access;
   }

    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
