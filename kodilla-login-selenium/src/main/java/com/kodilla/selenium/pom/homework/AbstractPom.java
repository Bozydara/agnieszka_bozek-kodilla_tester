package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;

public class AbstractPom {
    protected WebDriver driver;

    public AbstractPom(WebDriver driver) {
        this.driver = driver;
    }
}