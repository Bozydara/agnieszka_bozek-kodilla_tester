package com.kodilla.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Objects;

@Component
@Scope("prototype")
public class Clock {
    private LocalTime localTime;

    public Clock() {
        System.out.println("The time now is: " + LocalTime.now());
        this.localTime = LocalTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return Objects.equals(localTime, clock.localTime);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(localTime);
    }
}