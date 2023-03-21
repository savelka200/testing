import java.util.Scanner;

public class test4 {
    public static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности в см:");
        int rad = scanner.nextInt();
        System.out.println("Площадь круга: " + calculateCircleArea(rad) +  " см.кв.");
        System.out.println("Длина окружности: " + calculateCircleLength(rad) +  " см.");
    }
    public static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }
    public static double calculateCircleLength(int radius) {
        return 2 * PI * radius;
    }
}
