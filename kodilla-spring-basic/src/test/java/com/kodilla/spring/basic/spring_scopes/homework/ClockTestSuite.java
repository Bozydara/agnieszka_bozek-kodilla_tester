package com.kodilla.spring.basic.spring_scopes.homework;

import com.kodilla.basic.spring_scopes.homework.Clock;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldUpdateTimeInClock() throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.basic.spring_scopes.homework");
        Clock time1 = context.getBean(Clock.class);
        Thread.sleep(100);
        Clock time2 = context.getBean(Clock.class);
        Thread.sleep(100);
        Clock time3 = context.getBean(Clock.class);
        Thread.sleep(100);
        Clock time4 = context.getBean(Clock.class);

        assertFalse(time1.equals(time2));
        assertFalse(time2.equals(time3));
        assertFalse(time3.equals(time1));
        assertFalse(time4.equals(time1));
    }
}