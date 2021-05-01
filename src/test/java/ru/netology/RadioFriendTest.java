package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldNextStationOverFinalStation() {
        Radio Radioman = new Radio(140,140);
        Radioman.nextRadioStation();
        assertEquals(0, Radioman.getCurrentRadioStation());
    }
    @Test
    void shouldNextStationIfFinalStation() {
        Radio Radioman = new Radio(10,10);
        Radioman.nextRadioStation();
        assertEquals(0, Radioman.getCurrentRadioStation());
    }
    @Test
    void shouldNextRadioStation() {
        Radio Radioman = new Radio(5,10);
        Radioman.nextRadioStation();
        assertEquals(6, Radioman.getCurrentRadioStation());
    }
    @Test
    void shouldNextStationOverMax() {
        Radio Radioman = new Radio(141,140);
        Radioman.nextRadioStation();
        assertEquals(0, Radioman.getCurrentRadioStation());
    }
    @Test
    void shouldPrevStationIfCurrentStationMin() {
        Radio Radioman = new Radio(0,10);
        Radioman.prevRadioStation();
        assertEquals(10, Radioman.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationIfCurrentStationStart() {
        Radio Radioman = new Radio(0,56);
        Radioman.prevRadioStation();
        assertEquals(56, Radioman.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationIfCurrentStationLessStart() {
        Radio Radioman = new Radio(-1,56);
        Radioman.prevRadioStation();
        assertEquals(56, Radioman.getCurrentRadioStation());
    }

    @Test
    void shouldPrevRadioStation() {
        Radio Radioman = new Radio(3,10);
        Radioman.prevRadioStation();
        assertEquals(2, Radioman.getCurrentRadioStation());
    }

    @Test
    void shouldControlNumButtonStation() {
        Radio Radioman = new Radio(5,10);
        assertEquals(5, Radioman.getCurrentRadioStation());
    }

    @Test
    void shouldSoundVolumeUp() {
        Radio Radioman = new Radio();
        Radioman.setCurrentSoundVolume(9);
        Radioman.shouldSoundVolumeUp();
        assertEquals(10, Radioman.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDown() {
        Radio Radioman = new Radio();
        Radioman.setCurrentSoundVolume(7);
        Radioman.shouldSoundVolumeDown();
        assertEquals(6, Radioman.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControl() {
        Radio Radioman = new Radio();
        Radioman.setCurrentSoundVolume(100);
        Radioman.shouldSoundVolumeUp();
        assertEquals(100, Radioman.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControlOverMax() {
        Radio Radioman = new Radio();
        Radioman.setCurrentSoundVolume(101);
        Radioman.shouldSoundVolumeUp();
        assertEquals(100, Radioman.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControl() {
        Radio Radioman = new Radio();
        Radioman.setCurrentSoundVolume(0);
        Radioman.shouldSoundVolumeDown();
        assertEquals(0, Radioman.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControlLessMin() {
        Radio Radioman = new Radio();
        Radioman.setCurrentSoundVolume(-1);
        Radioman.shouldSoundVolumeDown();
        assertEquals(0, Radioman.getCurrentSoundVolume());
    }
}