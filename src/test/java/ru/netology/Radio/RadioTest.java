package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextCurrentStationTestNormalStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.nextCurrentStation();
        Assertions.assertEquals(5,radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationTestMaxBorderStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.nextCurrentStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestNormalStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.prevCurrentStation();
        Assertions.assertEquals(3,radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestMinBorderStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestNormalStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(4);
        Assertions.assertEquals(4,radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestOverMaxStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(10);
        Assertions.assertEquals(9,radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestUndereMinStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(-1);
        Assertions.assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void nextCurrentVolumeTestNormalVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.nextCurrentVolume();
        Assertions.assertEquals(5,radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.nextCurrentVolume();
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.prevCurrentVolume();
        Assertions.assertEquals(3,radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxStationTest(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        Assertions.assertEquals(9,radio.getMaxStation());
    }

    @Test
    public void setMinStationTest(){
        Radio radio = new Radio();
        radio.setMinStation(0);
        Assertions.assertEquals(0,radio.getMinStation());
    }

    @Test
    public void setCurrentStationTestOverMaxStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(8);
        radio.setCurrentStation(60);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTestUnderMinStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(8);
        radio.setCurrentStation(-1);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void setMaxVolumeTest(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        Assertions.assertEquals(10,radio.getMaxVolume());
    }

    @Test
    public void setMinVolumeTest(){
        Radio radio = new Radio();
        radio.setMinVolume(0);
        Assertions.assertEquals(0,radio.getMinVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.setCurrentVolume(60);
        Assertions.assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(7, radio.getCurrentVolume());
    }

}
