public class Main {
    public static void leapYear(int year) {
        year = 2022;
        if (((year % 4 == 0) && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void main(String[] args) {
//      1 Задание
        int year = 2022;
        leapYear(year);
    }
}