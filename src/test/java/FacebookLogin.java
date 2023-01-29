import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin extends ReusableMethods{
    public static void main(String[] args) throws InterruptedException {

        StartBrowser();

        driver.navigate().to("https://www.facebook.com/");

        driver.findElement(By.name("email")).sendKeys("mutasem123@yahoo.com");

        driver.findElement(By.name("pass")).sendKeys("test123!");
        Thread.sleep(2000);

        //driver.findElement(By.name("login")).click();

        //String error = driver.findElement(By.className("_9ay7")).getText();
        //System.out.println(error);

        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"))//uses the sequence of the html dom or other attributes or locate element based on positioning


        /*close a browser
        driver.close();
        driver.quit(); */

















    } //end of main




}// end of class
