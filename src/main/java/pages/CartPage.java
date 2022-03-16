package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends Base{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    Action act;
   public WebElement carttittle = driver.findElement(By.className("navigation_page"));
    WebElement totprice = driver.findElement(By.id("total_price"));
    WebElement continuebtn = driver.findElement(By.xpath("//*[@id=\'center_column\']/p[2]/a[1]/span"));
public LoginPage continueshipping(){
    act =new Action(driver);

    act.click(driver,continuebtn);
    return new LoginPage(driver);
}
}
