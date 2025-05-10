package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends AbstractPom {
    @FindBy(css = "input[name='search']")
    static WebElement searchField;

    @FindBy(css = ".elements-wrapper > .element")
    static List<WebElement> searchResults;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void searchProduct(String product) {
        searchField.sendKeys(product);
    }

    public int getResultsSize() {
        return searchResults.size();
    }

    public void clearSearchField(){
       searchField.clear();
    }
}