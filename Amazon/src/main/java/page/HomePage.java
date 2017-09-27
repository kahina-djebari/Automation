package page;

import common.commonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Kahina on 9/19/2017.
 */
public class HomePage extends commonAPI {

    @FindBy(how = How.XPATH, using = "//div[@id='nav-flyout-icp']//div[2]/a[1]/span/i")
    public static WebElement spanishlanguage;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-flyout-icp']//div[2]/a[1]/span/i")
    public static WebElement englishlanguage;

    public void changeLanguage() throws InterruptedException {      //locator issue
        mouseHoverByXpath("//span[@class='icp-nav-link-inner']");
        if (!spanishlanguage.isSelected()) {
            spanishlanguage.click();
        } else {
            System.out.println("Spanish already selected");
        }
        sleepFor(2);
        mouseHoverByXpath("//div[@id='nav-tools']//a/span[1]/span[1]/span[1");
        if (!englishlanguage.isSelected()) {
            englishlanguage.click();
        } else {
            System.out.println("English already selected");
        }
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-cart']/span[3]")
    public static WebElement cartBtn;

    public void clickOnCart() {
        cartBtn.click();
        System.out.println(getCurrentPageUrl());
        String actualTitle = "Amazon.com Shopping Cart";
        String expectedTitle = driver.getTitle();
        System.out.println(expectedTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='nav-link-accountList']/span[1]")
    public static WebElement signInBtn;

    public void signIn() {
        signInBtn.click();
        System.out.println(getCurrentPageUrl());
        String actualTitle = "Amazon Sign In";
        String expectedTitle = driver.getTitle();
        System.out.println(expectedTitle);
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @FindBy(how = How.LINK_TEXT,using = "Kitchen & Dining")              //locator issue
    public static WebElement kitchenAndDining;

    public void departments() throws InterruptedException {
        mouseHoverByLinkText("Departments");
        sleepFor(2);
        mouseHoverByLinkText("Home, Garden & Tools");
        kitchenAndDining.click();
    }

    @FindBy(how = How.XPATH,using = ".//*[@id='nav-your-amazon']")
    public static WebElement yourAmazonBtn;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-xshop']/a[2]")
    public static WebElement todaysDealsBtn;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-xshop']/a[3]")
    public static WebElement giftCardsBtn;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-xshop']/a[4]")
    public static WebElement sellBtn;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-xshop']/a[5]")
    public static WebElement helpBtn;

    public void homeBtns() throws InterruptedException {
        yourAmazonBtn.click();
        checkTitle("Amazon Sign In");
        navigateBack();
        todaysDealsBtn.click();
        checkTitle("Gold Box Deals | Today's Deals - Amazon.com");
        giftCardsBtn.click();
        checkTitle("Gift Cards & Registry @ Amazon.com");
        sellBtn.click();
        checkTitle("Amazon.com: Sell Products Online with Selling on Amazon");
        helpBtn.click();
        checkTitle("Amazon.com Help");
    }
}
