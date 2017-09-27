package TestFacebookProfile;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.FacebookHome;
import page.FacebookProfile;

/**
 * Created by Kahina on 9/25/2017.
 */
public class TestSearchFriends extends commonAPI {
    @Test
    public void testSearchFriends() throws InterruptedException {
        FacebookHome facebookHome = PageFactory.initElements(driver,FacebookHome.class);
        facebookHome.login("kahina_djebari@yahoo.fr","kahinadgd");
        FacebookProfile facebookProfile = PageFactory.initElements(driver,FacebookProfile.class);
        facebookProfile.searchFriends("sofiane");
        facebookProfile.searchFriends("souhila");
    }
}
