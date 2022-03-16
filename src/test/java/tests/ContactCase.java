package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.EndOfContactPage;
import pages.HomePage;


public class ContactCase extends Base{

    HomePage home;
    ContactUsPage contact;
    EndOfContactPage endcontact;
    @Test
    public void clicktocontact(){
Log.startcase("clicktocontact");
Log.info("the case launched");
        home = new HomePage(driver);
     contact=   home.contact();
        Assert.assertEquals(contact.contacth1.getText(),"CUSTOMER SERVICE - CONTACT US");
       endcontact= contact.contactus(prop.getProperty("email"), prop.getProperty("orderref"),  prop.getProperty("message") );
Assert.assertEquals(endcontact.messageofcontact.getText(),"Your message has been successfully sent to our team.");
    Log.endcase("clicktocontact");
    }
}
