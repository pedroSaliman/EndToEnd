package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchCase extends Base{
    HomePage home;
    SearchPage search;
    @Test
    public void search(){
        Log.startcase("search");
        home =new HomePage(driver);
        search = home.search(prop.getProperty("nameofproduct"));
        search.displayimg();
        Log.endcase("search");
    }
}
