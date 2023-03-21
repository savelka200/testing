import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test2Test {

    @Test
    void mainright() {
        int a = test2.main();
        assertEquals(-15,a);
    }
    @Test
    void mainfalse() {
        int a = test2.main();
        assertEquals(15,a);
    }
}