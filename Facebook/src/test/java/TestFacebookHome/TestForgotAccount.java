package TestFacebookHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.FacebookHome;

/**
 * Created by Kahina on 9/26/2017.
 */
public class TestForgotAccount extends commonAPI {
    @Test
    public void testForgotAccount(){
        FacebookHome facebookHome = PageFactory.initElements(driver,FacebookHome.class);
        facebookHome.forgotAccount();
    }
}
