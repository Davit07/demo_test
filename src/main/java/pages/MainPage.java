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
    public SelenideElement event = $("#view-container > div:nth-child(4) > div.upcoming-events-p > div.upcoming-games-list-v-w > div:nth-child(1) > div.list-games-m > div:nth-child(1) > div > ul > li:nth-child(2) > div > div > span");
    public SelenideElement event2 = $("#view-container > div.h-w-mini-container > div.sports-navigation.isPC > div > a:nth-child(1) > p");



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

    public Object checkOddsFormat2(){
        char [] charArray = loginTitle.text().toCharArray();
             for (char element: charArray){
              return element;
       }

        return this;
    }


}
