package page;

import com.sun.org.apache.bcel.internal.generic.Select;
import common.commonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by Kahina on 9/15/2017.
 */

public class DropDownList extends commonAPI {

    @FindBy(how = How.CSS, using = "#searchDropdownBox")
    public static WebElement searchDropDownBox;

    public void clickOnSearchDropDownBox() {
        List<WebElement> list = getElementList("CSS", "#searchDropdownBox");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).click();
        }
    }
}
