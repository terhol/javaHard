package se.terhol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Makes10Test {

    @Test
    void makes10() {
        assertTrue(Makes10.makes10(9, 10));
        assertFalse(Makes10.makes10(9, 9));
        assertTrue(Makes10.makes10(10, 1));
        assertTrue(Makes10.makes10(10, 10));
        assertTrue(Makes10.makes10(8, 2));
        assertFalse(Makes10.makes10(8, 3));
        assertTrue(Makes10.makes10(10, 42));
        assertTrue(Makes10.makes10(12, -2));
    }
}