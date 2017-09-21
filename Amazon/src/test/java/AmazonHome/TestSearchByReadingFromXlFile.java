package AmazonHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.PageSearchItems;
import reporting.ApplicationLog;

import java.io.IOException;

/**
 * Created by Kahina on 9/18/2017.
 */
public class TestSearchByReadingFromXlFile extends commonAPI {

    @Test
    public void testReadingFromXlFile() throws IOException, InterruptedException {
        PageSearchItems search = PageFactory.initElements(driver,PageSearchItems.class);
        search.getDataFromExcelFileAndSearch();
    }
}
