package com.olbati;

import java.time.LocalTime;

public class BerlinClock {

    private final static String yellowLamp = "Y";
    private final static String redLamp = "R";
    private final static String lampOff = "O";

    private final static int fiveHoursRowLength = 4;
    private final static int singleHoursRowLength = 4;
    private final static int fiveMinutesRowLength = 11;
    private final static int singleMinutesRowLength = 4;

    private String secondsLamp;
    private String fiveHoursRow;
    private String singleHoursRow;
    private String fiveMinutesRow;
    private String singleMinutesRow;

    public BerlinClock () {
    }

    public BerlinClock (String secondsLamp, String fiveHoursRow, String singleHoursRow, String fiveMinutesRow, String singleMinutesRow) {
        this.secondsLamp = secondsLamp;
        this.fiveHoursRow = fiveHoursRow;
        this.singleHoursRow = singleHoursRow;
        this.fiveMinutesRow = fiveMinutesRow;
        this.singleMinutesRow = singleMinutesRow;
    }

    public String getSecondsLamp () {
        return secondsLamp;
    }

    public void setSecondsLamp (String secondsLamp) {
        this.secondsLamp = secondsLamp;
    }

    public String getFiveHoursRow () {
        return fiveHoursRow;
    }

    public void setFiveHoursRow (String fiveHoursRow) {
        this.fiveHoursRow = fiveHoursRow;
    }

    public String getSingleHoursRow () {
        return singleHoursRow;
    }

    public void setSingleHoursRow (String singleHoursRow) {
        this.singleHoursRow = singleHoursRow;
    }

    public String getFiveMinutesRow () {
        return fiveMinutesRow;
    }

    public void setFiveMinutesRow (String fiveMinutesRow) {
        this.fiveMinutesRow = fiveMinutesRow;
    }

    public String getSingleMinutesRow () {
        return singleMinutesRow;
    }

    public void setSingleMinutesRow (String singleMinutesRow) {
        this.singleMinutesRow = singleMinutesRow;
    }

    public String getEntireIntegratedValue () {
        return this.secondsLamp +
                this.fiveHoursRow +
                this.singleHoursRow +
                this.fiveMinutesRow +
                this.singleMinutesRow;
    }


    private void calculate_single_minutes_row (int digitalTimeMinutes) {

        int singleMinutesValue = digitalTimeMinutes % 5;
        StringBuilder singleMinutesRow = new StringBuilder();

        for (int i = 1; i <= singleMinutesValue; i++) {
            singleMinutesRow.append(yellowLamp);
        }

        while (singleMinutesRow.length() < singleMinutesRowLength) {
            singleMinutesRow.append(lampOff);
        }

        this.setSingleMinutesRow(singleMinutesRow.toString());
        //return singleMinutesRow.toString();
    }

    private void calculate_five_minutes_row (int digitalTimeMinutes) {

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
        this.setFiveMinutesRow(fiveMinutesRow.toString());
        // return fiveMinutesRow.toString();
    }

    private void calculate_single_hours_row (int digitalTimeHours) {

        int singleHoursValue = digitalTimeHours % 5;

        String singleHoursRow = fill_hours_rows(singleHoursValue, singleHoursRowLength);
        this.setSingleHoursRow(singleHoursRow);
    }

    private void calculate_five_hours_row (int digitalTimeHours) {
        int fiveHoursValue = digitalTimeHours / 5;

        String fiveHoursRow = fill_hours_rows(fiveHoursValue, fiveHoursRowLength);
        this.setFiveHoursRow(fiveHoursRow);
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

    private void calculate_seconds_lamp_value (int digitalTimeSeconds) {
        String seconds_lamp_value = "O";

        if (digitalTimeSeconds % 2 == 0) {
            seconds_lamp_value = "Y";
        }

        this.setSecondsLamp(seconds_lamp_value);
    }

    public void calculate_entire_berlin_clock (LocalTime digitalTime) {

        calculate_single_minutes_row(digitalTime.getMinute());

        calculate_five_minutes_row(digitalTime.getMinute());

        calculate_single_hours_row(digitalTime.getHour());

        calculate_five_hours_row(digitalTime.getHour());

        calculate_seconds_lamp_value(digitalTime.getSecond());

    }

}
