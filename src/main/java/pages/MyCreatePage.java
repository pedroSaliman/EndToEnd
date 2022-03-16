package pages;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCreatePage extends Base{
    public MyCreatePage(WebDriver driver) {
        super(driver);
    }
Action act;
private WebElement radio = driver.findElement(By.id("id_gender2"));
 private WebElement firstname = driver.findElement(By.id("customer_firstname"));
 private WebElement lastname = driver.findElement(By.id("customer_lastname"));
 private WebElement password = driver.findElement(By.id("passwd"));
private   WebElement days = driver.findElement(By.id("days"));
 private WebElement month = driver.findElement(By.id("months"));
 private WebElement years = driver.findElement(By.id("years"));
 private WebElement check1 = driver.findElement(By.id("newsletter"));
private   WebElement check2 = driver.findElement(By.id("optin"));
///Your Adress
 private    WebElement adfname = driver.findElement(By.id("firstname"));
 private    WebElement adlname = driver.findElement(By.id("lastname"));
 private    WebElement company = driver.findElement(By.id("company"));
 private    WebElement address1 = driver.findElement(By.id("address1"));
 private    WebElement address2 = driver.findElement(By.id("address2"));
 private    WebElement city = driver.findElement(By.id("city"));
 private    WebElement idstate = driver.findElement(By.id("id_state"));
  private   WebElement zipcode = driver.findElement(By.id("postcode"));
  private   WebElement country = driver.findElement(By.id("id_country"));
  private   WebElement information = driver.findElement(By.id("other"));
 private    WebElement phone = driver.findElement(By.id("phone"));
 private    WebElement mobphone = driver.findElement(By.id("phone_mobile"));
 private    WebElement chooseaddress = driver.findElement(By.id("alias"));
  private   WebElement submit = driver.findElement(By.id("submitAccount"));
    ///////////////////Actions
    public MyAccountPage createaccount(String thefname,String thelname,String thepass,String addressfname,String addresslname,String thecompany,String add1,String add2,String thestate,String postcode,String theinformation,String themob,String themobphone,String finaladdress){
       act =new Action(driver);
        act.click(driver,radio);
        act.type(firstname,thefname);
        act.type(lastname,thelname);
        act.type(password,thepass);
        act.selectByIndex(days,3);
        act.selectByIndex(month,3);
        act.selectByIndex(years,3);
        act.clcik2(check1);
        act.clcik2(check2);
        act.type(adfname,addressfname);
        act.type(adlname,addresslname);
        act.type(company,thecompany);
        act.type(address1,add1);
        act.type(address2,add2);
        act.type(city,thestate);
        act.selectByIndex(idstate,4);
        act.type(zipcode,postcode);
        act.selectByIndex(country,4);
        act.type(information,theinformation);
        act.type(phone,themob);
        act.type(mobphone,themobphone);
        act.type(chooseaddress,finaladdress);
        act.clcik2(submit);

        return new MyAccountPage(driver);



    }




}
