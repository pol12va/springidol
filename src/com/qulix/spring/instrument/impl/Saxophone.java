package com.qulix.spring.instrument.impl;

import com.qulix.spring.instrument.Instrument;

public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
