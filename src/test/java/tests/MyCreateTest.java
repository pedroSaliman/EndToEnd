package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.MyCreatePage;

public class MyCreateTest extends Base{
    HomePage home;
    LoginPage log;
    MyCreatePage create;
    MyAccountPage accountPage;

    @Test
    public void sign(){
        home=new HomePage(driver);
        home.opensigin();
    }
    @Test(dependsOnMethods = {"sign"})
    public void create(){
        log = new LoginPage(driver);
        log.create(prop.getProperty("email"));
    }


@Test(dependsOnMethods = {"create"})
    public void createprocess(){
        create = new MyCreatePage(driver);
    accountPage= create.createaccount(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("pass"), prop.getProperty("addfname"), prop.getProperty("addlname"), prop.getProperty("company"), prop.getProperty("addres1"), prop.getProperty("address2"), prop.getProperty("state"), prop.getProperty("postcode"), prop.getProperty("information"), prop.getProperty("mob"), prop.getProperty("mobphone"), prop.getProperty("finaladdres") );
    Assert.assertEquals(accountPage.p.getText(),"Welcome to your account. Here you can manage all of your personal information and orders.");
accountPage.logout();
}
















}
