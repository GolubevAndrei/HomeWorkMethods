import java.time.LocalDate;

public class Main {
    public static void leapYear(int year) {
        if (((year % 4 == 0) && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void OS(int clientOS, int yearOS) {
        if (clientOS == 1 && yearOS > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && yearOS > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int delivery(int deliveryDistance) {
        int dayDelivery = 0;
        boolean dis20 = deliveryDistance < 20;
        boolean dis2060 = deliveryDistance >= 20 && deliveryDistance <= 60;
        boolean dis60 = deliveryDistance > 60 && deliveryDistance <= 100;
        if (dis20) {
            dayDelivery += 1;
        } else if (dis2060) {
            dayDelivery += 2;
        } else if (dis60) {
            dayDelivery += 3;
        }
        return dayDelivery;
    }
    public static void main(String[] args) {

//      1 Задание

        int year = LocalDate.now().getYear();
        leapYear(year);

//      2 Задание

        int yearOS = LocalDate.now().getYear();
        int clientOS = 1;
        OS(clientOS, yearOS);

//      3 Задание

        int deliveryDistance = 95;
        int dayDelivery = delivery(deliveryDistance);
        System.out.println("Потребуется дней: " + dayDelivery);
    }
}