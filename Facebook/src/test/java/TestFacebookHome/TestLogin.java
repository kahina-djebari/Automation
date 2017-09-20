package TestFacebookHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.FacebookHome;


/**
 * Created by Kahina on 9/9/2017.
 */
public class TestLogin extends commonAPI {
    @Test
    public void testLogin(){
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        FacebookHome facebookHome = PageFactory.initElements(driver,FacebookHome.class);
        facebookHome.login("hdvbhdf@gmail.com","gdchsdgvchs");
    }
}
