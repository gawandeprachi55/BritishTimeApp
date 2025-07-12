import org.british.time.com.util.NumberToWordConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberToWordsConverterTest {

    private final NumberToWordConverter converter = new NumberToWordConverter();

    @Test
    void testToHourWord() {
        assertEquals("one", converter.toHourWord(1));
        assertEquals("twelve", converter.toHourWord(12));
    }

    @Test
    void testToMinuteWord() {
        assertEquals("five", converter.toMinuteWord(5));
        assertEquals("twenty-one", converter.toMinuteWord(21));
        assertEquals("one minute", converter.toMinuteWord(1));
    }
}
