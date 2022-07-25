import pkg.minesweeper.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SafeTest {

    @Test
    public void test_AdjacentBombs(){
        Safe node = new Safe();
        node.setAdjacentBombs(5);
        assertEquals(5, node.getAdjacentBombs(), "Number of adjacent bombs does not match.");
    }

    @Test
    public void test_Uncovered(){
        Safe node = new Safe();
        assertFalse(node.isUncovered(), "Safe node should return false by default.");
        node.setUncovered(true);
        assertTrue(node.isUncovered(), "Safe node should return true.");
    }

}
