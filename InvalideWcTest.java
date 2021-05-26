package com.company;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class InvalideWcTest {
InvalideWc A = new InvalideWc();


    @Test
    void weiger() {
        assertFalse(A.Weiger(false,true,false));
        assertTrue(A.Weiger(true,false,true));
        assertTrue(A.Weiger(true, true , false));
        assertFalse(A.Weiger(false, false,false));
    }
}