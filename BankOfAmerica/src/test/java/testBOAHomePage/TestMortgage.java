package testBOAHomePage;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.UserStoryMortgage;

/**
 * Created by Kahina on 9/27/2017.
 */
public class TestMortgage extends commonAPI {
    @Test
    public void testMortgage() throws InterruptedException {
        UserStoryMortgage userStoryMortgage= PageFactory.initElements(driver,UserStoryMortgage.class);
        userStoryMortgage.mortgage();
    }
}
