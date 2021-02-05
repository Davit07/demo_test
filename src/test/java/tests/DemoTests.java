package tests;

import org.testng.annotations.Test;
import pages.MainPage;

public class DemoTests extends BaseTest {
    MainPage mainPage = new MainPage();

    @Test
    public void logInTest() {
        mainPage.logIn()
                .getUserName("DAVIT.VARDANYAN@BETCONSTRUCT.COM");

    }

    @Test
    public void changeAppLanguageToEnglish() {
        mainPage.selectAppLanguage("eng")
                .getEnglishText("LOGIN");

    }

    @Test
    public void changeUserPasswordTest() {
        mainPage.logIn()
                .openChangeUserPasswordPage()
                .fillChangeUserPasswordFields()
                .clickOnChangePasswordButton()
                .getSuccessMessage("Գաղտնաբառը հաջողությամբ փոխվել է։");

    }

    @Test
    public void openCasinoPage() {
        mainPage.clickOnLeftMenu()
                .clickOnCasinoTab();
        closePopup2();
        mainPage.getTitleInCasinoFromPage("ԳԼԽԱՎՈՐ");

    }
}
