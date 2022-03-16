package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartCase extends Base{
    HomePage home;
    SearchPage search;
    PageOfProduct product;
    CartPage cart;
    LoginPage log;
    MyAddressPage address;
    SippingPage shipping;
    PaymentPage pay;
    ConfirmPayPage con;
    EndPayPage end;

    @Test
    public void search(){
            Log.startcase("search");
            Log.info("the test case is launched");
        home =new HomePage(driver);
        search = home.search(prop.getProperty("nameofproduct"));
        search.displayimg();
        search = new SearchPage(driver);
        product= search.clicktoproduct();
        Assert.assertEquals(product.price.getText(),"$16.51");
        product.detailproduct("4");
        cart=product.addtocart();
        Assert.assertEquals(cart.carttittle.getText(),"Your shopping cart");
        Log.endcase("search");
    }
    @Test(dependsOnMethods = {"search"})
    public void continueshopping(){
        Log.startcase("continueshopping");
        Log.info("the test case is launched");
        cart =new CartPage(driver);
        cart.continueshipping();
        Log.endcase("continueshopping");

    }


    @Test(dependsOnMethods = {"continueshopping"})
    public void login(){
        Log.startcase("login");
        Log.info("the test case is launched");
        log = new LoginPage(driver);
     log.loginaddres(prop.getProperty("email"), prop.getProperty("pass") );
     Log.endcase("login");

    }
    @Test(dependsOnMethods = {"login"})
    public void Adress(){
        Log.startcase("Adress");
        Log.info("the test case is launched");
        address = new MyAddressPage(driver);
        address.continueprocess("this is awesome ");
        Log.endcase("Adress");

    }
    @Test(dependsOnMethods = {"Adress"})
    public void shipping(){
        Log.startcase("shipping");
        Log.info("the test case is launched");
        shipping =new SippingPage(driver);
        pay=shipping.continuepayment();
        Assert.assertEquals(pay.totalprice.getText(),"$134.08");
        Log.endcase("shipping");

    }
    @Test(dependsOnMethods = {"shipping"})
    public void payment(){
        Log.startcase("payment");
        Log.info("the test case is launched");
        pay = new PaymentPage(driver);
        pay.payment();
        Log.endcase("payment");
    }
    @Test(dependsOnMethods = {"payment"})
    public void confirmorder(){
        Log.startcase("confirmorder");
        Log.info("the test case is launched");
        con = new ConfirmPayPage(driver);
end=con.confirmorder();
Assert.assertEquals(end.endpay.getText(),"Your order on My Store is complete.");
        Log.endcase("confirmorder");

    }
}
