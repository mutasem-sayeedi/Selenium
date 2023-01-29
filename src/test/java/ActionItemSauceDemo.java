import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class ActionItemSauceDemo extends ReusableMethods {

    public static void main(String[] args) throws InterruptedException{
        StartBrowser();
        //1. Navigate to Saucedemo.com
        // 2. On the initial screen, capture the title of the page and verify it matches “Swag Labs”
        driver.navigate().to("https://www.saucedemo.com/");
        String title = driver.getTitle();
        System.out.println(title);

        /*
            3. Capture the standard_user username from the UI and enter it on the username field
            4. Capture the password from the Ui and enter it on the password field
            5. Click login
            6. Change the filter to Price (low to high
         */
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        WebElement dropdown = driver.findElement(By.xpath("//*[contains(@class,'product_sort')]"));
        Select sort =  new Select((dropdown));
        sort.selectByVisibleText("Price (low to high)");

        Thread.sleep(2000);
    /*
        7. Click on the Sauce Labs Onesie item. On the next page Capture and verify the name and price
        8. Click Back to Product button
        9. Add to cart item- “ Sauce Labs Backpack”
        10. Click on the Cart icon at the top corner of the page
    */
        driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).click();

        String onesie = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
        System.out.println("The name of the product is " +onesie);
        boolean SauceOnesie = onesie.contains("Onesie");
        System.out.println(SauceOnesie);

        String onesiePrice = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[3]")).getText();
        System.out.println(onesiePrice);

        Thread.sleep(2000);

        driver.findElement(By.id("back-to-products")).click();



        Thread.sleep(2000);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        String sauceBackpack = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        String backpackPrice = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[contains(@class,'shopping_cart_link')]")).click();
    /*
    11. Verify the item name and price to match what the name and price was on the product page
    12. Click checkout

    */
        String backpack = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        System.out.println(backpack);

        boolean sauceBackpack1 = backpack.contains(sauceBackpack);
        System.out.println("The name on the checkout page matches what is listed on the main page " +sauceBackpack1);

        String backpackPrice1 = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
        boolean backpackPriceVerify = backpackPrice1.contains(backpackPrice);
        System.out.println("Price matches main page: " +backpackPriceVerify);

        driver.findElement(By.id("checkout")).click();

        /*
        13. Enter first name, last name, zip on the next page
        14. Click continue
         */
        driver.findElement(By.name("firstName")).sendKeys("Mutasem");
        driver.findElement(By.name("lastName")).sendKeys("Sayeedi");
        driver.findElement(By.name("postalCode")).sendKeys("11435");

        Thread.sleep(2000);

        driver.findElement(By.id("continue")).click();

        Thread.sleep(2000);

        // 15. Verify the name and price of the product matches as before
        String checkOutProductName = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        boolean checkOutProduct = checkOutProductName.contains(sauceBackpack);
        System.out.println("Checkout matches to previous pages " +checkOutProduct);

        String checkOutPrice = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
        boolean checkOutCost = checkOutPrice.contains(backpackPrice);
        System.out.println("Price matches previous pages " +checkOutCost);

        //16. Verify payment info is using “SauceCard”
        String paymentInfo = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[2]")).getText();
        boolean payment = paymentInfo.contains("SauceCard");
        System.out.println("Payment info is SauceCard");

        //17. Verify Shipping information as “FREE PONY EXPRESS”
        String shipping = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]")).getText();
        boolean shippingInfo = shipping.contains("FREE PONY EXPRESS” ");
        System.out.println("Shipping info is Free Pony Express " +shippingInfo);

        /*
        18. Capture the total price
        19. Click finish
         */
        String totalPrice = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")).getText();
        System.out.println(totalPrice);

        driver.findElement(By.id("finish")).click();


        //20. Capture the text on the next page to ensure order was complete.
        String confirmation = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]")).getText();
        System.out.println(confirmation);




















    } //end of main


} //end of class

