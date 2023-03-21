import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slotcount = player.getSlotsCount();

        while (true) {
            int slot =  scanner.nextInt();
            if(slot == -1){
                System.out.println("Game over!");
                break;
            }
            else if(slot(slot,slotcount) == true){
                player.shotWithWeapon(slot-1);
            }

        }

    }
    public static boolean slot(int slot, int slotsCount){
        if(slot > slotsCount || slot == 0){
            System.out.println("Введите правильный слот!");
            return false;
        }
        else{
            return true;
        }
    }

}
