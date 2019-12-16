package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ASOS_SignUp {

    public WebDriver driver;

    public ASOS_SignUp(WebDriver driver) {
        this.driver = driver;
    }


    private String signInURL = "https://my.asos.com/identity/login?signin=24781905117167e68ba9916c73899ab0&checkout=False\"";
    private By signInButton = By.cssSelector("#myAccountDropdown > button");
    String selectAccount =("//*[@id=\"chrome-sticky-header\"]/div[1]/div/ul[2]/li[2]/a");

    private By notRegistered = By.cssSelector("#main > div > div.signin-options > div.title.qa-title.with-link > a");

    private By emailAddressID = By.id("Email");
    private By firstNameID = By.id("FirstName");
    private By lastNameID = By.id("LastName");
    private By passwordID = By.id("password");
    private By dateDay = By.cssSelector("#BirthDay");
    private By dateMonth = By.cssSelector("#BirthMonth");
    private By dateYear = By.cssSelector("#BirthYear");
    private By selectWomenswear = By.cssSelector("#register-form > form > fieldset > div.field.gender > fieldset > div.tickbox-container.subfield.qa-gender-female.selected");
    private By selectMenswear = By.cssSelector("#register-form > form > fieldset > div.field.gender > fieldset > div.tickbox-container.subfield.last-subfield.qa-gender-male");
    private By contactPreferences = By.cssSelector("#register-form > form > fieldset > div.checkbox-container.consent > fieldset > div.col-xs-12.flex-wrapper.container-all-checkbox > div.col-md-4 > div > button.checkbox.qa-all-pref-label-all");
    private By joinASOSButton = By.cssSelector("#register");



    public ASOS_SignUp goToSignInPage() {
        driver.navigate().to(signInURL);
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

    // create an account

    public ASOS_SignUp notRegisteredButton () {
        driver.findElement(notRegistered).click();
        return this;
    }

    public ASOS_SignUp inputEmail (String email) {
        driver.findElement(emailAddressID).sendKeys(email);
        return this;

    }

    public void checkDayOptions () {
        // waiting();

        WebElement day = driver.findElement(dateDay);
        Select option = new Select(day);
        for (int i = 0; i < option.getOptions().size() ; i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());
        }
    }
    public void checkMonthOptions () {
        waiting();
        WebElement month = driver.findElement(dateMonth);
        Select option = new Select(month);
        for (int i = 0; i < option.getOptions().size(); i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());
        }
    }
    public void checkYearOptions () {
        waiting();
        WebElement year = driver.findElement(dateYear);
        Select option = new Select(year);
        for (int i = 0; i < option.getOptions().size(); i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());
        }
    }

    public ASOS_SignUp selectPreferences () {

        return this;
    }

//    public void getTitle () {
//        waiting();
//        List<WebElement> title = driver.findElements(titles);
//        for(org.openqa.selenium.WebElement titles : title) {
//            driver.findElement(By.name(titles.getAttribute("name"))).click();
//            driver.findElement(By.name(titles.getAttribute("name"))).isSelected();


    //Wait's for the page to load until code starts to be executed

    public void waiting(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }













}

