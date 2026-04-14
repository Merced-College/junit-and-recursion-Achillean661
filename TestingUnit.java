import org.junit.Test;
import static org.junit.Assert.*;

public class TestingUnit {

    @Test
    public void testCountHi_1() {
        assertEquals(1, TestingRecursion.countHi("xxhixx"));
    }

    @Test
    public void testCountHi_2() {
        assertEquals(5, TestingRecursion.countHi("hhhhhhhhhhhhhhhhhhhhhhhhhhihihihihiererere"));
    }

    @Test
    public void testCountHi_3() {
        assertEquals(2, TestingRecursion.countHi("xxhixxhxxxxxxxhixxxxxixxxxxx"));
    }

    @Test
    public void testCountHi_4() {
        assertEquals(0, TestingRecursion.countHi("asdasdsafdfthghfgjhgjghj"));
    }

    @Test
    public void testCountHi_5() {
        assertEquals(0, TestingRecursion.countHi("null"));
    }

    @Test
    public void testStringClean_1() {
        assertEquals("abcd", TestingRecursion.stringClean("abcd"));
    }

    @Test
    public void testStringClean_2() {
        assertEquals("abcd", TestingRecursion.stringClean("aaaaaaaaaaaaabcd"));
    }

    @Test
    public void testStringClean_3() {
        assertEquals("hihi", TestingRecursion.stringClean("hhhhiiiihhhiiii"));
    }

    @Test
    public void testStringClean_4() {
        assertEquals("helo", TestingRecursion.stringClean("hello"));
    }

    @Test
    public void testStringClean_5() {
        assertEquals("fod", TestingRecursion.stringClean("food"));
    }
    
}
