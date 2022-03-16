package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.PageOfProduct;
import pages.SearchPage;

public class PageProductCase extends Base {
    HomePage home;
    SearchPage search;
    PageOfProduct product;
    CartPage cart;

    @Test
    public void search(){
        Log.startcase("search");
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




}
