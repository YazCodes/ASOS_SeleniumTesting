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

   //get a coat
    private By clickWomensButton = By.cssSelector("#chrome-app-container > section > div > div > article.genericSplash__copy > div.genericSplash__ctas > div:nth-child(1) > a");
    private By clickshopButton = By.cssSelector("#chrome-app-container > section:nth-child(3) > article:nth-child(1) > div.moment__textSection > div.moment__buttons > a");
    private By clickOnCoat = By.cssSelector("#product-8771760 > a > div._9n6j7z7 > img");
    private By getSizeID = By.id("sizeSelect");

    //Buy a blazer
    private String blazerURL = "https://www.asos.com/asos-edition/asos-edition-tailored-blazer-with-shawl-collar-in-velvet/prd/13194154?clr=oxblood&colourWayId=16532686&SearchQuery=&cid=13516";
    private By getSize = By.cssSelector("#main-size-select-0");
    private By basketButton = By.cssSelector("#product-add > div > a > span:nth-child(2)");
    private By checkoutButton = By.cssSelector("#minibag-dropdown > div > div > div._3mygsrG > div > div._58IUcq4 > div:nth-child(2) > a > span");

    private By viewBasketButton = By.cssSelector("#miniBagDropdown > a > span._1z5n7CN");

    //click on social media buttons
    private By clickInstagram = By.cssSelector("#chrome-footer > footer > div._1SrJkyH > div.bh9ABLx > div._3oMZ131 > a._119KPCL._1Yb89Mi");

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

    public ASOS_Homepage SelectSize() {
        WebElement continent = driver.findElement(getSizeID);
        Select option = new Select(continent);

        for (int i = 0; i < 3; i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());
        }

        return this;
    }

    public ASOS_Homepage instagramButton () {

        driver.findElement(clickInstagram).click();
        return this;
    }


    //BUY A BLAZER CODE

    public ASOS_Homepage blazerPage () {
        driver.navigate().to(blazerURL);
        return this;
    }

    public ASOS_Homepage selectSizeSix() {
        WebElement continent = driver.findElement(getSize);
        Select option = new Select(continent);

        for (int i = 0; i < 3; i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());
        }

        return this;
    }

    public ASOS_Homepage addToBasket () {
        driver.findElement(basketButton).click();
        return this;
    }

    public ASOS_Homepage viewBasket () {
        driver.findElement(viewBasketButton).click();
        return this;
    }

    public ASOS_Homepage clickCheckoutButton () {
        driver.findElement(checkoutButton).click();
        return this;
    }


}

