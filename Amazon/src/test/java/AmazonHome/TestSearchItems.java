package AmazonHome;

import org.testng.annotations.Test;
import search.SearchItems;

/**
 * Created by Kahina on 9/9/2017.
 */
public class TestSearchItems extends SearchItems {

        @Test
        public void testSearchItems() throws InterruptedException {
            searchItems();
        }
}
