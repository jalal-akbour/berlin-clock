package com.olbati;

public class BerlinClock {

    private String secondLamp;
    private String fiveHoursRow;
    private String singleHoursRow;
    private String fiveMinutesRow;
    private String singleMinutesRow;

    public BerlinClock () {
    }

    public BerlinClock (String secondLamp, String fiveHoursRow, String singleHoursRow, String fiveMinutesRow, String singleMinutesRow) {
        this.secondLamp = secondLamp;
        this.fiveHoursRow = fiveHoursRow;
        this.singleHoursRow = singleHoursRow;
        this.fiveMinutesRow = fiveMinutesRow;
        this.singleMinutesRow = singleMinutesRow;
    }

    public String getSecondLamp () {
        return secondLamp;
    }

    public void setSecondLamp (String secondLamp) {
        this.secondLamp = secondLamp;
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
}
