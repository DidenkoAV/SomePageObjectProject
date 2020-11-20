import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutorizationWindow {
    public WebDriver driver;

    public AutorizationWindow(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@name, 'USER_LOGIN')]")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains(@name, 'USER_PASSWORD')]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[contains(@class, 'login-btn')]")
    private WebElement submitField;

    public void authorization(){
        loginField.sendKeys(ConfProperties.getProperty("login"));
        passwordField.sendKeys(ConfProperties.getProperty("password"));
        submitField.click();
    }
}
