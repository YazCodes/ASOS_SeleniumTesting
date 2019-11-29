package org.example.ASOS_Site;

import org.openqa.selenium.WebDriver;

public class ASOS_Site {

    //These are member variables

    private WebDriver driver;
    private ASOS_Homepage asos_homepage;
    private ASOS_WomansPage asos_womansPage;


    //instancating my object using a constructor - declaration, instantiation, and initialization.

    public ASOS_Site (WebDriver driver) {
        this.driver = driver;
        this.asos_homepage = new ASOS_Homepage(driver);
        this.asos_womansPage = new ASOS_WomansPage(driver);
    }

    public ASOS_Homepage asos_homepage () {
        return asos_homepage;
    }

    public ASOS_WomansPage asos_womansPage () {return  asos_womansPage; }




}
