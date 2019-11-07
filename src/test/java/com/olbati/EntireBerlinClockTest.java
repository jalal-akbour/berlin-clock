package com.olbati;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EntireBerlinClockTest {


    // Arrange
    BerlinClockConverter berlinClockConverter = new BerlinClockConverter();
    BerlinClock berlinClockTime;

    @Test
    public void when_digital_time_equal_to_00_00_00_then_entire_berlin_time_equal_YOOOOOOOOOOOOOOOOOOOOOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("00:00:00");
        // Assert
        assertThat(berlinClockTime.getEntireIntegratedValue()).isEqualTo("YOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void when_digital_time_equal_to_23_59_59_then_entire_berlin_time_equal_ORRRRRRROYYRYYRYYRYYYYYY () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("23:59:59");
        // Assert
        assertThat(berlinClockTime.getEntireIntegratedValue()).isEqualTo("ORRRRRRROYYRYYRYYRYYYYYY");
    }

    @Test
    public void when_digital_time_equal_to_16_50_06_then_entire_berlin_time_equal_YRRROROOOYYRYYRYYRYOOOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("16:50:06");
        // Assert
        assertThat(berlinClockTime.getEntireIntegratedValue()).isEqualTo("YRRROROOOYYRYYRYYRYOOOOO");
    }

    @Test
    public void when_digital_time_equal_to_11_37_01_then_entire_berlin_time_equal_ORROOROOOYYRYYRYOOOOYYOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("11:37:01");
        // Assert
        assertThat(berlinClockTime.getEntireIntegratedValue()).isEqualTo("ORROOROOOYYRYYRYOOOOYYOO");
    }
}
