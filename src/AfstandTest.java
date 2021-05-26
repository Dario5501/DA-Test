import org.junit.Test;

import static org.junit.Assert.*;

public class AfstandTest {
    Afstand A = new Afstand();

    @Test
    public void getAfstand() {
        assertEquals("het is dichtbij", A.getAfstand(2.0));
        assertEquals("het is dichtbij", A.getAfstand(1.5));
        assertEquals("het is verder weg", A.getAfstand(2.5));
        assertEquals("het is verder weg", A.getAfstand(3));
        assertEquals("het is ver weg", A.getAfstand(5));
        assertEquals("het is ver weg", A.getAfstand(9));
        assertEquals("geen locatie gekozen", A.getAfstand(0));
    }
}