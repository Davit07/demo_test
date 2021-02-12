package tests;

import org.testng.annotations.Test;
import pages.LeftMenu;
import pages.MainPage;

public class LeftMenuTests extends BaseTest {
    MainPage mainPage = new MainPage();
    LeftMenu leftMenu = new LeftMenu();

    @Test
    public void openCasinoPage() {
        mainPage.clickOnLeftMenu();
        leftMenu.clickOnCasinoTab();
        closePopup2();
        mainPage.getTitleInCasinoFromPage("ԳԼԽԱՎՈՐ");

    }
}
