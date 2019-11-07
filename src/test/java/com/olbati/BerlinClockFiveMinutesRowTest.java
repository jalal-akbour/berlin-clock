package com.olbati;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockFiveMinutesRowTest {

    // Arrange
    BerlinClockConverter berlinClockConverter = new BerlinClockConverter();
    BerlinClock berlinClockTime;

    @Test
    public void when_digital_time_equal_to_00_00_00_then_berlin_time_five_minutes_row_equal_OOOOOOOOOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("00:00:00");
        // Assert
        assertThat(berlinClockTime.getFiveMinutesRow()).isEqualTo("OOOOOOOOOOO");
    }

    @Test
    public void when_digital_time_equal_to_23_59_59_then_berlin_time_five_minutes_row_equal_YYRYYRYYRYY () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("23:59:59");
        // Assert
        assertThat(berlinClockTime.getFiveMinutesRow()).isEqualTo("YYRYYRYYRYY");
    }

    @Test
    public void when_digital_time_equal_to_12_04_00_then_berlin_time_five_minutes_row_equal_OOOOOOOOOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("12:04:00");
        // Assert
        assertThat(berlinClockTime.getFiveMinutesRow()).isEqualTo("OOOOOOOOOOO");
    }

    @Test
    public void when_digital_time_equal_to_12_23_00_then_berlin_time_five_minutes_row_equal_YYRYOOOOOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("12:23:00");
        // Assert
        assertThat(berlinClockTime.getFiveMinutesRow()).isEqualTo("YYRYOOOOOOO");
    }

    @Test
    public void when_digital_time_equal_to_12_35_00_then_berlin_time_five_minutes_row_equal_YYRYYRYOOOO () {
        // Act
        berlinClockTime = berlinClockConverter.digital_to_berlin_converter("12:35:00");
        // Assert
        assertThat(berlinClockTime.getFiveMinutesRow()).isEqualTo("YYRYYRYOOOO");
    }

}
