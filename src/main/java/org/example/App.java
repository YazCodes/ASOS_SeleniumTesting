package org.example;

import org.example.ASOS_Site.ASOS_Site;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args ) {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\yasmi\\Downloads\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver chromeDriver = new ChromeDriver();

        ASOS_Site asos_site = new ASOS_Site(chromeDriver);

        //selecting clothes

       // asos_site.asos_homepage().goToHomePage().searchInBar(" hat ").clickSearchButton();
       // asos_site.asos_homepage().goToHomePage().clickWomensButton().clickShopButton().clickCoatButton().SelectSize();
       //asos_site.asos_womansPage().goToWomensPage().clickShopButton();

       // asos_site.asos_homepage().goToHomePage();

      // asos_site.asos_signUp().goToHomePage().clickSignInButton().goToSignInPage();

        asos_site.asos_homepage().blazerPage().selectSizeSix().addToBasket().viewBasket().clickCheckoutButton(); 

       // asos_site.asos_homepage().instagramButton();





    }
}
