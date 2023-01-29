import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.xml.sax.Locator;

import java.io.File;
import java.sql.Driver;

public class ReusableMethods {
    //global variables = these variables sit outside of methods and can be shared across all static methods

    public static WebDriver driver; //global variable
    public static ExtentTest logger; //global variable

    public static ExtentReports report;

    public static void StartBrowser(){

        //initiate the driver

        WebDriverManager.chromedriver().setup();
        //chrome option - setting/configuration that your browser will have
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

        driver = new ChromeDriver(); // initiate the driver variable
        driver.manage().window().maximize();


    } //end StartBrowser



    //navigate to site
    public static void Navigate(String URL) {
        driver.get(URL);
    } // END NAVIGATE

    //click
    public static void Click(String Locator) {
        driver.findElement(By.xpath(Locator)).click();

        /*
        if(type.equalsIgnoreCase("id")) {
            driver.findElement(By.id(Locator)).click(); }
        if(type.equalsIgnoreCase("name")) {
        driver.findElement(By.name(Locator)).click(); }
        */

    }//end click


    // send keys
    public static void EnteringText (String Locator, String Text) {
        driver.findElement(By.xpath(Locator)).sendKeys(Text);
    } //end Entering Text


    //mouseHover
    public static void mouseHover (String locator) {
        WebElement Account = driver.findElement(By.xpath(locator));
        Actions Hover = new Actions(driver);
        Hover.moveToElement(Account).build().perform();
    } // end of mHover

  //select
  public static void dropdown (String locator, String value) {
        WebElement dropdown = driver.findElement(By.xpath(locator));
      Select sort = new Select(dropdown);
      sort.selectByValue(value);
    } //end of select

    //getText
    public static String getText(String locator){
        String text = driver.findElement(By.xpath(locator)).getText();
        System.out.println(text);
        return text;
    } //end of getText

    public static void SetupReport (String TestName) {
        //1. initiate variables, call extent html reporter
//the next 3 lines remain consistent
        ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("src/main/java/TestReport.html")); //copy path from java

        report = new ExtentReports(); //creating new report and attaching it to the file path
        report.attachReporter(extent);

         logger = report.createTest(TestName); //refer to report variable and create the test
    } // end report

    @AfterTest
    public static void EndTest() {
        report.flush();

    } //end of EndReport

} //end class
