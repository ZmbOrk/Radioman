package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldNextStationOverFinalStation() {
        Radio Radioman = new Radio(140,140);
        Radioman.nextRadioStation();
        assertEquals(0, Radioman.getActualRadioStation());
    }
    @Test
    void shouldNextStationIfFinalStation() {
        Radio Radioman = new Radio(10,10);
        Radioman.nextRadioStation();
        assertEquals(0, Radioman.getActualRadioStation());
    }
    @Test
    void shouldNextRadioStation() {
        Radio Radioman = new Radio(5,10);
        Radioman.nextRadioStation();
        assertEquals(6, Radioman.getActualRadioStation());
    }
    @Test
    void shouldNextStationOverMax() {
        Radio Radioman = new Radio(141,140);
        Radioman.nextRadioStation();
        assertEquals(0, Radioman.getActualRadioStation());
    }
    @Test
    void shouldPrevStationIfActualStationMin() {
        Radio Radioman = new Radio(0,10);
        Radioman.prevRadioStation();
        assertEquals(10, Radioman.getActualRadioStation());
    }

    @Test
    void shouldPrevStationIfActualStationStart() {
        Radio Radioman = new Radio(0,56);
        Radioman.prevRadioStation();
        assertEquals(56, Radioman.getActualRadioStation());
    }

    @Test
    void shouldPrevStationIfActualStationLessStart() {
        Radio Radioman = new Radio(-1,56);
        Radioman.prevRadioStation();
        assertEquals(56, Radioman.getActualRadioStation());
    }

    @Test
    void shouldPrevRadioStation() {
        Radio Radioman = new Radio(3,10);
        Radioman.prevRadioStation();
        assertEquals(2, Radioman.getActualRadioStation());
    }

    @Test
    void shouldControlNumButtonStation() {
        Radio Radioman = new Radio(5,10);
        assertEquals(5, Radioman.getActualRadioStation());
    }

    @Test
    void shouldSoundVolumeUp() {
        Radio Radioman = new Radio();
        Radioman.setActualSoundVolume(9);
        Radioman.shouldSoundVolumeUp();
        assertEquals(10, Radioman.getActualSoundVolume());
    }

    @Test
    void shouldSoundVolumeDown() {
        Radio Radioman = new Radio();
        Radioman.setActualSoundVolume(7);
        Radioman.shouldSoundVolumeDown();
        assertEquals(6, Radioman.getActualSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControl() {
        Radio Radioman = new Radio();
        Radioman.setActualSoundVolume(100);
        Radioman.shouldSoundVolumeUp();
        assertEquals(100, Radioman.getActualSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControlOverMax() {
        Radio Radioman = new Radio();
        Radioman.setActualSoundVolume(101);
        Radioman.shouldSoundVolumeUp();
        assertEquals(100, Radioman.getActualSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControl() {
        Radio Radioman = new Radio();
        Radioman.setActualSoundVolume(0);
        Radioman.shouldSoundVolumeDown();
        assertEquals(0, Radioman.getActualSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControlLessMin() {
        Radio Radioman = new Radio();
        Radioman.setActualSoundVolume(-1);
        Radioman.shouldSoundVolumeDown();
        assertEquals(0, Radioman.getActualSoundVolume());
    }
}