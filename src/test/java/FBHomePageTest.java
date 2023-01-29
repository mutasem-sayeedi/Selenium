import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FBHomePageTest {
    @Test
    public void StartBrowser(){ //different design


        WebDriverManager.chromedriver().setup();
        //chrome option - setting/configuration that your browser will have
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(); // initiate the driver variable
        driver.manage().window().maximize();

        FBHomePage login = new FBHomePage(driver); //login is the instance

        driver.get("https://www.facebook.com/");

        login.Enterusername();
        login.EnterPassword();

    }


}



