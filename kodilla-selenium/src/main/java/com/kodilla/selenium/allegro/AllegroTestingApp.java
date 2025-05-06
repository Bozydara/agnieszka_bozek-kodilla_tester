package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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

        WebElement categoryDropdownEbay = driver.findElement(By.className("gh-search-categories"));
        Select categorySelectEbay = new Select(categoryDropdownEbay);
        categorySelectEbay.selectByVisibleText("Consumer Electronics");

        WebElement inputFieldEbay = driver.findElement(By.id("gh-ac"));
        inputFieldEbay.sendKeys("Mavic mini");

        WebElement searchButtonEbay = driver.findElement(By.cssSelector("#gh-search-btn"));
        searchButtonEbay.click();

        List<WebElement> searchResults = driver.findElements(By.cssSelector("#srp-river-results > ul > li > .s-item__wrapper"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(searchResults.getFirst()));

        List<WebElement> productTitles = driver.findElements(By.cssSelector("#srp-river-results > ul > li > .s-item__wrapper > .s-item__info > a > .s-item__title > span"));
        for (WebElement productTitle : productTitles) {
            System.out.println(productTitle.getText());
        }
        driver.close();
    }
}