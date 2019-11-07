package com.olbati;

public class BerlinClock {

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


      // return "";
    }
}
