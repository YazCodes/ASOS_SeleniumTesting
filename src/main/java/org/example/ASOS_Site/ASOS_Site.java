package org.example.ASOS_Site;

import org.example.ASOS_SignUp;
import org.openqa.selenium.WebDriver;

public class ASOS_Site {

    //These are member variables

    private WebDriver driver;
    private ASOS_Homepage asos_homepage;
    private ASOS_WomansPage asos_womansPage;
    private ASOS_SignUp asos_signUp;


    //instancating my object using a constructor - declaration, instantiation, and initialization.

    public ASOS_Site (WebDriver driver) {
        this.driver = driver;
        this.asos_homepage = new ASOS_Homepage(driver);
        this.asos_womansPage = new ASOS_WomansPage(driver);
        this.asos_signUp = new ASOS_SignUp(driver);
    }

    public ASOS_Homepage asos_homepage () {
        return asos_homepage;
    }

    public ASOS_WomansPage asos_womansPage () {return  asos_womansPage; }

    public ASOS_SignUp asos_signUp () { return  asos_signUp; }




}
