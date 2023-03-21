import java.util.Scanner;

public class test1 {
    public static String main() {
        String day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в в формате 'yyyy'");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            day = "В году 366 дней";
            System.out.println(day);
        } else if (year % 100 == 0) {
            day = "В году 365 дней";
            System.out.println(day);
        } else if (year % 4 == 0) {
            day = "В году 366 дней";
            System.out.println(day);
        } else {
            day = "В году 365 дней";
            System.out.println(day);
        }

        return day;
    }
}
