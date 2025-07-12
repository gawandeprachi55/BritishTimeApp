package org.british.time.com.util;

public class NumberToWordConverter {

    private static final String[] HOURS = {
            "", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve"
    };

    public String toHourWord(int hour) {
        return HOURS[hour];
    }

    public String toMinuteWord(int minute) {
        if (minute == 1) return "one minute";
        if (minute <= 20 || minute == 30) return basicNumberToWord(minute);
        return "twenty-" + basicNumberToWord(minute - 20);
    }

    private String basicNumberToWord(int number) {
        String[] words = {
                "", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen", "twenty"
        };
        return words[number];
    }
}
