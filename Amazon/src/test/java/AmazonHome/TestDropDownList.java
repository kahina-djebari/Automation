package AmazonHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.DropDownList;

/**
 * Created by Kahina on 9/15/2017.
 */

public class TestDropDownList extends commonAPI {

    @Test
    public void testDropDownList(){
        DropDownList dropDownList = PageFactory.initElements(driver, DropDownList.class);
        dropDownList.clickOnSearchDropDownBox();
    }
}
