package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LeftMenu {
    public SelenideElement casinoTab = $(".casino");
    public SelenideElement sportsTab = $(".prematch active");
    public SelenideElement footballSportType = $(".Soccer active");


    public LeftMenu clickOnCasinoTab() {
        casinoTab.click();
        return this;
    }

    public LeftMenu clickOnSportsTab() {
        sportsTab.click();
        return this;
    }

    public LeftMenu clickOnFootballSportType() {
        footballSportType.click();
        return this;
    }



}
