package se.terhol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotStringTest {

    @Test
    void notString() {
        assertEquals("not candy", NotString.notString("candy"));
        assertEquals("not x", NotString.notString("x"));
        assertEquals("not bad", NotString.notString("not bad"));
        assertEquals("not bad", NotString.notString("bad"));
        assertEquals("not", NotString.notString("not"));
        assertEquals("not is not", NotString.notString("is not"));
        assertEquals("not no", NotString.notString("no"));
    }
}