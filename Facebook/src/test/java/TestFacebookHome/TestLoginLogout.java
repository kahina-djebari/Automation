package TestFacebookHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.FacebookHome;
import page.FacebookProfile;


/**
 * Created by Kahina on 9/9/2017.
 */
public class TestLoginLogout extends commonAPI {
    @Test
    public void testLogin(){
        checkTitle("Facebook - Log In or Sign Up");
        System.out.println(driver.getCurrentUrl());
        FacebookHome facebookHome = PageFactory.initElements(driver,FacebookHome.class);
        facebookHome.login("kahina_djebari@yahoo.fr","kahinadgd");
        FacebookProfile facebookProfile = PageFactory.initElements(driver,FacebookProfile.class);
        facebookProfile.logout();
    }
}
