package AmazonHome;

import common.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.PageSearchItems;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;

/**
 * Created by Kahina on 9/18/2017.
 */
public class TestSearchByReadingFromXlFile extends commonAPI {

    @Test
    public void testReadingFromXlFile() throws IOException, InterruptedException {
//        ApplicationLog.epicLogger("Search");
//        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PageSearchItems search = PageFactory.initElements(driver,PageSearchItems.class);
        search.getDataFromExcelFileAndSearch();
    }
}
