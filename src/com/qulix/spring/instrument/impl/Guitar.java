package com.qulix.spring.instrument.impl;

import com.qulix.spring.instrument.Instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("DZIN DZIN DZIN");
    }
}
