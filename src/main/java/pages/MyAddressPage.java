package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddressPage extends Base{
    public MyAddressPage(WebDriver driver) {
        super(driver);
    }
    Action act;
  private   WebElement textarea = driver.findElement(By.xpath("//*[@id=\'ordermsg\']/textarea"));
  private  WebElement continuebtn = driver.findElement(By.xpath("//*[@id=\'center_column\']/form/p/button/span"));
    public SippingPage continueprocess(String text){

      act=new Action(driver);
      act.type(textarea,text);
      act.clcik2(continuebtn);
      return new SippingPage(driver);
    }

}
