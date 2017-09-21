package AmazonHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.HomePage;

/**
 * Created by Kahina on 9/20/2017.
 */
public class TestHomeBtns extends commonAPI {

    @Test
    public void testHomeBtns() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.homeBtns();
    }
}
