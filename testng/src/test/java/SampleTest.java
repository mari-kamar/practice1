import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import..
public class SampleTest {
    protected static WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openPage() {
        driver.get("https://otus.ru/");
    }

    @AfterClass
    public void setDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
