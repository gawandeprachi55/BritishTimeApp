package org.british.time.com.controller;

import org.british.time.com.service.TimeSpokenFormatter;
import org.british.time.com.service.TimeParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.Map;

@RestController
@RequestMapping("/api/time")
@CrossOrigin(origins = "*")
public class TimeController {

    private final TimeSpokenFormatter formatter;
    private final TimeParser parser;

    public TimeController(TimeSpokenFormatter formatter, TimeParser parser) {
        this.formatter = formatter;
        this.parser = parser;
    }

    @GetMapping("/speak")
    public ResponseEntity<?> speak(@RequestParam(name = "input", required = false) String input) {
        if (input == null || input.isBlank()) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", "Query parameter 'input' is required. Format HH:MM"));
        }

        try {
            LocalTime time = parser.parse(input);  // throws IllegalArgumentException if invalid
            String spoken = formatter.toSpokenForm(time);
            return ResponseEntity.ok(Map.of("spoken", spoken));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", ex.getMessage()));
        }
    }
}
