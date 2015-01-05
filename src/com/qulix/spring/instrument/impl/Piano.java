package com.qulix.spring.instrument.impl;

import com.qulix.spring.instrument.Instrument;

public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
