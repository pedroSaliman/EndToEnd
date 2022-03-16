package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EndOfContactPage extends Base{
    public EndOfContactPage(WebDriver driver) {
        super(driver);
    }
    public WebElement messageofcontact = driver.findElement(By.xpath("//*[@id=\'center_column\']/p"));

}
