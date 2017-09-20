package AmazonHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.HomePage;

/**
 * Created by Kahina on 9/19/2017.
 */
public class TestChangeLanguage extends commonAPI {

    @Test
    public void testChangeLanguage() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.changeLanguage();
    }
}
