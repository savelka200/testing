import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test32Test {

    @Test
    void sravdoubleotr() {
        String res = test32.sravdouble(152, 253);
        assertEquals("Число "+152.0+" больше числа "+253.0, res);
    }
    @Test
    void sravdoublepol() {
        String res = test32.sravdouble(152, 253);
        assertEquals("Число "+253.0+" больше числа "+152.0, res);
    }
}