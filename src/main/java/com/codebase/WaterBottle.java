package com.codebase;

public class WaterBottle {
    private int volume = 100;

    public WaterBottle() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink() {
        if (this.getVolume() >= 10) {
            this.setVolume(this.getVolume()-10);
        }
    }

    public void empty() {
        this.setVolume(0);
    }

    public void fill() {
        this.setVolume(100);
    }
}
