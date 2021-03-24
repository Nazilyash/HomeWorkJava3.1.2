package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int stationQuantity = 10;
    private String name;
    private int maxStationNumber;
    private int minStationNumber = 0;
    private int currentStationNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on = true;


    public Radio(int stationQuantity, String name) {

        this.stationQuantity = stationQuantity;
        this.name = name;
    }

    public Radio(int stationQuantity, int currentStationNumber) {
        this.stationQuantity = stationQuantity;
        maxStationNumber = stationQuantity - 1;
        if (currentStationNumber > maxStationNumber) {
            this.currentStationNumber = minStationNumber;
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public Radio(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentStationNumber() {
        if (currentStationNumber < maxStationNumber) {
            this.currentStationNumber = currentStationNumber + 1;
        } else {
            this.currentStationNumber = minStationNumber;
        }
    }

    public void decreaseCurrentStationNumber() {
        if (currentStationNumber > minStationNumber) {
            this.currentStationNumber = currentStationNumber - 1;
        } else {
            this.currentStationNumber = maxStationNumber;
        }
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        }
    }

}