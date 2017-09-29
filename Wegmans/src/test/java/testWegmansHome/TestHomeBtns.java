package testWegmansHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.WegmansHome;

/**
 * Created by Kahina on 9/27/2017.
 */
public class TestHomeBtns extends commonAPI {
    @Test
    public void testHomeBtns(){
        WegmansHome home = PageFactory.initElements(driver,WegmansHome.class);
        home.homeBtns();
    }
}
