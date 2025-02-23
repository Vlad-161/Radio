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
    public void remoteCurrentStationTestUnderMinStation(){
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
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(40);
        radio.nextCurrentVolume();
        Assertions.assertEquals(41,radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(100);
        radio.nextCurrentVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(40);
        radio.prevCurrentVolume();
        Assertions.assertEquals(39,radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(100);
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
        radio.setMaxVolume(100);
        Assertions.assertEquals(100,radio.getMaxVolume());
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
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(70);
        radio.setCurrentVolume(110);
        Assertions.assertEquals(70, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume(){
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(70);
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(70, radio.getCurrentVolume());
    }

}
