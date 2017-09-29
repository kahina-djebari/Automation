package testBOAHomePage;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.BOAHome;

/**
 * Created by Kahina on 9/27/2017.
 */
public class TestLocations extends commonAPI {
    @Test
    public void testLocations() throws InterruptedException {
        BOAHome home = PageFactory.initElements(driver,BOAHome.class);
        home.locations();
    }
}
