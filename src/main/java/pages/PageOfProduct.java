package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageOfProduct extends Base{
    public PageOfProduct(WebDriver driver) {
        super(driver);
    }
Action act;
public WebElement price = driver.findElement(By.id("our_price_display"));
  public   WebElement quantity = driver.findElement(By.id("quantity_wanted"));
    WebElement size = driver.findElement(By.id("group_1"));
    WebElement color = driver.findElement(By.id("color_14"));
    WebElement adcartbtn = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
    WebElement continuebtn = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]"));

public  WebElement text= driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]/i[1]"));

    public void detailproduct(String thquantity){

        act =new Action(driver);
        act.type(quantity,thquantity);
        act.selectByIndex(size,2);
        act.click(driver,color);
    }
    public CartPage addtocart(){
        act =new Action(driver);


        act.click(driver,adcartbtn);
        act.fluentWait(driver,continuebtn,5);
        act.clcik2(continuebtn);

return new CartPage(driver);
    }
}
