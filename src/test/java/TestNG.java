import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG extends ReusableMethods {
 //TESTNG ANNOTATIONS TO STRUCTURE OUR TESTS

    @BeforeTest
    public void SetUp() { //will contain any code before execution

        StartBrowser();

    } // end SetUp

    @Test (priority = 1) //set the order of execution
    public void SampleTest () { //testing code goes in here

        Navigate("https://www.amazon.com/");

        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com"); //hard assert
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Rolex");

    } //end test

    @Test (priority = 0)
    public void Test2 (){
        Navigate("https://www.facebook.com/");
        String title = driver.getTitle();

        SoftAssert softA = new SoftAssert(); //inititate soft assert variable
        softA.assertEquals(title, "facebook");

        driver.findElement(By.name("email")).sendKeys("mutasem123@yahoo.com");

        softA.assertAll(); //this line has to be written at the end of all soft assert codes

    } //end of test 2

    //@AfterTest look into
    public void EndReport() {
      //  driver.close();;
       // driver.quit();


    } //end after









} //end of public class
