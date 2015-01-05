package com.qulix.spring.performer.impl;

import com.qulix.spring.performer.Contestant;

public class GraciousContestant implements Contestant {
    @Override
    public void recieveAward() {
        System.out.println("Crying");
    }
}
