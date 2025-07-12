import org.british.time.com.service.TimeParser;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TimeParserTest {

    private final TimeParser parser = new TimeParser();

    @Test
    void testValidTime() {
        LocalTime time = parser.parse("13:45");
        assertEquals(13, time.getHour());
        assertEquals(45, time.getMinute());
    }

    @Test
    void testInvalidTimeFormat() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse("25:00"));
    }

    @Test
    void testWrongPattern() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse("1 PM"));
    }
}
