package search;

import common.commonAPI;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Kahina on 9/13/2017.
 */
public class DropDownMenu extends commonAPI {
    public List<String> getMenu(){
        List<String> departments = new ArrayList<String>();
        departments = getTextFromWebElements("#searchDropdownBox option");
        return departments;
    }
    public void typeOnInputSearch(List<String> data)throws InterruptedException{
        for(int i=0; i<10; i++) {
            typeByCss("#twotabsearchtextbox", data.get(i));
            input();
            sleepFor(2);
            clearBox();
        }
    }
    public void input() {
        keysInput("#twotabsearchtextbox");
    }
    public void clearBox() {
        clearInput("#twotabsearchtextbox");
    }
    public void dropDownSearch()throws InterruptedException{
        List<String> departments = getMenu();
        typeOnInputSearch(departments);
    }
}
