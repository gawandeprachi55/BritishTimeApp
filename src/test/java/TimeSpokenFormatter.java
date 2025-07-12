import org.british.time.com.service.TimeSpokenFormatter;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeSpokenFormatterTest {

    private final TimeSpokenFormatter formatter = new TimeSpokenFormatter();

    @Test
    void testNoonAndMidnight() {
        assertEquals("noon", formatter.toSpokenForm(LocalTime.of(12, 0)));
        assertEquals("midnight", formatter.toSpokenForm(LocalTime.of(0, 0)));
    }

    @Test
    void testOClock() {
        assertEquals("three o'clock", formatter.toSpokenForm(LocalTime.of(3, 0)));
    }

    @Test
    void testQuarterPast() {
        assertEquals("quarter past four", formatter.toSpokenForm(LocalTime.of(4, 15)));
    }

    @Test
    void testHalfPast() {
        assertEquals("half past seven", formatter.toSpokenForm(LocalTime.of(7, 30)));
    }

    @Test
    void testQuarterTo() {
        assertEquals("quarter to ten", formatter.toSpokenForm(LocalTime.of(9, 45)));
    }

    @Test
    void testPastAndTo() {
        assertEquals("twenty past five", formatter.toSpokenForm(LocalTime.of(5, 20)));
        assertEquals("twenty-five to eight", formatter.toSpokenForm(LocalTime.of(7, 35)));
    }
}
