import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Loginpage;

import java.time.Duration;

public class Firsttest extends Basetest {

    //   WebDriver driver;

@Test
    public void firstTest01(){

    startLoginpage().loginPimpage();
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

}
     @Test
         public void test02 () {

     }
}
