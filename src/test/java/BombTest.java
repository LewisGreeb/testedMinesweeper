import pkg.minesweeper.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BombTest {

    @Test
    public void test_blow(){
        Bomb node = new Bomb();
        assertFalse(node.blow(), "Blow method should return false.");
    }

}
