package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class KodillaStorePomTest {
    KodillaStorePom storePom;
    WebDriver driver;
    Map<String, Integer> searchData;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);

        searchData = new HashMap<>();
        searchData.put("Notebook", 2);
        searchData.put("School", 1);
        searchData.put("Brand", 1);
        searchData.put("Business", 0);
        searchData.put("Gaming", 1);
        searchData.put("Powerful", 0);
    }

    @Test
    public void testSearchResultsSize() {
        Map<String, Integer> actualSearchData = new HashMap<>();
        for (Map.Entry<String, Integer> searchEntry : searchData.entrySet()) {
            storePom.searchProduct(searchEntry.getKey());
            int size = storePom.getResultsSize();
            actualSearchData.put(searchEntry.getKey(), size);
            storePom.clearSearchField();
        }
        assertEquals(searchData, actualSearchData);
    }

    @Test
    public void testCaseSensitiveSearch() {

        List<String> searchEntriesWithDifferentCases = new ArrayList<>();
        searchEntriesWithDifferentCases.add("noteBOOK");
        searchEntriesWithDifferentCases.add("school");
        searchEntriesWithDifferentCases.add("BRAND");
        searchEntriesWithDifferentCases.add("BUSINESS");
        searchEntriesWithDifferentCases.add("gaming");
        searchEntriesWithDifferentCases.add("POWERful");

        Map<String, Integer> actualSearchData = new HashMap<>();
        Map<String, Integer> expectedSearchData = new HashMap<>();

        for (String input : searchEntriesWithDifferentCases) {
            storePom.searchProduct(input);
            int size = storePom.getResultsSize();
            actualSearchData.put(input.toLowerCase(), size);
            storePom.clearSearchField();
        }

        for (Map.Entry<String, Integer> searchEntry : searchData.entrySet()) {
            expectedSearchData.put(searchEntry.getKey().toLowerCase(), searchEntry.getValue());
        }
        assertEquals(expectedSearchData, actualSearchData);
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}