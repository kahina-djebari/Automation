package home;

import common.commonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * Created by Kahina on 9/27/2017.
 */
public class Products extends commonAPI {
    public void products() {
        mouseHoverByXpath("//div[@class='nav-bar-wrap box-align']/div[2]/nav/ul/li[1]/a/i");
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='child-nav-item clearfix']"));
        for(int i=0; i<list.size(); i++) {
            WebElement element = list.get(i);
            element.click();
        }
    }
}
