package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.basic.spring_dependency_injection.homework.ShippingCenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.basic.spring_dependency_injection.homework");
    ShippingCenter bean = context.getBean(ShippingCenter.class);

    @Test
    public void shouldReturnSuccessMessage() {

        String message = bean.sendPackage("Wadowicka 27, 30-345 Krakow", 14.45);
        Assertions.assertEquals("Package delivered to: Wadowicka 27, 30-345 Krakow", message);
    }

    @Test
    public void shouldReturnFailMessage() {

        String message = bean.sendPackage("Wadowicka 27, 30-345 Krakow", 45);
        Assertions.assertEquals("Package not delivered to: Wadowicka 27, 30-345 Krakow", message);
    }
}