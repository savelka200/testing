import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test31Test1 {

    @Test
    void mainusnpol() {
        double res = test31.mainusn(1500);
        assertEquals(90, res);
    }
    @Test
    void mainusnotr() {
        double res = test31.mainusn(1500);
        assertEquals(100, res);
    }
}