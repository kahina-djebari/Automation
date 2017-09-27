package testBOAHomePage;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.BOAHome;

/**
 * Created by Kahina on 9/26/2017.
 */
public class TestMainNavBtns extends commonAPI {
    @Test
    public void testMainNavBtns(){
        BOAHome home = PageFactory.initElements(driver,BOAHome.class);
        home.mainNavigationBtns();
    }

}
