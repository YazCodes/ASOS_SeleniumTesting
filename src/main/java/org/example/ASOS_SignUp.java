package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ASOS_SignUp {

    public WebDriver driver;

    public ASOS_SignUp(WebDriver driver) {
        this.driver = driver;
    }


    private String homepageURL = "https://my.asos.com/identity/login?signin=24781905117167e68ba9916c73899ab0&checkout=False\"";
    private By signInButton = By.cssSelector("#myAccountDropdown > button");
    String selectAccount =("//*[@id=\"chrome-sticky-header\"]/div[1]/div/ul[2]/li[2]/a");
    private String signInURL = "https://my.asos.com/identity/login?signin=24781905117167e68ba9916c73899ab0&checkout=False";
    private By notRegistered = By.cssSelector("#main > div > div.signin-options > div.title.qa-title.with-link > a");

    private By emailAddressID = By.id("Email");
    private By firstNameID = By.id("FirstName");
    private By lastNameID = By.id("LastName");
    private By passwordID = By.id("password");



    public ASOS_SignUp goToHomePage() {
        driver.navigate().to(homepageURL);
        return this;
    }

    public ASOS_SignUp clickSignInButton() {
        driver.findElement(signInButton).click();

        return this;
    }

    //Code for dropdown menu
    //Write xpath -  //a[contains(text(), 'My Account' )]

    public ASOS_SignUp selectAccount() {
        //move curser on the dropdown menu

        WebElement menu = driver.findElement(By.xpath(selectAccount));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        driver.findElement(By.linkText("My Account")).click();

        return this;

    }

    public ASOS_SignUp goToSignInPage () {
        driver.navigate().to(signInURL);
        return this;
    }

    public ASOS_SignUp notRegisteredButton () {
        driver.findElement(notRegistered).click();
        return this;
    }

    public ASOS_SignUp inputEmail (String email) {
        driver.findElement(emailAddressID).sendKeys(email);
        return this;

    }









}

