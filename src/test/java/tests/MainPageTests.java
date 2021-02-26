package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LeftMenu;
import pages.LogInPage;
import pages.MainPage;

public class MainPageTests extends BaseTest {
    MainPage mainPage = new MainPage();
    LeftMenu leftMenu = new LeftMenu();
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

<<<<<<< HEAD
    @Test
    public void checkOddsFormatForDecimal() {
        mainPage.clickOnLeftMenu();
        leftMenu.clickOnSportsTab();
        mainPage.selectOddsFormat("decimal");
        Assert.assertEquals(mainPage.checkOddsFormat(), ".");
    }

    @Test
    public void checkOddsFormatForFractional() {
        mainPage.selectOddsFormat("fractional");
        Assert.assertEquals(mainPage.checkOddsFormat(), "/");
    }

    @Test
    public void checkOddsFormatForAmerican() {
        mainPage.selectOddsFormat("american");
        Assert.assertEquals(mainPage.checkOddsFormat(), "-");
    }

    @Test
    public void checkOddsFormatForHongkong() {
        mainPage.selectOddsFormat("hongkong");
        Assert.assertEquals(mainPage.checkOddsFormat(), ".");
    }
=======
//    @Test
//    public void checkOddsFormat(){
//        System.out.println(mainPage.checkOddsFormat());
//        Assert.assertEquals( mainPage.checkOddsFormat(), ".");
//
//    }
//    @Test
//    public void checkOddsFormat2(){
//        Assert.assertEquals(mainPage.checkOddsFormat2(), "/");
//    }
//
>>>>>>> 850cbd3c726f5c508d912bc8f8ee348eb01389d2

    @Test
    public void checkOddsFormatForMalay() {
        mainPage.selectOddsFormat("malay");
        Assert.assertEquals(mainPage.checkOddsFormat(), "-");
    }

    @Test
    public void checkOddsFormatForIndo() {
        mainPage.selectOddsFormat("indo");
        Assert.assertEquals(mainPage.checkOddsFormat(), ".");
    }

}
