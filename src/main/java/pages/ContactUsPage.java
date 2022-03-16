package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends Base{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    Action act;
    public WebElement contacth1 = driver.findElement(By.xpath("//*[@id=\'center_column\']/h1"));
    private WebElement subject = driver.findElement(By.xpath("//*[@id=\'id_contact\']"));
    private WebElement email = driver.findElement(By.xpath("//*[@id=\'email\']"));
    private WebElement orderref = driver.findElement(By.xpath("//*[@id=\'id_order\']"));
    private WebElement message = driver.findElement(By.xpath("//*[@id=\'message\']"));
    private WebElement btn = driver.findElement(By.xpath("//*[@id=\'submitMessage\']/span"));
    public EndOfContactPage contactus(String theemail,String theorder ,String thetext){
        act = new Action(driver);
        act.selectByIndex(subject,1);
        act.type(email,theemail);
        act.type(orderref,theorder);

        act.type(message,thetext);
        act.clcik2(btn);
        return new EndOfContactPage(driver);

    }
}
