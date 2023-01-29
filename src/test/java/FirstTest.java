import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {

        //initiate the driver

        WebDriverManager.chromedriver().setup();

        //chrome option - setting/configuration that your browser will have
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(); // initiate the driver variable
        driver.manage().window().maximize();

//navigate to site using driver.get

        //driver.get("https://www.google.com/");

        driver.navigate().to("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("New York"); //name is the attribute that goes into the text box

        Thread.sleep(2000); //adding a pause - wait 2 seconds

        driver.findElement(By.name("btnK")).click();

        String result = driver.findElement(By.id("result-stats")).getText(); //defining this line in a string so we can print

        System.out.println(result);

        boolean results = result.contains("About"); //want to make sure about is there
        System.out.println("search results contains the word About: " +results);

        String title = driver.getTitle();
        System.out.println(title);

        boolean header = title.startsWith("New York");
        System.out.println("The page starts with New York: " +header);

        boolean display = driver.findElement(By.id("result-stats")).isDisplayed(); //isDisplayed is already a boolean
        System.out.println(display);

        if (display == true){
            System.out.println(result);
        }

    } //end of main



} // end of class
