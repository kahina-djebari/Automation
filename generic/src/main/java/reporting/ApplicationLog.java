package reporting;

/**
 * Created by Kahina on 9/19/2017.
 */
public class ApplicationLog {
    public static void epicLogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("launch local browser");
    }
}
