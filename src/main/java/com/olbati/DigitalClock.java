package com.olbati;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {

    LocalTime digitalTime;


    public DigitalClock (String digitalTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(digitalTime, formatter);

        this.digitalTime = time;
    }

    public DigitalClock (LocalTime digitalTime) {

        this.digitalTime = digitalTime;
    }

    public LocalTime getDigitalTime () {
        return digitalTime;
    }

    public void setDigitalTime (LocalTime digitalTime) {
        this.digitalTime = digitalTime;
    }

    public BerlinClock convert_to_berlin () {
        BerlinClock berlinClock = new  BerlinClock();
         berlinClock.calculate_entire_berlin_clock(this.digitalTime);
         return berlinClock;
    }


}
