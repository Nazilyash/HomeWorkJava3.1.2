package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvSource(
            value = {"5, 'Малое'",
                    "100, 'Большое'",
                    "1000, 'Гигантское'"
            }
    )
    public void shouldSetNameAndStationQuantity(int stationQuantity, String name) {
        Radio radio = new Radio(stationQuantity,name);
        assertEquals(stationQuantity, radio.getStationQuantity());
        assertEquals(name, radio.getName());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"5, 5, 10",
                    "0, 0, 100",
                    "0, 15, 3"
            }
    )
    public void shouldSetCurrentStationNumber(int expectedCurrentStationNumber, int currentStationNumber, int stationQuantity) {
        Radio radio = new Radio(stationQuantity, currentStationNumber);
        assertEquals(expectedCurrentStationNumber, radio.getCurrentStationNumber());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"6, 5, 50",
                    "0, 4, 5",
                    "1, 10, 5"
            }
    )
    public void shouldIncreaseCurrentStationNumber(int expectedCurrentStationNumber, int currentStationNumber, int stationQuantity) {
        Radio radio = new Radio(stationQuantity, currentStationNumber);
        radio.increaseCurrentStationNumber();
        assertEquals(expectedCurrentStationNumber, radio.getCurrentStationNumber());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"4, 5, 20",
                    "1, 0, 2",
                    "59, 60, 60"
            }
    )
    public void shouldDecreaseCurrentStationNumber(int expectedCurrentStationNumber, int currentStationNumber, int stationQuantity) {
        Radio radio = new Radio(stationQuantity, currentStationNumber);
        radio.decreaseCurrentStationNumber();
        assertEquals(expectedCurrentStationNumber, radio.getCurrentStationNumber());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"6, 5",
                    "100, 100",
                    "100, 101"
            }
    )
    public void shouldIncreaseVolume(int expectedCurrentVolume, int currentVolume) {
        Radio radio = new Radio(currentVolume);
        radio.increaseCurrentVolume();
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"4, 5",
                    "0, 0",
                    "99, 101"
            }
    )
    public void shouldDecreaseCurrentVolume(int expectedCurrentVolume, int currentVolume) {
        Radio radio = new Radio(currentVolume);
        radio.decreaseCurrentVolume();
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }
}