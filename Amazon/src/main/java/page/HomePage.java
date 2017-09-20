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

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-flyout-icp']/div[2]/a[1]/span")
    public static WebElement spanishlanguage;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-flyout-icp']/div[2]/span/span")
    public static WebElement englishlanguage;

    public void changeLanguage() throws InterruptedException {           //locators issue
        mouseHoverByXpath(".//*[@id='icp-nav-flyout']/span[1]");
        if (!spanishlanguage.isSelected()) {
            spanishlanguage.click();
        } else {
            System.out.println("Spanish already selected");
        }
        sleepFor(2);
        mouseHoverByXpath(".//*[@id='icp-nav-flyout']/span[1]/span[1]/span[2]");
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
        String title = "Amazon.com Shopping Cart";
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        Assert.assertEquals(currentTitle, title);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='nav-link-accountList']/span[1]")
    public static WebElement signInBtn;
    public void signIn() {
        signInBtn.click();
        System.out.println(getCurrentPageUrl());
        String title = "Amazon Sign In";
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        Assert.assertEquals(currentTitle,title);
    }

    @FindBy(how = How.LINK_TEXT,using = "Kitchen & Dining") //locators issue
    public static WebElement kitchenAndDining;
    @FindBy(how = How.LINK_TEXT,using = "Departments")
    public static WebElement departments;
    public void departments() throws InterruptedException {
        mouseHoverByLinkText("Departments");
        sleepFor(3);
        mouseHoverByLinkText("Home, Garden & Tools");
        kitchenAndDining.click();
    }
}
