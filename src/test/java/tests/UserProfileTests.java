package tests;

import org.testng.annotations.Test;
import pages.MainPage;

public class UserProfileTests {
    MainPage mainPage = new MainPage();

    @Test
    public void changeUserPasswordTest() {
        mainPage.logIn()
                .openChangeUserPasswordPage()
                .fillChangeUserPasswordFields()
                .clickOnChangePasswordButton()
                .getSuccessMessage("Գաղտնաբառը հաջողությամբ փոխվել է։");

    }
}
