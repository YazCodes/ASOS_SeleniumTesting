package org.example.ASOS_Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ASOS_Homepage {

    public WebDriver driver;

    public ASOS_Homepage(WebDriver driver) {
        this.driver = driver;
    }


    //Element id's

    private String homepageURL = "https://www.asos.com/";
    private By searchBar = By.id("chrome-search");
    private By clickSearchBar = By.cssSelector("#chrome-sticky-header > div._3wSz5e5 > div > div > form > div > button");

    private By clickWomensButton = By.cssSelector("#chrome-app-container > section > div > div > article.genericSplash__copy > div.genericSplash__ctas > div:nth-child(1) > a");
    private By clickshopButton = By.cssSelector("#chrome-app-container > section:nth-child(3) > article:nth-child(1) > div.moment__textSection > div.moment__buttons > a");
    private By clickOnCoat = By.cssSelector("#product-8771760 > a > div._9n6j7z7 > img");
    private By getSize = By.id("sizeSelect");

    public ASOS_Homepage goToHomePage() {
        driver.navigate().to(homepageURL);
        return this;
    }

    public ASOS_Homepage searchInBar(String clothingType) {
        driver.findElement(searchBar).sendKeys(clothingType);
        return this;
    }

    public ASOS_Homepage clickSearchButton() {
        driver.findElement(clickSearchBar).click();
        return this;
    }

    public ASOS_Homepage clickWomensButton() {
        driver.findElement(clickWomensButton).click();
        return this;
    }

    public ASOS_Homepage clickShopButton() {
        driver.findElement(clickshopButton).click();
        return this;
    }

    public ASOS_Homepage clickCoatButton() {
        driver.findElement(clickOnCoat).click();
        return this;
    }

    public void SelectSize() {
        WebElement continent = driver.findElement(getSize);
        Select option = new Select(continent);

        for (int i = 0; i < 3; i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());
        }
    }

}

