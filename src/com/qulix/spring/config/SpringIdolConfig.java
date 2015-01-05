package com.qulix.spring.config;

import com.qulix.spring.instrument.impl.Guitar;
import com.qulix.spring.performer.Performer;
import com.qulix.spring.performer.impl.Instrumentalist;
import com.qulix.spring.performer.impl.Juggler;
import com.qulix.spring.performer.impl.PoeticJuggler;
import com.qulix.spring.poem.Poem;
import com.qulix.spring.poem.impl.Sonnet29;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setInstrument(new Guitar());
        kenny.setSong("Jingle Bells");

        return kenny;
    }

    @Bean
    public Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }
}
