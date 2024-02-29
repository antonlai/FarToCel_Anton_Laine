
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void fahrenheitToCelsius() {
        double result = Converter.fahrenheitToCelsius(100);
        assertEquals(37.7, result, 0.1);
    }

    @Test
    void celsiusToFahrenheit() {
        double result = Converter.celsiusToFahrenheit(37);
        assertEquals(98.6, result, 0.001);
    }

    @Test
    void convertKelToFar() {
        double result = Converter.convertKelToFar(300.1);
        assertEquals(80, result, 1);
    }
}