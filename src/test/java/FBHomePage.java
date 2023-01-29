import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBHomePage {
    WebDriver driver; //inititate driver

    //store element locators
    By username = By.id("email");
    By password = By.id ("pass");
    By LoginButton = By.name("login");

    //3 methods on 3 actions
    public FBHomePage  (WebDriver driver) {
        this.driver = driver;
    }

    public void Enterusername () {
        driver.findElement(username).sendKeys("test123");
    }
    public void EnterPassword(){
        driver.findElement(password).sendKeys(("000"));
    }





}






