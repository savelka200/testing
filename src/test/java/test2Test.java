import static org.junit.jupiter.api.Assertions.*;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class test2Test {

    @Test
    public void mainusntrue() {
        String inp = "2025";
        InputStream in = new ByteArrayInputStream(inp.getBytes());
        System.setIn(in);
        String a = test1.main();
        String day = "В году 365 дней";
        assertEquals(day, a);
    }
    @Test
    public void mainusnfalse() {
        String inp = "2025";
        InputStream in = new ByteArrayInputStream(inp.getBytes());
        System.setIn(in);
        String a = test1.main();
        String day = "В году 366 дней";
        assertEquals(day, a);
    }
}