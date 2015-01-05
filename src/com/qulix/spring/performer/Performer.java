package com.qulix.spring.performer;

import com.qulix.spring.exception.PerformanceException;

public interface Performer {
    void perform() throws PerformanceException;
}
