package com.qulix.spring.instrument.impl;

import com.qulix.spring.instrument.Instrument;

public class Cymbal implements Instrument {
    @Override
    public void play() {
        System.out.println("CYN CYN CYN");
    }
}
