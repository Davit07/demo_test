package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LeftMenu {
    public SelenideElement casinoTab = $(".casino");




    public LeftMenu clickOnCasinoTab() {
        casinoTab.click();
        return this;
    }


}
