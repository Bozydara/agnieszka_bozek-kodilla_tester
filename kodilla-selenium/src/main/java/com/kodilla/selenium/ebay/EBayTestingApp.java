package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\Firefox\\geckodriver.exe");
        WebDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.get(" https://www.ebay.com/");
        WebElement searchInput = firefoxDriver.findElement(By.cssSelector("#gh-ac"));
        searchInput.sendKeys("Laptop");
        searchInput.submit();
    }
}