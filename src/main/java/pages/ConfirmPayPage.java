package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmPayPage extends Base{
    public ConfirmPayPage(WebDriver driver) {
        super(driver);
    }
 private   WebElement confirmpay = driver.findElement(By.xpath("//*[@id=\'cart_navigation\']/button/span"));
    Action act;
    public EndPayPage confirmorder(){
        act=new Action(driver);
        act.clcik2(confirmpay);
        return new EndPayPage(driver);
    }
}
