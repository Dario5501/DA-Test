import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrijsTest {

    @Test
    void prijsBerekenen() {
        Prijs A = new Prijs();
        assertEquals(0.0,A.PrijsBerekenen(false, true, false, 2));
        assertEquals(0.0,A.PrijsBerekenen(false, true, false, 4));
        assertEquals(0.5,A.PrijsBerekenen(true, false, false, 5));
        assertEquals(0.75,A.PrijsBerekenen(true, false, true, 3));
        assertEquals(1.0,A.PrijsBerekenen(false, false, true, 1));
        assertEquals(1.0,A.PrijsBerekenen(true, false, false, 2));
        assertEquals(0.5,A.PrijsBerekenen(true, false, true, 5));
    }
}