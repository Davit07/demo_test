package tests;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.MainPage;

public class MainPageTests extends BaseTest {
    MainPage mainPage = new MainPage();
    LogInPage logInPage = new LogInPage();


    @Test
    public void changeAppLanguageToEnglish() {
        mainPage.selectAppLanguage("eng")
                .getEnglishText("LOGIN");

    }

    @Test
    public void changeAppLanguageToRussian() {
        mainPage.selectAppLanguage("rus")
                .getEnglishText("Логин");

    }

    @Test
    public void changeAppLanguageToArmenian() {
        mainPage.selectAppLanguage("arm")
                .getEnglishText("Մուտք");

    }

    @Test
    public void changeAppLanguageToGeorgian() {
        mainPage.selectAppLanguage("geo")
                .getEnglishText("\u1CA8\u1C94\u1C93\u1C98\u1C97 \u1C97\u1CA5\u1C95\u1C94\u1C9C\u1CA1 \u1C90\u1C9C\u1C92\u1C90\u1CA0\u1C98\u1CA8\u1C96\u1C94");

    }

    @Test
    public void changeAppLanguageToPersian() {
        mainPage.selectAppLanguage("fas")
                .getEnglishText("ورود به حساب کاربری");

    }

    @Test
    public void logInTest() {
        mainPage.clickOnLoginTitle();
        logInPage.logIn();
        mainPage.getUserName("DAVIT.VARDANYAN@BETCONSTRUCT.COM");

    }


}
