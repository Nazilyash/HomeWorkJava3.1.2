package ru.netology.domain;

public class Radio {
    private String name;
    private int maxStationNumber;
    private int minStationNumber;
    private int currentStationNumber;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > maxStationNumber) {
            this.currentStationNumber = minStationNumber;
            return;
        }
        this.currentStationNumber = currentStationNumber;
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

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
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

    public void setOn(boolean on) {
        this.on = on;
    }
}
