package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldNextStationOverFinalStation() {
        Radio friend = new Radio(140,140);
        friend.nextRadioStation();
        assertEquals(0, friend.getCurrentRadioStation());
    }
    @Test
    void shouldNextStationIfFinalStation() {
        Radio friend = new Radio(10,10);
        friend.nextRadioStation();
        assertEquals(0, friend.getCurrentRadioStation());
    }
    @Test
    void shouldNextRadioStation() {
        Radio friend = new Radio(5,10);
        friend.nextRadioStation();
        assertEquals(6, friend.getCurrentRadioStation());
    }
    @Test
    void shouldNextStationOverMax() {
        Radio friend = new Radio(141,140);
        friend.nextRadioStation();
        assertEquals(0, friend.getCurrentRadioStation());
    }
    @Test
    void shouldPrevStationIfCurrentStationMin() {
        Radio friend = new Radio(0,10);
        friend.prevRadioStation();
        assertEquals(10, friend.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationIfCurrentStationStart() {
        Radio friend = new Radio(0,56);
        friend.prevRadioStation();
        assertEquals(56, friend.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationIfCurrentStationLessStart() {
        Radio friend = new Radio(-1,56);
        friend.prevRadioStation();
        assertEquals(56, friend.getCurrentRadioStation());
    }

    @Test
    void shouldPrevRadioStation() {
        Radio friend = new Radio(3,10);
        friend.prevRadioStation();
        assertEquals(2, friend.getCurrentRadioStation());
    }

    @Test
    void shouldControlNumButtonStation() {
        Radio friend = new Radio(5,10);
        assertEquals(5, friend.getCurrentRadioStation());
    }

    @Test
    void shouldSoundVolumeUp() {
        Radio friend = new Radio();
        friend.setCurrentSoundVolume(9);
        friend.shouldSoundVolumeUp();
        assertEquals(10, friend.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDown() {
        Radio friend = new Radio();
        friend.setCurrentSoundVolume(7);
        friend.shouldSoundVolumeDown();
        assertEquals(6, friend.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControl() {
        Radio friend = new Radio();
        friend.setCurrentSoundVolume(100);
        friend.shouldSoundVolumeUp();
        assertEquals(100, friend.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControlOverMax() {
        Radio friend = new Radio();
        friend.setCurrentSoundVolume(101);
        friend.shouldSoundVolumeUp();
        assertEquals(100, friend.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControl() {
        Radio friend = new Radio();
        friend.setCurrentSoundVolume(0);
        friend.shouldSoundVolumeDown();
        assertEquals(0, friend.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControlLessMin() {
        Radio friend = new Radio();
        friend.setCurrentSoundVolume(-1);
        friend.shouldSoundVolumeDown();
        assertEquals(0, friend.getCurrentSoundVolume());
    }
}