package com.qulix.spring.performer.impl;

import com.qulix.spring.exception.PerformanceException;
import com.qulix.spring.performer.Performer;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUNGLING " + beanBags + " BEANBAGS");
    }
}
