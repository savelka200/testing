import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int x2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int x3 = scanner.nextInt();
        System.out.println("Сумма чисел = " + sum(x1,x2,x3));
    }
    public static int sum(int a, int b, int c){
        return  a+b+c;
    }
}
