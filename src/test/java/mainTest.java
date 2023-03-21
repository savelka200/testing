import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void isWintrue() {
        char CROSS = 'X';
        char ZERO = 'O';
        char[][] field = new char[3][3];
        int r = 1;
        int c = 2;
        boolean isCrossTurn = true;
        field[r][c] = isCrossTurn ? CROSS : ZERO;
        boolean test = main.isWin(field, isCrossTurn ? CROSS : ZERO);
        assertEquals(false, test);
    }
    @Test
    void isWinfalse() {
        char CROSS = 'X';
        char ZERO = 'O';
        char[][] field = new char[3][3];
        int r = 1;
        int c = 2;
        boolean isCrossTurn = true;
        field[r][c] = isCrossTurn ? CROSS : ZERO;
        boolean test = main.isWin(field, isCrossTurn ? CROSS : ZERO);
        assertEquals(true, test);
    }
}