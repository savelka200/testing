import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dohod = 0;
        int roshod = 0;
        int oroshod = 0;
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Добавить доход");
            System.out.println("2. Добавить расход");
            System.out.println("3. Вывести результат");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена.");
                break;
            }
            int op = Integer.parseInt(input);
            switch (op) {
                case 1:
                    System.out.println("Добавьте доход");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    dohod += money;
                    break;
                case 2:
                    System.out.println("Введите расход");
                    String rashod = scanner.nextLine();
                    roshod = Integer.parseInt(rashod);
                    oroshod = oroshod + roshod;
                    break;
                case 3:
                    System.out.println("Доходы: " + dohod);
                    System.out.println("Расходы: " + oroshod);
                    mainusn(dohod);
                    mainusn2(dohod, roshod);
                    double eco = ((dohod - oroshod) * 0.15) - (dohod * 0.06);
                    System.out.println("Экономия: " + eco);
                    break;
            }
        }
    }

    public static double mainusn(int dohod) {
        double usnd = dohod * 0.06;
        System.out.println("УСН доходы: " + usnd);
        return (usnd);
    }

    public static double mainusn2(int dohod, int roshod) {
        double usn2 = (dohod - roshod) * 0.15;
        System.out.println("УСН доходы минус расходы: " + usn2);
        return (usn2);
    }
}


