package ru.netology.domain;

public class Radio {
    private int stationQuantity=10;
    private String name;
    private int maxStationNumber;
    private int minStationNumber=0;
    private int currentStationNumber;
    private int maxVolume=100;
    private int minVolume=0;
    private int currentVolume;
    private boolean on=true;

    public Radio() {
    }

    public Radio(String name, int stationQuantity, int maxStationNumber, int minStationNumber, int currentStationNumber, int maxVolume, int minVolume, int currentVolume, boolean on) {
        this.name = name;
        this.stationQuantity = stationQuantity;
        this.maxStationNumber = maxStationNumber;
        this.minStationNumber = minStationNumber;
        this.currentStationNumber = currentStationNumber;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.on = on;
    }

    public Radio(int stationQuantity, String name) {

        this.stationQuantity = stationQuantity;
        this.name = name;
    }

    public Radio(int stationQuantity, int currentStationNumber) {
        this.stationQuantity = stationQuantity;
        maxStationNumber=stationQuantity-1;
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

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getStationQuantity() {return stationQuantity;}

    public void setStationQuantity(int stationQuantity) {this.stationQuantity = stationQuantity;}

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {this.currentStationNumber = currentStationNumber; }

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