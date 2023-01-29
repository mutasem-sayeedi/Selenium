import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZocDocTest  extends ReusableMethods{

    @BeforeTest
    public void Setup() {

        StartBrowser();
    } // end SetUp

    @Test
    public void ZocDoc() {
        Navigate("https://book.zocdoc.com/");

        String title = driver.getTitle();
        System.out.println(title);
    } // end Test1


}//end class



