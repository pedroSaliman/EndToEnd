package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Signin extends Base{
    HomePage home;
    LoginPage log;
    @Test
    public void sign(){
        home=new HomePage(driver);
        home.opensigin();
    }
    @Test(dependsOnMethods = {"sign"})
    public void create(){
        log = new LoginPage(driver);
        log.create("walled@gmail.com");
    }
}
