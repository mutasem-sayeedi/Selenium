import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExpressActionItem extends ReusableMethods {

    @Test
    public void Express()throws InterruptedException {
        StartBrowser();
        //1. Go to Express.com
        //2. Capture the title of the page and print it
        Navigate("https://www.express.com/");
        String title = driver.getTitle();
        System.out.println("The title is " +title);

        //3. Capture the list of tabs and assert there are 8 tabs. need help
        //4. Print all the tabs name
        //5. Hover over women's tab.
        //6. Click jackets & coats category - need help because of Hover function
        getText("//*[@role='menubar']");
        //String tabs = driver.findElement(By.xpath("//*[@role='menubar']"));
        String tabs = title;
        System.out.println(tabs.length()); //NEED ASSISTANCE

        mouseHover("//*[@id=\"raven-header-mega-menu\"]/nav/ol/li[1]/a");
        Click("//*[@id=\"raven-header-mega-menu\"]/nav/ol/li[1]/a");
        Click("//*[@aria-label='Womens Outerwear']");
        //7. Capture the title of the page and ensure it contains “Women’s Jacket”
        //8. Click on the first item

        String titleJacket = driver.getTitle();
        boolean pagetitleJacket = titleJacket.equals("Women's Jacket");
        System.out.println("Title page displays as 'Women's Jacket' " +pagetitleJacket);
        Thread.sleep(2000);
        Click("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/a[1]");

        //9. On the product page, capture the title of the product
        //10. Capture the price
        //11. Choose a color
        //12. Choose a size
        //13. Add to cart
        Thread.sleep(3000);
       //String shawl = getText("//div[contains(@class,'page__price')]//h1"); //not working
        //String shawlPrice = getText("//*[@class='header2 _1VkHB1tx price__price']"); //not working
        String shawl = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/div[1]/div[2]/h1")).getText();
        String shawlPrice = driver.findElement(By.xpath("//*[@class='header2 _1VkHB1tx price__price']")).getText();
        System.out.println("The title and the price are " +shawl+ " and " +shawlPrice);
        Thread.sleep(3000);
        Click("//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/div/div[2]/a[1]/span[1]/span[2]");
        Click("//*[@aria-label='Select m Size']");
        Click("//*[@unbxdattr='AddToCart']");

        /*14. Hover over the cart on the top corner
        15. Click view bag & check out
        16. Verify the name and price again
        17. Click checkout */

        mouseHover("//*[@data-icon='shoppingBag']");
        Click("//*[@data-icon='shoppingBag']");
        getText("//*[@id=\"expbi-0\"]/div[2]/div/div[1]/section/div[2]/a"); //title
        getText("//*[@id=\"expbi-0\"]/div[2]/div/div[1]/section/div[2]/div[1]/p");
        String shawlTitle = driver.findElement(By.xpath("//*[@id=\"expbi-0\"]/div[2]/div/div[1]/section/div[2]/a")).getText();
        Click("//*[@aria-label='Continue to Checkout']");

        //18. On the pop up, checkout as guest
        //19. Fill out as much info on checkout as possible

        Click("//*[@class='IR0Wws-V _72s6U14t kaafrVcs h3nDN']");
        Thread.sleep(3000);
        EnteringText("//*[@id='contact-information-firstname']","Mutasem");
        EnteringText("//*[@id='contact-information-lastname']","Sayeedi");
        EnteringText("//*[@id='contact-information-email']","mutasem.sayeedi@gmail.com");
        EnteringText("//*[@id='contact-information-confirmemail']","mutasem.sayeedi@gmail.com");
        EnteringText("//*[@id='contact-information-phone']","1724737654");



    } //end express

} //end class
