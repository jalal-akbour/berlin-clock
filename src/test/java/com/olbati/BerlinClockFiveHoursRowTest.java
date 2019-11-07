package com.olbati;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockFiveHoursRowTest {

    // Arrange
    BerlinClockConverter berlinClockConverter = new BerlinClockConverter();
    BerlinClock berlinClockTime;

    @Test
    public void when_digital_time_equal_to_00_00_00_then_berlin_time_five_hours_row_equal_OOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("00:00:00");
        // Assert
        assertThat(berlinClockTime.getFiveHoursRow()).isEqualTo("OOOO");
    }


    @Test
    public void when_digital_time_equal_to_23_59_59_then_berlin_time_five_hours_row_equal_RRRR () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("23:59:59");
        // Assert
        assertThat(berlinClockTime.getFiveHoursRow()).isEqualTo("RRRR");
    }


    @Test
    public void when_digital_time_equal_to_02_04_00_then_berlin_time_five_hours_row_equal_OOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("02:04:00");
        // Assert
        assertThat(berlinClockTime.getFiveHoursRow()).isEqualTo("OOOO");
    }

    @Test
    public void when_digital_time_equal_to_08_23_00_then_berlin_time_five_hours_row_equal_ROOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("08:23:00");
        // Assert
        assertThat(berlinClockTime.getFiveHoursRow()).isEqualTo("ROOO");
    }

    @Test
    public void when_digital_time_equal_to_16_35_00_then_berlin_time_five_hours_row_equal_RRRO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("16:35:00");
        // Assert
        assertThat(berlinClockTime.getFiveHoursRow()).isEqualTo("RRRO");
    }
}
