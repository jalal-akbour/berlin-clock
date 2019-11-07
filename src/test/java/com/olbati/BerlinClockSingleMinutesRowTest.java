package com.olbati;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockSingleMinutesRowTest {

    // Arrange
    BerlinClockConverter berlinClockConverter = new BerlinClockConverter();
    BerlinClock berlinClockTime;

    @Test
    public void when_digital_time_equal_to_00_00_00_then_berlin_time_single_minutes_row_equal_OOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("00:00:00");
        // Assert
        assertThat(berlinClockTime.getSingleMinutesRow()).isEqualTo("OOOO");
    }

    @Test
    public void when_digital_time_equal_to_23_59_59_then_berlin_time_single_minutes_row_equal_YYYY () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("23:59:59");
        // Assert
        assertThat(berlinClockTime.getSingleMinutesRow()).isEqualTo("YYYY");
    }

    @Test
    public void when_digital_time_equal_to_12_32_00_then_berlin_time_single_minutes_row_equal_YYOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("12:32:00");
        // Assert
        assertThat(berlinClockTime.getSingleMinutesRow()).isEqualTo("YYOO");
    }

    @Test
    public void when_digital_time_equal_to_12_34_00_then_berlin_time_single_minutes_row_equal_YYYY () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("12:34:00");
        // Assert
        assertThat(berlinClockTime.getSingleMinutesRow()).isEqualTo("YYYY");
    }

    @Test
    public void when_digital_time_equal_to_12_35_00_then_berlin_time_single_minutes_row_equal_OOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("12:35:00");
        // Assert
        assertThat(berlinClockTime.getSingleMinutesRow()).isEqualTo("OOOO");
    }
}
