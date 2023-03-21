import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void slottrue() {
        int slot = 1;
        int slotcount = 3;
        assertEquals(true, main.slot(slot, slotcount));
    }
    @Test
    void slotfalse() {
        int slot = 1;
        int slotcount = 3;
        assertEquals(false, main.slot(slot, slotcount));
    }
}