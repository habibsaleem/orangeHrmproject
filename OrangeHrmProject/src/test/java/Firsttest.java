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

    PageFactory.initElements(driver, Loginpage.class).loginPimpage();

    }
}
