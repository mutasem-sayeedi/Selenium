import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;

import java.io.File;

public class Reports extends ReusableMethods{

@Test
    public void ExtentReport () {
    //1. initiate variables, call extent html reporter
//the next 3 lines remian consistent
    ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("src/main/java/TestReport.html")); //copy path from java
    ExtentReports report = new ExtentReports(); //creating new report and attaching it to the file path
    report.attachReporter(extent);

    ExtentTest logger = report.createTest("Express End-to-End Test"); //refer to report variable and create the test

    logger.info("initiate the browser");
    StartBrowser();

    logger.info("Navigate to Express site");
    Navigate("https://www.express.com/");

    logger.info("Capture the Title");
    String title = driver.getTitle();
    System.out.println(title);

    logger.info("Title of the homr page " +title);


    report.flush();
}


}
