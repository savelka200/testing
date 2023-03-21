import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test31Test2 {

    @Test
    void mainusn2otr() {
        double res = test31.mainusn2(1500, 1000);
        assertEquals(90, res);
    }
    @Test
    void mainusn2pol() {
        double res = test31.mainusn2(1500, 1000);
        assertEquals(75, res);
    }
}