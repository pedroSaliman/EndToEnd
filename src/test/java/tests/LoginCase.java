package tests;

import Listners.Excel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginCase extends  Base{
    HomePage home;
    LoginPage log;
    MyAccountPage myaccount;

    @Test
    public void sign(){
        Log.startcase("sign");
        home=new HomePage(driver);
        home.opensigin();
        Log.endcase("sign");

    }
    @Test(dependsOnMethods = {"sign"},dataProvider = "Excel",dataProviderClass = Excel.class)
    public void login(String username,String pasw){
        Log.startcase("login");

        log=new LoginPage(driver);
        log.login(username,pasw );
        myaccount =new MyAccountPage(driver);
        myaccount.logout();
        Log.endcase("login");


    }
}
