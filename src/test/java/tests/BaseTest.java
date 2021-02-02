package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    public static final String BASE_URL = "https://m.vivarobet.am/";
    public SelenideElement popupCloseButton = $(".popup-closed-b");
    public SelenideElement popup2 = $(".popup-closed-b");

    @BeforeMethod
    public void beforeMethodSignIn() {
        Configuration.browserSize = "375x812";
        open(BASE_URL);
        sleep(5000);
        closeNewVersionPopup();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeWebDriver();
    }


    protected void closeNewVersionPopup() {
        if (popupCloseButton.isDisplayed()) {
            popupCloseButton.click();
        }
    }

    protected void closePopup2() {
        if (popup2.isDisplayed()) {
            popup2.click();
        }
    }

}
