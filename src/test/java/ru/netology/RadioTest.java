package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @ParameterizedTest //Нажатие кнопки вперед для переключения каналов
    @CsvSource({"0,9", "1,0", "7,6"})
    public void nextRadioChannel(int expected, int inUse) {
        Radio radio = new Radio();
        radio.setChannel(inUse);
        radio.next(radio.getChannel());
        assertEquals(expected, radio.getChannel());

    }

    @ParameterizedTest //Нажатие кнопки назад для переключения каналов
    @CsvSource({"9,0", "5,6", "8,9"})
    public void prevRadioChannel(int expected, int inUse) {
        Radio radio = new Radio();
        radio.setChannel(inUse);
        radio.prev(radio.getChannel());
        assertEquals(expected, radio.getChannel());

    }

    @ParameterizedTest //Нажатие кнопки для управления громкостью +
    @CsvSource({"0,10", "9,-5", "1,1"})
    public void setChannel(int expected, int inUse) {
        Radio radio = new Radio();
        radio.setChannel(inUse);
        assertEquals(expected, radio.getChannel());

    }

    @ParameterizedTest //Нажатие кнопки для управления громкостью +
    @CsvSource({"10,10", "6,5", "1,0"})
    public void addVolume(int expected, int inUse) {
        Radio radio = new Radio();
        radio.setVolume(inUse);
        radio.volumeUp(radio.getVolume());
        assertEquals(expected, radio.getVolume());

    }

    @ParameterizedTest //Нажатие кнопки для управления громкостью -
    @CsvSource({"9,10", "4,5", "0,0"})
    public void subtractVolume(int expected, int inUse) {
        Radio radio = new Radio();
        radio.setVolume(inUse);
        radio.volumeDown(radio.getVolume());
        assertEquals(expected, radio.getVolume());

    }

}