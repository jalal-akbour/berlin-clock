package com.olbati;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockSecondsLampTest {

    // Arrange
    BerlinClockConverter berlinClockConverter = new BerlinClockConverter();
    BerlinClock berlinClockTime;

    @Test
    public void when_digital_time_equal_to_00_00_00_then_berlin_time_seconds_lamp_equal_Y () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("00:00:00");
        // Assert
        assertThat(berlinClockTime.getSecondsLamp()).isEqualTo("Y");
    }

    @Test
    public void when_digital_time_equal_to_23_59_59_then_berlin_time_seconds_lamp_equal_O () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("23:59:59");
        // Assert
        assertThat(berlinClockTime.getSecondsLamp()).isEqualTo("O");
    }
}

