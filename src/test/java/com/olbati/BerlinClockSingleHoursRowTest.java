package com.olbati;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockSingleHoursRowTest {

    // Arrange
    BerlinClockConverter berlinClockConverter = new BerlinClockConverter();
    BerlinClock berlinClockTime;

    @Test
    public void when_digital_time_equal_to_00_00_00_then_berlin_time_single_hours_row_equal_OOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("00:00:00");
        // Assert
        assertThat(berlinClockTime.getSingleHoursRow()).isEqualTo("OOOO");
    }

    @Test
    public void when_digital_time_equal_to_23_59_59_then_berlin_time_single_hours_row_equal_RRRO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("23:59:59");
        // Assert
        assertThat(berlinClockTime.getSingleHoursRow()).isEqualTo("RRRO");
    }

    @Test
    public void when_digital_time_equal_to_02_04_00_then_berlin_time_single_hours_row_equal_RROO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("02:04:00");
        // Assert
        assertThat(berlinClockTime.getSingleHoursRow()).isEqualTo("RROO");
    }

    @Test
    public void when_digital_time_equal_to_08_23_00_then_berlin_time_single_hours_row_equal_RRRO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("08:23:00");
        // Assert
        assertThat(berlinClockTime.getSingleHoursRow()).isEqualTo("RRRO");
    }

    @Test
    public void when_digital_time_equal_to_14_35_00_then_berlin_time_single_hours_row_equal_RRRR () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_convertor("14:35:00");
        // Assert
        assertThat(berlinClockTime.getSingleHoursRow()).isEqualTo("RRRR");
    }




}
