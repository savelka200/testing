import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void sumproductright() {
        int sum=15;
        int currentPrice=15;
        int number=1;
        String[]products={"хлеб","гречневая крупа","молоко"};
        int[]prod=new int[products.length];
        int mn = main.sumproduct(sum,prod,currentPrice,number);
        assertEquals(15,mn);
    }
    @Test
    void sumproductfalse() {
        int sum=15;
        int currentPrice=15;
        int number=1;
        String[]products={"хлеб","гречневая крупа","молоко"};
        int[]prod=new int[products.length];
        int mn = main.sumproduct(sum,prod,currentPrice,number);
        assertEquals(10,mn);
    }
}