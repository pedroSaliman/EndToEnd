package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends Base{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
  public   WebElement p = driver.findElement(By.xpath("//p[contains(text(),'Welcome to your account. Here you can manage all o')]"));
  private  WebElement logout = driver.findElement(By.linkText("Sign out"));

    Action act;

    public void read(){
        act=new Action(driver);
        act.readvalue(p);
    }
    public void logout(){
        act =new Action(driver);
        act.clcik2(logout);
    }

}
