package com.qulix.spring.performer.impl;

import com.qulix.spring.exception.PerformanceException;
import com.qulix.spring.poem.Poem;
import org.springframework.beans.factory.annotation.Autowired;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    @Autowired
    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
