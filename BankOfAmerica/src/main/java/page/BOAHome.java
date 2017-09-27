package page;

import common.commonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Kahina on 9/26/2017.
 */
public class BOAHome extends commonAPI {
    @FindBy(how = How.XPATH,using = "//a[@name='global_personal']")
    public static WebElement pesonalBtn;
    @FindBy(how = How.XPATH,using = "//a[@name='global_smallbusiness']")
    public static WebElement smallBusinessBtn;
    @FindBy(how = How.XPATH,using = "//a[@name='global_wealthmanagement']")
    public static WebElement wealthManagementBtn;

    @FindBy(how = How.XPATH,using = "//a[@name='global_businessesandinstitutions']")
    public static WebElement businessesAndInstitutionsBtn;

    @FindBy(how = How.XPATH,using = "//a[@name='global_aboutbankofamerica']")
    public static WebElement aboutUsBtn;

    public void mainNavigationBtns(){
        pesonalBtn.click();
        smallBusinessBtn.click();
        wealthManagementBtn.click();
        navigateBack();
        businessesAndInstitutionsBtn.click();
        navigateBack();
        aboutUsBtn.click();
    }
}
