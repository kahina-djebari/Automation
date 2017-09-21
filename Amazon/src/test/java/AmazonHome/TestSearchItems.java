package AmazonHome;

import org.testng.annotations.Test;

import reporting.ApplicationLog;
import reporting.TestLogger;
import search.SearchItems;

/**
 * Created by Kahina on 9/9/2017.
 */
public class TestSearchItems extends SearchItems {

        @Test
        public void testSearchItems() throws InterruptedException {
//            ApplicationLog.epicLogger("Search");
//            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            searchItems();
        }
}
