package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EndPayPage extends Base{
    public EndPayPage(WebDriver driver) {
        super(driver);
    }
public     WebElement endpay = driver.findElement(By.xpath("//*[@id=\'center_column\']/div/p/strong"));

}
