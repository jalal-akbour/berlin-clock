package com.olbati;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BerlinClockConverter {

    private final static String yellowLamp = "Y";
    private final static String redLamp = "R";
    private final static String lampOff = "O";

    private final static int fiveHoursRowLength = 4;
    private final static int singleHoursRowLength = 4;
    private final static int fiveMinutesRowLength = 11;
    private final static int singleMinutesRowLength = 4;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public BerlinClock digital_to_berlin_converter (String digitalTimeValue) {
        BerlinClock berlinClockValue = new BerlinClock();

        LocalTime time = LocalTime.parse(digitalTimeValue, formatter);

        String singleMinutesRow = calculate_single_minutes_row(time.getMinute());
        berlinClockValue.setSingleMinutesRow(singleMinutesRow);

        String fiveMinutesRow = calculate_five_minutes_row(time.getMinute());
        berlinClockValue.setFiveMinutesRow(fiveMinutesRow);

        String singleHoursRow = calculate_single_hours_row(time.getHour());
        berlinClockValue.setSingleHoursRow(singleHoursRow);

        String fiveHoursRow = calculate_five_hours_row(time.getHour());
        berlinClockValue.setFiveHoursRow(fiveHoursRow);

        String secondsLamp = calculate_seconds_lamp_value(time.getSecond());
        berlinClockValue.setSecondsLamp(secondsLamp);

        return berlinClockValue;
    }


    public String calculate_single_minutes_row (int digitalTimeMinutes) {

        int singleMinutesValue = digitalTimeMinutes % 5;
        StringBuilder singleMinutesRow = new StringBuilder();

        for (int i = 1; i <= singleMinutesValue; i++) {
            singleMinutesRow.append(yellowLamp);
        }

        while (singleMinutesRow.length() < singleMinutesRowLength) {
            singleMinutesRow.append(lampOff);
        }
        return singleMinutesRow.toString();
    }

    public String calculate_five_minutes_row (int digitalTimeMinutes) {

        int fiveMinutesValue = digitalTimeMinutes / 5;
        StringBuilder fiveMinutesRow = new StringBuilder();

        for (int i = 1; i <= fiveMinutesValue; i++) {
            if (i % 3 == 0) {
                fiveMinutesRow.append(redLamp);
            } else {
                fiveMinutesRow.append(yellowLamp);
            }
        }

        while (fiveMinutesRow.length() < fiveMinutesRowLength) {
            fiveMinutesRow.append(lampOff);
        }
        return fiveMinutesRow.toString();
    }

    private String calculate_single_hours_row (int digitalTimeHours) {

        int singleHoursValue = digitalTimeHours % 5;

        return fill_hours_rows(singleHoursValue, singleHoursRowLength);

    }

    private String calculate_five_hours_row (int digitalTimeHours) {
        int fiveHoursValue = digitalTimeHours / 5;

        return fill_hours_rows(fiveHoursValue, fiveHoursRowLength);
    }

    private String fill_hours_rows (int timeValue, int rowLength) {

        StringBuilder rowValue = new StringBuilder();

        for (int i = 1; i <= timeValue; i++) {
            rowValue.append(redLamp);
        }

        while (rowValue.length() < rowLength) {
            rowValue.append(lampOff);
        }
        return rowValue.toString();
    }

    private String calculate_seconds_lamp_value (int digitalTimeSeconds) {

        if (digitalTimeSeconds % 2 == 0) {
            return "Y";
        } else {
            return "O";
        }

    }
}
