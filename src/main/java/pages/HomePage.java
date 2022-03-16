package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends  Base{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    Action act;
    private WebElement signinbtn = driver.findElement(By.linkText("Sign in"));
    private WebElement searchinput = driver.findElement(By.id("search_query_top"));
    private WebElement serachbtn = driver.findElement(By.name("submit_search"));
    private WebElement contactbtn = driver.findElement(By.xpath("//*[@id=\'contact-link\']/a"));
    public SearchPage search(String nameofproduct){
        act =new Action(driver);
        act.type(searchinput,nameofproduct);
        act.clcik2(serachbtn);
        return new SearchPage(driver);
    }
    public LoginPage  opensigin(){
    act  = new Action(driver);
    act.click(driver,signinbtn);
        return new LoginPage(driver);
    }
    public  ContactUsPage contact(){
        act =new Action(driver);
        act.clcik2(contactbtn);
        return new ContactUsPage(driver);
    }
}
