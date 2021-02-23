package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends LogInPage {

    public SelenideElement loginTitle = $(".right-top-nav-new-h:nth-child(2)");
    public SelenideElement userName = $(".home-wrapper-login");
    public SelenideElement selectLanguage = $("div:nth-child(5) .select-contain-m > select");
    public SelenideElement leftMenuIcon = $(".left-top-nav");
    public SelenideElement oddsFormat = $("#view-container > div.footer-m-parent > div:nth-child(6) > div > ul > li:nth-child(2) > div > select");
    public SelenideElement firsLeagueInTheList = $(" li:nth-child(1) > div.competition-naw-wrapper-m > div > ul > li:nth-child(1) > a > p > span");
    public SelenideElement event = $(" div:nth-child(2) > div:nth-child(1) > div > ul > li:nth-child(2) > div > div > span");

    public MainPage clickOnLoginTitle() {
        loginTitle.click();
        return this;
    }

    public MainPage clickOnUserName() {
        userName.click();
        return this;
    }


    public MainPage getUserName(String text) {
        userName.shouldHave(Condition.text(text));
        return this;
    }


    public MainPage selectAppLanguage(String text) {
        selectLanguage.selectOptionByValue(text);
        return this;
    }

    public MainPage getLanguageText(String text) {
        loginTitle.shouldHave(Condition.text(text));
        return this;
    }

    public String getGeoText() {
        String text = loginTitle.getOwnText();
        return text;
    }


    public MainPage clickOnLeftMenu() {
        leftMenuIcon.click();
        return this;
    }

    public MainPage selectOddsFormat(String value) {
        oddsFormat.selectOptionByValue(value);
        return this;
    }

    public String checkOddsFormat() {
        String text = event.getText();
        String ch = String.valueOf(text.charAt(1));
        return ch;
    }

    public MainPage openFootballMatch() {
        leftMenuIcon.click();
        return this;
    }
    public MainPage clickOnFirstLeague() {
        firsLeagueInTheList.click();
        return this;
    }



}
