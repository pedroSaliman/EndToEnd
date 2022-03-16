package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    Action action;
 private  WebElement emailinputtocreatedaccount = driver.findElement(By.id("email_create"));
 private   WebElement createbutton = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]"));

 private   WebElement emaillogin = driver.findElement(By.id("email"));
 private   WebElement passlogin = driver.findElement(By.id("passwd"));
 private   WebElement submitlogin = driver.findElement(By.id("SubmitLogin"));
    public MyAccountPage login(String theemail,String pass){
        action =new Action(driver);
        action.type(emaillogin,theemail);
        action.type(passlogin,pass);
        action.clcik2(submitlogin);
        return new MyAccountPage(driver);
    }

    ///


    public MyAddressPage loginaddres(String theemail,String pass){
        action =new Action(driver);
        action.type(emaillogin,theemail);
        action.type(passlogin,pass);
        action.clcik2(submitlogin);
        return new MyAddressPage(driver);
    }



    public MyCreatePage create(String email){
        action =new Action(driver);
        action.type(emailinputtocreatedaccount,email);
        action.click(driver,createbutton);
        return new MyCreatePage(driver);

    }
}
