import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryCalculatorTest {

    BinaryCalculator underTest;

    @BeforeEach
    void setUp() {

        underTest = new BinaryCalculator();
    }

    @Test
    void testBinaryAdd() {
        assertEquals("111", underTest.binaryAdd("100","11"));
    }

    @Test
    void testBinarySubtract() {
        assertEquals("100", underTest.binarySubtract("1001","101"));
    }

    @Test
    void testBinaryMultiply() {
        assertEquals("10000", underTest.binaryMultiply("100", "100"));
    }

    @Test
    void testBinaryDivide() throws InvalidDivisionException {
        assertEquals("10", underTest.binaryDivide("110", "11"));
    }

    @Test
    void testBinaryDivideShouldThrowInvalidDivisionExceptionWhenDividingByZero() {
        assertThrows(InvalidDivisionException.class, () -> {
            underTest.binaryDivide("1","0");});
    }
}