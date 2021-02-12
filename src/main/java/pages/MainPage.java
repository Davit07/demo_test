package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends LogInPage {

    public SelenideElement loginTitle = $(".right-top-nav-new-h:nth-child(2)");
    public SelenideElement userName = $(".home-wrapper-login");
    public SelenideElement selectLanguage = $("div:nth-child(5) .select-contain-m > select");
    public SelenideElement leftMenuIcon = $(".left-top-nav");


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

    public MainPage getEnglishText(String text) {
        loginTitle.shouldHave(Condition.text(text));
        return this;
    }


    public MainPage clickOnLeftMenu() {
        leftMenuIcon.click();
        return this;
    }


}
