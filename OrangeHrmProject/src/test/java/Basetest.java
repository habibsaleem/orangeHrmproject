import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Loginpage;

import java.time.Duration;

public class Basetest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = Browser.getdriver();
        driver.navigate().to(Info.url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterMethod
    public  void closeBrowser(){
        driver.close();
        driver.quit();
    }

    public Loginpage startLoginpage () {
        return PageFactory.initElements(driver,Loginpage.class);
    }
}
