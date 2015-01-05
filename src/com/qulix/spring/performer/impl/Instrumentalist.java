package com.qulix.spring.performer.impl;

import com.qulix.spring.exception.PerformanceException;
import com.qulix.spring.instrument.Instrument;
import com.qulix.spring.performer.Performer;

public class Instrumentalist implements Performer {
    private int age;
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String screamSong() {
        return song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}
