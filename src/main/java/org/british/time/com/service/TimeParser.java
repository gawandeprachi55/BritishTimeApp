package org.british.time.com.service;

import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
@Component
public class TimeParser {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("H:mm");

    public LocalTime parse(String input) {
        try {
            return LocalTime.parse(input, FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid time format");
        }
    }
}
