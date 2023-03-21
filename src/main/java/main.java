import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String[]products={"хлеб","гречневая крупа","молоко"};
        int[]prices={50,14,80};
        int[]prod=new int[products.length];
        int sum=0;
        int currentPrice=0;
        int number=0;
        int count=0;

        for(int i=0; i<products.length; i++){
            System.out.println(i+1+". "+products[i]+"-"+prices[i]+"руб");
        }
        while (true){
            System.out.println("Введите номер продукта и количество через пробел. Для окончания введите 'end'");
            String input=scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            String[]parts=input.split(" ");
            number=Integer.parseInt(parts[0])-1;
            count=Integer.parseInt(parts[1]);

            prod[number] = count;
            currentPrice = prices[number];

            sum = sumproduct(sum, prod, currentPrice, number);
        }
        for (int i=0;i<products.length;i++){
            if(prod[i]>0);
            System.out.println("товар: "+products[i]+"; цена: "+prices[i]+"; кол-во: "+prod[i]+"; итог: "+prices[i]*prod[i]);
        }
        System.out.println("итог: "+sum+" руб");
    }
    public static Integer sumproduct(int sumProduct, int[] prod, int currentPrice, int number){
        int sum = 0;
        return sum = sumProduct+prod[number]*currentPrice;
    }

}
