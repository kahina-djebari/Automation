package page;

import common.commonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Kahina on 9/27/2017.
 */
public class WegmansHome extends commonAPI {

    @FindBy(how = How.ID,using = "sign-up")
    public static WebElement signupBtn;
    @FindBy(how = How.XPATH,using = "//div[@class='webui-popover-content']/div/div[2]/div[2]/p/a")
    public static WebElement createNewAccount;
    @FindBy(how = How.ID,using = "first-name")
    public static WebElement FNameInputBox;
    @FindBy(how = How.ID,using = "last-name")
    public static WebElement LNameInputBox;
    @FindBy(how = How.ID,using = "address")
    public static WebElement addressInputBox;
    @FindBy(how = How.ID,using = "city")
    public static WebElement cityInputBox;
//    @FindBy(how = How.ID,using = "select2-states-container")
//    public static WebElement state;
//    @FindBy(how = How.ID,using = ".//*[@id='select2-states-results']/li[2]/ul/li[text()='Maryland']")
//    public static WebElement selectStatetate;
    @FindBy(how = How.ID,using = "zip")
    public static WebElement zipCodeInputBox;
    @FindBy(how = How.ID,using = "phone-number")
    public static WebElement phoneNumberInputBox;
    @FindBy(how = How.ID,using = "dob")
    public static WebElement dobInputBox;
    @FindBy(how = How.XPATH,using = "//span[@id='select2-store-container']")
    public static WebElement yourStore;
//    @FindBy(how = How.XPATH,using = "//li[@id='select2-store-result-sy4f-LOCATION_4'][text()='Fairport']")
//    public static WebElement selectStore;
    @FindBy(how = How.ID,using = "email")
    public static WebElement emailInputBox;
    @FindBy(how = How.ID,using = "confirm-email")
    public static WebElement confirmEmailInputBox;
    @FindBy(how = How.ID,using = "new-pasword")
    public static WebElement passwdInputBox;
    @FindBy(how = How.XPATH,using = "//input[@name='repassword']")
    public static WebElement confirmPasswdInputBox;
    @FindBy(how = How.ID,using = "submit")
    public static WebElement submitBtn;

    public void signup() {
        signupBtn.click();
        createNewAccount.click();
        checkTitle("Sign Up - Wegmans");
        FNameInputBox.sendKeys("nina");
        LNameInputBox.sendKeys("djeb");
        addressInputBox.sendKeys("2541 cherry valley Dr");
        cityInputBox.sendKeys("rockville");
        zipCodeInputBox.sendKeys("20853");
        phoneNumberInputBox.sendKeys("3015682547");
        dobInputBox.sendKeys("12171999");
        yourStore.click();
        emailInputBox.sendKeys("ninadjeb@gmail.com");
        confirmEmailInputBox.sendKeys("ninadjeb@gmail.com");
        passwdInputBox.sendKeys("Nina@1999");
        confirmPasswdInputBox.sendKeys("Nina@1999");
        submitBtn.click();
    }

    @FindBy(how = How.XPATH,using = "//div[@class='box-align']/div[3]/nav/ul/li[1]")
    public static WebElement storesBtn;
    @FindBy(how = How.XPATH,using = "//div[@class='box-align']/div[3]/nav/ul/li[2]")
    public static WebElement pharmacyBtn;
    @FindBy(how = How.XPATH,using = "//div[@class='box-align']/div[3]/nav/ul/li[3]")
    public static WebElement restaurantsBtn;
    @FindBy(how = How.XPATH,using = "//div[@class='box-align']/div[3]/nav/ul/li[4]")
    public static WebElement pickupBtn;

    public void homeBtns(){
        storesBtn.click();
        checkTitle("Stores - Wegmans");
        pharmacyBtn.click();
        checkTitle("Pharmacy - Wegmans");
        restaurantsBtn.click();
        checkTitle("Restaurants - Wegmans");
        pickupBtn.click();
        checkTitle("Pickup & Delivery (Catering, Grocery, Rx) - Wegmans");
    }
}
