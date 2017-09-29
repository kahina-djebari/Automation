package page;

import common.commonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Kahina on 9/27/2017.
 */
public class UserStoryMortgage extends commonAPI {
    @FindBy(how = How.XPATH,using = ".//*[@id='hp-section-2']/form/ul/li[3]/a")
    public static WebElement loanBtn;
    @FindBy(how = How.XPATH,using = "//div[@class='submenu-singlecol']/a[1][text()='Mortgage']")
    public static WebElement mortgageBtn;
    @FindBy(how = How.ID,using = "change-mortgage-rates-medium")
    public static WebElement getCustomRateBtn;
    @FindBy(how = How.XPATH,using = "//input[@id='purchase-price-input-medium']")
    public static WebElement priceBox;
    @FindBy(how = How.XPATH,using = "//input[@id='down-payment-input-medium']")
    public static WebElement downPaymentBox;
    @FindBy(how = How.XPATH,using = "//input[@id='zip-code-input-medium']")
    public static WebElement zipCodeBox;
    @FindBy(how = How.ID,using = "update-button-medium")
    public static WebElement updateRateBtn;
    @FindBy(how = How.XPATH,using = "//div[@class='medium-12 columns']/div/div[4]/div[5]/div/div/p[1]/span[2]")
    public static WebElement resultBox;

    public void mortgage() throws InterruptedException {
        loanBtn.click();
        mortgageBtn.click();
        checkTitle("Mortgages - Home Mortgage Loans from Bank of America");
        getCustomRateBtn.click();
        waitUntilVisible(By.xpath("//input[@id='purchase-price-input-medium']"));
        priceBox.sendKeys("500000");
        downPaymentBox.sendKeys("100000");
        zipCodeBox.sendKeys("20854");
        updateRateBtn.click();
        sleepFor(2);
        Assert.assertEquals(resultBox.getText(),"$1,660");
    }
}
