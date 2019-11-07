package com.olbati;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BerlinClockConverter {

    final static private String yellowLamp = "Y";
    final static private String redLamp = "R";
    final static private String offLamp = "O";

    final static private int fiveHoursRowLength = 4;
    final static private int singleHoursRowLength = 4;
    final static private int fiveMinutesRowLength = 11;
    final static private int singleMinutesRowLength = 4;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public BerlinClock digital_to_berlin_convertor (String digitalTimeValue) {
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
            singleMinutesRow.append(offLamp);
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
            fiveMinutesRow.append(offLamp);
        }
        return fiveMinutesRow.toString();
    }
    private String calculate_single_hours_row (int digitalTimeHours) {

        int singleHoursValue = digitalTimeHours % 5;
        StringBuilder singleHoursRow = new StringBuilder();

        for (int i = 1; i <= singleHoursValue; i++) {
            singleHoursRow.append(redLamp);
        }

        while (singleHoursRow.length() < singleHoursRowLength) {
            singleHoursRow.append(offLamp);
        }
        return singleHoursRow.toString();
    }

    private String calculate_five_hours_row (int digitalTimeHours) {
        int fiveHoursValue = digitalTimeHours / 5;
        StringBuilder fiveHoursRow = new StringBuilder();

        for (int i = 1; i <= fiveHoursValue; i++) {
            fiveHoursRow.append(redLamp);
        }

        while (fiveHoursRow.length() < fiveHoursRowLength) {
            fiveHoursRow.append(offLamp);
        }
        return fiveHoursRow.toString();
    }

    private String calculate_seconds_lamp_value (int digitalTimeSeconds) {

        if(digitalTimeSeconds % 2 == 0){
            return "Y";
        }
        else{
            return "O";
        }

    }
}
