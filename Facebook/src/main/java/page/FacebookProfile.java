package page;

import common.commonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Kahina on 9/13/2017.
 */
public class FacebookProfile extends commonAPI {

    @FindBy(how = How.XPATH, using = "//a[@class='_2s25 _606w']")
    public static WebElement profileBtn;
    @FindBy(how = How.XPATH, using = "//div[@class='_70k']//ul/li[3]/a/span[1]")
    public static WebElement friendsBtn;
    @FindBy(how = How.XPATH, using = "//div[@class='clearfix _1_ca']//div[2]/div/div/div/span/span/input")
    public static WebElement searchForFriendsBox;

    public void searchFriends(String friendName) throws InterruptedException {
        profileBtn.click();
        friendsBtn.click();
        searchForFriendsBox.sendKeys(friendName, Keys.ENTER);
        sleepFor(2);
        searchForFriendsBox.clear();
    }

    @FindBy(how = How.ID, using = "userNavigationLabel")
    public static WebElement navigationBtn;
    @FindBy(how = How.XPATH, using = "//ul[@class='_54nf']//li[18]/a/span/span")
    public static WebElement logOutBtn;

    public void logout() {
        navigationBtn.click();
        logOutBtn.click();
    }

    @FindBy(how = How.XPATH, using = "//input[@class='_1frb']")
    public static WebElement search;

    public void search(String name) throws InterruptedException {
        search.sendKeys(name, Keys.ENTER);
        sleepFor(2);
        search.clear();
    }

    @FindBy(how = How.XPATH, using = "//ul[@class='_54nf']//li[13]/a/span/span")
    public static WebElement settings;
    @FindBy(how = How.CSS, using = ".img.sp_iM44Ir4PJL9_1_5x.sx_f3fa38")
    public static WebElement privacy;
    @FindBy(how = How.XPATH, using = "//div[@id='contentArea']//div/ul/li[1]/div/div/ul/li[1]/a/span[1]/span")
    public static WebElement editWhoCanSeeMyStuff;
    @FindBy(how = How.CSS, using = "._21or.img.sp_smpHterd1ND_1_5x.sx_3b3ab0")
    public static WebElement privacyOptions;
    @FindBy(how = How.CSS, using = ".mrs.img.sp_smpHterd1ND_1_5x.sx_38cfe6")
    public static WebElement friends;

    public void changeSettings() {
        navigationBtn.click();
        settings.click();
        privacy.click();
        editWhoCanSeeMyStuff.click();
        privacyOptions.click();
        if (!friends.isSelected()) {
            friends.click();
        } else {
            System.out.println("Already selected");
        }
    }

    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='News Feed']")
    public static WebElement newsFeed;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Messenger']")
    public static WebElement messenger;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Watch']")
    public static WebElement watch;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Marketplace']")
    public static WebElement marketplace;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Events']")
    public static WebElement events;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Pages']")
    public static WebElement pages;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Groups']")
    public static WebElement groups;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Friends Lists']")
    public static WebElement friendLists;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Games']")
    public static WebElement games;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='On THis Day']")
    public static WebElement onThisDay;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Fundrisers']")
    public static WebElement fundRisers;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Live Video']")
    public static WebElement liveVideo;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Pokes']")
    public static WebElement pokes;
    @FindBy(how = How.XPATH, using = "//div[@class='linkWrap noCount'][text()='Suggest Edits']")
    public static WebElement suggestEdits;

    public void leftButtons() throws InterruptedException {
        newsFeed.click();
        messenger.click();
        navigateBack();
        watch.click();
        marketplace.click();
        navigateBack();
        events.click();
        navigateBack();
        pages.click();
        navigateBack();
        groups.click();
        navigateBack();
        friendLists.click();
        navigateBack();
        games.click();
        navigateBack();
        onThisDay.click();
        navigateBack();
        fundRisers.click();
        navigateBack();
        liveVideo.click();
        navigateBack();
        pokes.click();
        navigateBack();
        suggestEdits.click();
        navigateBack();
    }
}

