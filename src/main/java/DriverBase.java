import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.util.concurrent.TimeUnit;



public class DriverBase {
    private static WebDriver driver;

    static {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(ConfProperties.getProperty("notification"));
        System.setProperty(ConfProperties.getProperty("nameDriver"), ConfProperties.getProperty("pathDriver"));
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("startpage"));
    }

    @BeforeClass
    static WebDriver setup() {
        return driver;
    }

    public static void makeScreen (WebDriver driver,String fileWithPath) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
