package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.MainPage;

public class MainPageTests extends BaseTest {
    MainPage mainPage = new MainPage();
    LogInPage logInPage = new LogInPage();


    @Test
    public void changeAppLanguageToEnglish() {
        mainPage.selectAppLanguage("eng")
                .getLanguageText("LOGIN");

    }

    @Test
    public void changeAppLanguageToRussian() {
        mainPage.selectAppLanguage("rus")
                .getLanguageText("Логин");

    }

    @Test
    public void changeAppLanguageToArmenian() {
        mainPage.selectAppLanguage("arm")
                .getLanguageText("Մուտք");

    }

    @Test
    public void changeAppLanguageToGeorgian() {
        mainPage.selectAppLanguage("geo");
        Assert.assertEquals("შედით თქვენს ანგარიშზე", mainPage.getGeoText());

    }

    @Test
    public void changeAppLanguageToPersian() {
        mainPage.selectAppLanguage("fas")
                .getLanguageText("ورود به حساب کاربری");

    }

    @Test
    public void logInTest() {
        mainPage.clickOnLoginTitle();
        logInPage.logIn();
        mainPage.getUserName("DAVIT.VARDANYAN@BETCONSTRUCT.COM");

    }

    @Test
    public void checkOddsFormat(){
        System.out.println(mainPage.checkOddsFormat());
        Assert.assertEquals( mainPage.checkOddsFormat(), ".");

    }


}
