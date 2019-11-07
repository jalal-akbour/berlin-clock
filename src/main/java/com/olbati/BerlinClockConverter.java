package com.olbati;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BerlinClockConverter {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public BerlinClock digital_to_berlin_convertor (String digitalTimeValue) {
        BerlinClock berlinClockValue = new BerlinClock();

        LocalTime time = LocalTime.parse(digitalTimeValue, formatter);

        String singleMinutesRow = calculate_single_minutes_row(time.getMinute());
        berlinClockValue.setSingleMinutesRow(singleMinutesRow);

        return berlinClockValue;
    }

    public String calculate_single_minutes_row (int digitalTimeMinutes) {

        int singleMinutesValue = digitalTimeMinutes % 5;
        StringBuilder singleMinutesRow = new StringBuilder();

        for (int i = 1; i <= singleMinutesValue; i++) {
            singleMinutesRow.append("Y");
        }

        while (singleMinutesRow.length() < 4) {
            singleMinutesRow.append("O");
        }
        return singleMinutesRow.toString();
    }
}
