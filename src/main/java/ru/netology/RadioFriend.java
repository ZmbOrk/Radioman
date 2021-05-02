package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

class Radio {
    private int startStation = 0;
    private int finalStation = 10;
    private int actualRadioStation;
    private int actualSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;


    public Radio(int actualRadioStation, int finalStation) {
        this.actualRadioStation = actualRadioStation;
        this.finalStation = finalStation;
    }
    public int nextRadioStation() {
        actualRadioStation = actualRadioStation >= finalStation ? startStation : ++actualRadioStation;
        return actualRadioStation;
    }
    public int prevRadioStation() {
        actualRadioStation = actualRadioStation <= startStation ? finalStation : --actualRadioStation;
        return actualRadioStation;
    }
    public void setActualSoundVolume(int actualSoundVolume) {
        if (actualSoundVolume > maxSoundVolume) {
            this.actualSoundVolume = maxSoundVolume;
            return;
        }
        if (actualSoundVolume < minSoundVolume) {
            this.actualSoundVolume = minSoundVolume;
            return;
        }
        this.actualSoundVolume = actualSoundVolume;
    }
    public void shouldSoundVolumeUp() {
        if (actualSoundVolume == maxSoundVolume)
            return;
        actualSoundVolume++;
    }
    public void shouldSoundVolumeDown() {
        if (actualSoundVolume == minSoundVolume)
            return;
        actualSoundVolume--;
    }
}



