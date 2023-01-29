import org.openqa.selenium.By;

public class FacebookXpath extends ReusableMethods {
    public static void main(String[] args) throws InterruptedException {
        StartBrowser();

        driver.navigate().to("https://www.facebook.com/");
       driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hello@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"passContainer\"]")).sendKeys("test123");
    driver.findElement(By.xpath("//*[@id=\"u_0_5_Mu\"]")).click();
    Thread.sleep(3000);
    String error = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
        System.out.println(error);

        boolean VerifyError = error.endsWith("incorrect");
        System.out.println(VerifyError);
    }







}// end of class
