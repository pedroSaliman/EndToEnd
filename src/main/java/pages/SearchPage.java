package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends Base{
    public SearchPage(WebDriver driver) {
        super(driver);

    }
    Action act;
     WebElement img = driver.findElement(By.xpath("//*[@id='center_column']//img"));
     WebElement link = driver.findElement(By.className("product-name"));
    WebElement list = driver.findElement(By.className("icon-th-list"));
    WebElement more = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]"));

    public void displayimg(){
        act =new Action(driver);
        act.isDisplayed(driver,img);


    }
    public PageOfProduct clicktoproduct(){
        act = new Action(driver);
//        act.clcik2(list);
//
//        act.clcik2(more);
        act.click(driver,img);
        return new PageOfProduct(driver);
    }
}
