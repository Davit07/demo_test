package tests;

import org.testng.annotations.Test;
import pages.CasinoPage;
import pages.LeftMenu;
import pages.MainPage;

public class CasinoPageTests extends BaseTest {
    MainPage mainPage = new MainPage();
    LeftMenu leftMenu = new LeftMenu();
    CasinoPage casinoPage = new CasinoPage();

    @Test
    public void openCasinoPage() {
        mainPage.clickOnLeftMenu();
        leftMenu.clickOnCasinoTab();
        closePopup2();
        casinoPage.getTitleFromCasinoPage("ԳԼԽԱՎՈՐ");

    }
}
