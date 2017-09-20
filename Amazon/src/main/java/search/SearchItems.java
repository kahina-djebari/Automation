package search;

import common.commonAPI;

/**
 * Created by Kahina on 9/13/2017.
 */
public class SearchItems extends commonAPI {

    public void searchItems() throws InterruptedException {
        System.out.println(driver.getTitle());
        System.out.println(getCurrentPageUrl());
        typeByCss("#twotabsearchtextbox","books");
        clickByXpath(".//*[@id='nav-search']/form/div[2]/div/input");
        sleepFor(3);
        clearInput("#twotabsearchtextbox");
        typeByCss("#twotabsearchtextbox","shoes");
        clickByXpath(".//*[@id='nav-search']/form/div[2]/div/input");
        sleepFor(3);
        clearInput("#twotabsearchtextbox");
        typeByCss("#twotabsearchtextbox","iPhone");
        clickByXpath(".//*[@id='nav-search']/form/div[2]/div/input");
        sleepFor(3);
        clearInput("#twotabsearchtextbox");
    }
}
