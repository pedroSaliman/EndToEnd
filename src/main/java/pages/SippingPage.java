package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SippingPage extends Base{
    public SippingPage(WebDriver driver) {
        super(driver);
    }
    Action act;
    WebElement radio = driver.findElement(By.xpath("//input[@id='cgv']"));
    WebElement conttinuebtn = driver.findElement(By.xpath("//*[@id=\'form\']/p/button/span"));

public PaymentPage continuepayment(){
act =new Action(driver);
act.clcik2(radio);
act.clcik2(conttinuebtn);

    return  new PaymentPage(driver);
}
}
