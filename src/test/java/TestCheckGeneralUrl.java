import io.qameta.allure.Allure;
import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ValidatableResponse;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestCheckGeneralUrl {
    private static String host = "https://gamification.dev.wehive.digital";

    @Test(priority = 2,description = "Check 'bonus' URL")
    public void checkBonusURL() throws Exception {
        ValidatableResponse response = RestAssured.given()
                .log()
                .all()
                .when()
                .get(host + "/bonus/")
                .then()
                .log()
                .body()
                .statusCode(200);
        Allure.addAttachment("Response code: ", String.valueOf(response.extract().statusCode()));
        DriverBase.makeScreen(DriverBase.setup(),"src/image/png/Screen.png");
        Path content = Paths.get("src/image/png/Screen.png");
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment("Screen", is);
        }
    }

    @Test(priority = 3,description = "Check 'bonus/ratings' URL")
    public void checkBonusRatingsURL() throws Exception {
        ValidatableResponse response = RestAssured.given()
                .log()
                .all()
                .when()
                .get(host + "/bonus/ratings/")
                .then()
                .log()
                .body()
                .statusCode(200);
        Allure.addAttachment("Response code: ", String.valueOf(response.extract().statusCode()));
        DriverBase.makeScreen(DriverBase.setup(),"src/image/png/Screen.png");
        Path content = Paths.get("src/image/png/Screen.png");
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment("Screen", is);
        }
    }

    @Test(priority = 4,description = "Check 'bonus/leaders' URL")
    public void checkBonusLeadersURL() throws Exception {
        ValidatableResponse response = RestAssured.given()
                .log()
                .all()
                .when()
                .get(host + "/bonus/leaders/")
                .then()
                .log()
                .body()
                .statusCode(200);
        Allure.addAttachment("Response code: ", String.valueOf(response.extract().statusCode()));
        DriverBase.makeScreen(DriverBase.setup(),"src/image/png/Screen.png");
        Path content = Paths.get("src/image/png/Screen.png");
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment("Screen", is);
        }
    }

    @Test(priority = 5,description = "Check 'bonus/stream' URL")
    public void checkBonusStreamURL() throws Exception {
        ValidatableResponse response = RestAssured.given()
                .log()
                .all()
                .when()
                .get(host + "/bonus/stream/")
                .then()
                .log()
                .body()
                .statusCode(200);
        Allure.addAttachment("Response code: ", String.valueOf(response.extract().statusCode()));
        DriverBase.makeScreen(DriverBase.setup(),"src/image/png/Screen.png");
        Path content = Paths.get("src/image/png/Screen.png");
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment("Screen", is);
        }
    }

    @Test(priority = 6,description = "Check 'bonus/shop' URL")
    public void checkBonusShopURL() throws Exception {
        ValidatableResponse response = RestAssured.given()
                .log()
                .all()
                .when()
                .get(host + "/bonus/shop/")
                .then()
                .log()
                .body()
                .statusCode(200);
        Allure.addAttachment("Response code: ", String.valueOf(response.extract().statusCode()));
        DriverBase.makeScreen(DriverBase.setup(),"src/image/png/Screen.png");
        Path content = Paths.get("src/image/png/Screen.png");
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment("Screen", is);
        }
    }

}
