import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass extends ReusableMethods {

    public class CrossBrowser {
        //global static variable and can be used and shared

        @BeforeTest
        @Parameters("browser")//helps pass parameters
        public void StartBrowser(String Browser) {
            if (Browser.equalsIgnoreCase("firefox")) {

                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            } // end if browser firefox

            if (Browser.equalsIgnoreCase("chrome")) {

                WebDriverManager.chromedriver().setup();
                //chrome option - setting/configuration that your browser will have
                ChromeOptions options = new ChromeOptions();
                options.addArguments("incognito");

                driver = new ChromeDriver(); // initiate the driver variable
                driver.manage().window().maximize();
            }

        }
    }
}
