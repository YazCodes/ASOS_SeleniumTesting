package org.example.ASOS_Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ASOS_WomansPage {

    private String womenPageURL = "https://www.asos.com/women/?ctaref=HP|gen|top|women";
    private String shopWomensURL = "https://www.asos.com/women/ctas/fashion-online-14/cat/?cid=13511&ctaref=shop|blackfridayweekend|bestdeals|ww_hp_4";

    private By clickshopButton = By.cssSelector("#chrome-app-container > section:nth-child(3) > article:nth-child(1) > div.moment__textSection > div.moment__buttons > a");
    private By clickOnCoat = By.cssSelector("#product-8771760 > a > div._9n6j7z7 > img");


    public WebDriver driver;

    public ASOS_WomansPage (WebDriver driver) {
        this.driver = driver;
    }

    public ASOS_WomansPage goToWomensPage () {
        driver.navigate().to(womenPageURL);
        return this;
    }

    public ASOS_WomansPage goToShopWomensPage () {
        driver.navigate().to(shopWomensURL);
        return this;
    }

    public ASOS_WomansPage clickShopButton () {
        driver.findElement(clickshopButton).click();
        return this;
    }

    public ASOS_WomansPage clickCoatButton () {
        driver.findElement(clickOnCoat).click();
        return this;
    }



}


