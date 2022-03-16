package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage extends Base{
    public PaymentPage(WebDriver driver) {
        super(driver);
    }
    Action act;
   public WebElement totalprice = driver.findElement(By.xpath("//*[@id=\'total_price\']"));
    WebElement wayofpay = driver.findElement(By.className("bankwire"));
    public ConfirmPayPage payment(){
        act=new Action(driver);
        act.clcik2(wayofpay);
        return new ConfirmPayPage(driver);
    }

}
