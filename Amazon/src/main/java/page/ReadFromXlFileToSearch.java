package page;

import common.commonAPI;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;


/**
 * Created by Kahina on 9/18/2017.
 */
public class ReadFromXlFileToSearch extends commonAPI {
    DataReader dr = new DataReader();
    public String [] getDataFromExcelFile()throws IOException {
//        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir")+"/data/itemsToSearch.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
