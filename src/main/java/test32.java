import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public class test32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        String ch1 = scanner.nextLine();
        System.out.println("Введите второе число");
        String ch2 = scanner.nextLine();
        Float ch2d = Float.parseFloat(ch2);
        Float ch1d = Float.parseFloat(ch1);
        sravdouble(ch1d, ch2d);

    }
    public static String sravdouble(float ch1d, float ch2d) {

        if(ch1d-ch2d>0){
            System.out.println("Число "+ch1d+" больше числа "+ch2d);
            return "Число "+ch1d+" больше числа "+ch2d;
        }
        else if(ch2d-ch1d>0){
            System.out.println("Число "+ch2d+" больше числа "+ch1d);
            return "Число "+ch2d+" больше числа "+ch1d;
        }
        else{
            System.out.println("Числа равны");
            return "Числа равны";
        }
    }
}
