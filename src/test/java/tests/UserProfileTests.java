package tests;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.MainPage;
import pages.RightMenuPage;
import pages.UserProfilePage;

public class UserProfileTests extends BaseTest {
    MainPage mainPage = new MainPage();
    LogInPage logInPage = new LogInPage();
    RightMenuPage rightMenuPage = new RightMenuPage();
    UserProfilePage userProfilePage = new UserProfilePage();


    @Test
    public void changeUserPasswordTest() {
        mainPage.clickOnLoginTitle();
        logInPage.logIn();
        mainPage.clickOnUserName();
        rightMenuPage.openChangeUserPasswordPage();
        userProfilePage
                .fillChangeUserPasswordFields()
                .clickOnChangePasswordButton()
                .getSuccessMessage("Գաղտնաբառը հաջողությամբ փոխվել է։");

    }
}
