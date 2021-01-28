package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldGetAndSetName() {
        Radio radio = new Radio();
        String expected = "Радио";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"5, 5",
                    "0, 0",
                    "0, 15"
            }
    )
    public void shouldSetCurrentStationNumber(int expectedCurrentStationNumber, int currentStationNumber) {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setCurrentStationNumber(currentStationNumber);
        assertEquals(expectedCurrentStationNumber, radio.getCurrentStationNumber());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"6, 5",
                    "0, 9",
                    "1, 10"
            }
    )
    public void shouldIncreaseCurrentStationNumber(int expectedCurrentStationNumber, int currentStationNumber) {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setCurrentStationNumber(currentStationNumber);
        radio.increaseCurrentStationNumber();
        assertEquals(expectedCurrentStationNumber, radio.getCurrentStationNumber());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"4, 5",
                    "9, 0",
                    "9, 11"
            }
    )
    public void shouldDecreaseCurrentStationNumber(int expectedCurrentStationNumber, int currentStationNumber) {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setCurrentStationNumber(currentStationNumber);
        radio.decreaseCurrentStationNumber();
        assertEquals(expectedCurrentStationNumber, radio.getCurrentStationNumber());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"6, 5",
                    "10, 10",
                    "10, 20"
            }
    )
    public void shouldIncreaseVolume(int expectedCurrentVolume, int currentVolume) {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(currentVolume);
        radio.increaseCurrentVolume();
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"4, 5",
                    "0, 0",
                    "9, 11"
            }
    )
    public void shouldDecreaseCurrentVolume(int expectedCurrentVolume, int currentVolume) {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(currentVolume);
        radio.decreaseCurrentVolume();
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }
}