package page;

import common.commonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.io.IOException;

/**
 * Created by Kahina on 9/18/2017.
 */
public class PageSearchItems extends commonAPI {

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-search']/form/div[2]/div/input")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value){
//        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass()
//                .getEnclosingMethod().getName()+ ": "+ value));
        getSearchInputWebElement().sendKeys(value, Keys.ENTER);
    }
    public static void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearSearchInput() {
//        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }
    public void getDataFromExcelFileAndSearch()throws IOException, InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //Create instance of Excel file reader class
        ReadFromXlFileToSearch itemsToBeSearched = new ReadFromXlFileToSearch();
        //Page Factory class init
        PageSearchItems search = PageFactory.initElements(driver, PageSearchItems.class);
        //Read data from Excel File.
        String[] value = itemsToBeSearched.getDataFromExcelFile();
        //Running for each loop
        for (int i = 1; i < value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
