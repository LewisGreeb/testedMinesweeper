import pkg.minesweeper.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    @Test
    public void test_XCoord(){
        Safe node = new Safe();
        node.setXCoord(5);
        assertEquals(5, node.getXCoord(), "X coordinates do not match.");
    }

    @Test
    public void test_YCoord(){
        Safe node = new Safe();
        node.setYCoord(5);
        assertEquals(5, node.getYCoord(), "Y coordinates do not match.");
    }

}
