import java.util.Scanner;

public class test2 {
    public static double main(int yer, int da) {
        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int day;
        while (true){
            System.out.println("Введите год в в формате 'yyyy'");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней в году");
            int days = scanner.nextInt();
            if (year % 400 == 0) {
                day = 366;
            } else if (year % 100 == 0) {
               day = 365;
            } else if (year % 4 == 0) {
                day = 366;
            } else {
                day = 365;
            }
            if(days == day){
                right++;
                System.out.println("Правильно!");
            }
            else{
                System.out.println("Неправильно! Правильных ответов:"+right);
                break;
            }
        }
        return right;
    }
}
