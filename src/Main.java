import java.time.LocalDate;
import java.util.Locale;

public class Main {
    private final static int CURRENTYEAR = LocalDate.now().getYear();

    public static void main(String[] args) {
// case 1
        System.out.println("case1");
        printLeapOrNotLeapYear(2022);
// case 2
        System.out.println("case 2");
        printVersionOS(2022, 1);
// case 3
        System.out.println("case 3");
        printCalculateTimeDelivery(5);
        printCalculateTimeDelivery(40);
        printCalculateTimeDelivery(5000);
        printCalculateTimeDelivery(105);
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printLeapOrNotLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год");
            return;
        }
        System.out.println(year + " - не високосный год");
    }

    public static boolean isNowYear(int year) {
        return year == CURRENTYEAR;
    }

    public static String getVersionOS(int versionOS) {
        if (versionOS == 0) {
            return "IOS";
        } else if (versionOS == 1) {
            return "Android";
        }
        return "пользователь ввёл не те данные, которые предполагались";
    }

    public static void printVersionOS(int year, int versionOS) {
        if (isNowYear(year)) {
            System.out.println("установите полную версию приложения для " + getVersionOS(versionOS) + "по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для " + getVersionOS(versionOS) + "по ссылке");
        }
    }

    public static void printCalculateTimeDelivery(int distance) {
        if (distance > 0 && distance < 3000) {
            System.out.println("Время доставки = " + ((distance + 19) / 40 + 1));
            return;
        }
        System.out.println("Доставка не осуществляется");
    }
}