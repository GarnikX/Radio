package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void radioStationSet() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void radioStationSetAboveLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }


    @Test
    public void radioStationSetBelowLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void radioStationIncreaseOnMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void radioStationIncrease() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.increaseRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void radioStationDecreaseOnMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void radioStationDecrease() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }


    @Test
    public void volumeSetAboveLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
    @Test
    public void volumeSetBelowLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
    @Test
    public void volumeSet() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void volumeIncreaseOnMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void volumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
    @Test
    public void volumeDecreaseOnMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
    @Test
    public void volumeDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.decreaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

}