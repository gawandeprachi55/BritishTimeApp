package org.british.time.com.service;

import org.british.time.com.util.NumberToWordConverter;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Service
public class TimeSpokenFormatter {

    private final NumberToWordConverter converter = new NumberToWordConverter();

    public String toSpokenForm(LocalTime time) {
        int hour = time.getHour();
        int minute = time.getMinute();

        if (hour == 0 && minute == 0) return "midnight";
        if (hour == 12 && minute == 0) return "noon";

        int hour12 = hour % 12 == 0 ? 12 : hour % 12;
        int nextHour12 = (hour + 1) % 12 == 0 ? 12 : (hour + 1) % 12;

        if (minute == 0) {
            return converter.toHourWord(hour12) + " o'clock";
        } else if (minute == 15) {
            return "quarter past " + converter.toHourWord(hour12);
        } else if (minute == 30) {
            return "half past " + converter.toHourWord(hour12);
        } else if (minute == 45) {
            return "quarter to " + converter.toHourWord(nextHour12);
        } else if (minute < 30) {
            return converter.toMinuteWord(minute) + " past " + converter.toHourWord(hour12);
        } else {
            return converter.toMinuteWord(60 - minute) + " to " + converter.toHourWord(nextHour12);
        }
    }
}
