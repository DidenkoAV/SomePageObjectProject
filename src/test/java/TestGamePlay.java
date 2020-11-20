import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestGamePlay {

    @Test(priority = 1)
    @Description("Check login form")
    public void loginCheck() throws Exception {
        AutorizationWindow window = new AutorizationWindow(DriverBase.setup());
        window.authorization();
        DriverBase.makeScreen(DriverBase.setup(),"src/image/png/Screen.png");
        Path content = Paths.get("src/image/png/Screen.png");
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment("Screen", is);
        }
    }
}
