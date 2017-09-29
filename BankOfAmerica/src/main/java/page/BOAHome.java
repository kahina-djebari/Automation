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
    @FindBy(how = How.XPATH,using = "//div[@class='main-nav-module']/div[1]/ul/li[3]/a")
    public static WebElement wealthManagementBtn;
    @FindBy(how = How.XPATH,using = "//div[@class='main-nav-module']/div[1]/ul/li[4]/a")
    public static WebElement businessesAndInstitutionsBtn;
    @FindBy(how = How.XPATH,using = "//div[@class='main-nav-module']/div[1]/ul/li[5]/a")
    public static WebElement aboutUsBtn;

    public void mainNavigationBtns(){
        pesonalBtn.click();
        checkTitle("Bank of America — Banking, Credit Cards, Mortgages and Auto Loans");
        smallBusinessBtn.click();
        checkTitle("Small Business Banking Accounts and Services from Bank of America");
        wealthManagementBtn.click();
        checkTitle("Wealth Management");
        navigateBack();
        businessesAndInstitutionsBtn.click();
        checkTitle("Bank of America Merrill Lynch - Business Solutions");
        navigateBack();
        aboutUsBtn.click();
        checkTitle("About Bank of America - Service, Commitment & Philanthropy");
    }

    @FindBy(how = How.XPATH,using = "//a[@id='locatorLink']")
    public static WebElement locationsBtn;
    @FindBy(how = How.XPATH,using = "//input[@id='locationField']['locationField']")
    public static WebElement locationInputBox;
    @FindBy(how = How.XPATH,using = "//div[@id='locatorLayer']['Go']")
    public static WebElement goBtn;

    public void locations () throws InterruptedException {
        locationsBtn.click();
        locationsBtn.sendKeys("20854");
        goBtn.click();
        sleepFor(3);
        //checkTitle("Bank of America Financial Center Search Results");
    }
}
