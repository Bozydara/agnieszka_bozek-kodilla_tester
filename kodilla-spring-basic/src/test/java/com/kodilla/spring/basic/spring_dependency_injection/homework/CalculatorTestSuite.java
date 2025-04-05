package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.basic.spring_dependency_injection.homework.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);
    double a = 5;
    double b = 10;

    @Test
    public void shouldReturnAddResult() {
        Assertions.assertEquals(15, bean.add(a, b));
    }

    @Test
    public void shouldReturnSubtractResult() {
        Assertions.assertEquals(-5, bean.subtract(a, b));
    }

    @Test
    public void shouldReturnMultiplyResult() {
        Assertions.assertEquals(50, bean.multiply(a, b));
    }

    @Test
    public void shouldReturnDivideResult() {
        Assertions.assertEquals(0.5, bean.divide(a, b));
    }
}