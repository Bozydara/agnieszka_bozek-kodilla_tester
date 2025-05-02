package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\Chrome\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        //It can't be executed, blocked by allegro
        driver.get("https://allegro.pl");

        WebElement categoryDropdown = driver.findElement(By.xpath("//*[@data-role =\"search-scope-select\"]"));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByVisibleText("Elektronika");

        WebElement inputField = driver.findElement(By.xpath("//*[@data-role =\"search-input\"]"));
        inputField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//*[@data-role =\"search-button\"]"));
        searchButton.click();

        // Alternative search on ebay that can be executed
        driver.get("https://www.ebay.com/");

        WebElement categoryDropdownEbay = driver.findElement(By.xpath("//*[@class=\"gh-search-categories\"]"));
        Select categorySelectEbay = new Select(categoryDropdownEbay);
        categorySelectEbay.selectByVisibleText("Consumer Electronics");

        WebElement inputFieldEbay = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        inputFieldEbay.sendKeys("Mavic mini");

        WebElement searchButtonEbay = driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]"));
        searchButtonEbay.click();
    }
}