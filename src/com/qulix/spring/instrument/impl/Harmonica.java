package com.qulix.spring.instrument.impl;

import com.qulix.spring.instrument.Instrument;

public class Harmonica implements Instrument {
    @Override
    public void play() {
        System.out.println("WZZZZ WZZZZ WZZZZ");
    }
}
