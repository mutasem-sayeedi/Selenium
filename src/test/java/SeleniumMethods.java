import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumMethods extends ReusableMethods{
    public static void main(String[] args) throws InterruptedException{
        StartBrowser();

        /*driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(By.id("login-button")).click();

        //select method to handle dropdowns

        WebElement dropdown = driver.findElement(By.xpath("//*[contains(@class,'product_sort')]")); // store it as a web element

        //Select sort = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));

        Select sort = new Select(dropdown);
        //sort.selectByVisibleText("Price (low to high)");
        //sort.selectByValue("hilo");
        sort.selectByIndex(1); //Z through A


    driver.navigate().to("https://www.amazon.com");

    //Mouse Hover action
    WebElement accounts = driver.findElement(By.id("nav-link-accountList"));

        Actions mHover = new Actions(driver);
        mHover.moveToElement(accounts).build().perform(); //mouse hover is move to element
*/
        driver.navigate().to("https://www.Express.com");
        List<WebElement> ExpressDepts = driver.findElements(By.xpath("//nav[@aria-label = 'Express Departments']/ol/li"));
        System.out.println("There are " +ExpressDepts.size() + " categories");//returns all 8. the ol/li goes through each locator

        for (int i = 0; i<8; i++){
            System.out.println(ExpressDepts.get(i).getText()); //prints each category . gettEXT is that command

        }






    } // end of main



} //end of class
