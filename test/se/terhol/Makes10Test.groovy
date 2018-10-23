package se.terhol

class Makes10Test extends GroovyTestCase {
    void testMakes10() {
        assertTrue(Makes10.makes10(9, 10))
        assertFalse(Makes10.makes10(9, 9))
        assertTrue(Makes10.makes10(10, 1))
        assertTrue(Makes10.makes10(10, 10))
        assertTrue(Makes10.makes10(8, 2))
        assertFalse(Makes10.makes10(8, 3))
        assertTrue(Makes10.makes10(10, 42))
        assertTrue(Makes10.makes10(12, -2))
    }
}
