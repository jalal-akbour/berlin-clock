package com.olbati;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BerlinClockConverter {

    final static private String yellowLamp = "Y";
    final static private String redLamp = "R";
    final static private String offLamp = "O";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public BerlinClock digital_to_berlin_convertor (String digitalTimeValue) {
        BerlinClock berlinClockValue = new BerlinClock();

        LocalTime time = LocalTime.parse(digitalTimeValue, formatter);

        String singleMinutesRow = calculate_single_minutes_row(time.getMinute());
        berlinClockValue.setSingleMinutesRow(singleMinutesRow);

        String fiveMinutesRow = calculate_five_minutes_row(time.getMinute());
        berlinClockValue.setFiveMinutesRow(fiveMinutesRow);

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

    public String calculate_five_minutes_row (int digitalTimeMinutes) {

        int singleMinutesValue = digitalTimeMinutes / 5;
        StringBuilder singleMinutesRow = new StringBuilder();

        for (int i = 1; i <= singleMinutesValue; i++) {
            if (i % 3 == 0) {
                singleMinutesRow.append(redLamp);
            } else {
                singleMinutesRow.append(yellowLamp);
            }
        }

        while (singleMinutesRow.length() < 11) {
            singleMinutesRow.append(offLamp);
        }
        return singleMinutesRow.toString();
    }
}
