import TestNG.Converter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.*;

public class ConverterTest {
    Converter converter;
    @BeforeClass
    public void setUp() {
        converter = new Converter();
    }

    @Test(enabled = true, expectedExceptions = IllegalArgumentException.class,//развернутая аннотация
            expectedExceptionsMessageRegExp = "error data")
    public void testConvertCelsiusToFahrenheitException() {
        converter.convertCelsiusToFahrenheit(-300);
    }
    public void testConvertCelsiusToFahrenheit() {
        double actual = converter.convertCelsiusToFahrenheit(10.0);
        double expected = 50.;
        assertEquals(actual, expected, 0.001, " Test failed as...");
    }
    @Test()
    public void testCheckCelsius() {
        boolean condition = converter.checkCelsius(-45);
        assertTrue(condition);
    }

    @Test(expectedExceptionsMessageRegExp = "error data")
    public void testConvertCelsiusToFahrenheitExceptionMessage() {
        double celsius = -300;
        try {
            converter.convertCelsiusToFahrenheit(celsius);
            fail("Test for celsius " + celsius
                    + " should have thrown a IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("error data", e.getMessage());
        }
    }

    @Test(timeOut = 1_000)
    public void testTime() {
        IntStream.range(-273, 100_000_000)
                .boxed()
                .forEach(t -> converter.convertCelsiusToFahrenheit(t));
    }

    @Test(timeOut = 250)
    public void testTime1() {
        for (int t = -273; t < 100_000_000; t++) {
            converter.convertCelsiusToFahrenheit(t);
        }
    }
    @AfterClass
    public void tierDown(){
        converter = null;
    }
}