package com.olbati;

public class BerlinClockConverter {

    public BerlinClock digital_to_berlin_converter (String digitalTimeValue) {

        DigitalClock digitalClock = new DigitalClock(digitalTimeValue);
        return digitalClock.convert_to_berlin();
    }
}
