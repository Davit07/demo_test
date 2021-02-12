package tests;

import org.testng.annotations.Test;
import pages.MainPage;

public class LogInPageTests {
    MainPage mainPage = new MainPage();

    @Test
    public void logInTest() {
        mainPage.logIn()
                .getUserName("DAVIT.VARDANYAN@BETCONSTRUCT.COM");

    }

}
