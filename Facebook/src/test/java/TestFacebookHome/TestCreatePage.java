package TestFacebookHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.FacebookHome;

/**
 * Created by Kahina on 9/26/2017.
 */
public class TestCreatePage extends commonAPI {

    @Test
    public void testCreatePage(){
        FacebookHome facebookHome = PageFactory.initElements(driver,FacebookHome.class);
        facebookHome.createPage();
    }
}
