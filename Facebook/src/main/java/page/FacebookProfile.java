package page;

import common.commonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by Kahina on 9/13/2017.
 */
public class FacebookProfile extends commonAPI {

    @FindBy(how = How.XPATH,using = ".//*[@id='u_0_a']/div[1]/div[1]/div/a/span")
    public static WebElement profileBtn;
    @FindBy(how = How.CLASS_NAME,using = "_6-6")
    public static WebElement friendsBtn;
    @FindBy(how = How.XPATH,using = ".//*[@id='u_jsonp_2_1k']/span/input")
    public static WebElement searchForFriends;

    public void searchFriends(String friendName){
        profileBtn.click();
        friendsBtn.click();
        searchForFriends.sendKeys(friendName, Keys.ENTER);
    }

    @FindBy(how = How.ID,using = "userNavigationLabel")
    public static WebElement navigationBtn;

    public void logout(){
        Select select = new Select(navigationBtn);
        select.selectByVisibleText("Log Out");
    }

    @FindBy(how = How.XPATH,using = ".//*[@id='js_ht']")
    public static WebElement search;

    public void search(String name){
        search.sendKeys(name,Keys.ENTER);
    }

}
