package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public final String userEmail = "davit.vardanyan@betconstruct.com";
    public final String userPassword = "Test12345";

    public SelenideElement loginTitle = $(".right-top-nav-new-h:nth-child(2)");
    public SelenideElement emailField = $("#login-name");
    public SelenideElement passwordField = $("#password");
    public SelenideElement logInButton = $(".button-view-normal-m:not(.trans-m)");
    public SelenideElement userName = $(".home-wrapper-login:nth-child(1)");
    public SelenideElement selectLanguage = $("div:nth-child(4) > div > ul > li:nth-child(2) > div > select");
    public SelenideElement myAccountIcon = $(" div.profile > div.title-row-u-m > p > span");
    public SelenideElement changePasswordTitle = $("div.profile > div.open-view-single-u-m > ul > li:nth-child(2) > a > p > span");
    public SelenideElement newPasswordField = $(".password1");
    public SelenideElement newPasswordField2 = $(".password2");
    public SelenideElement oldPasswordField = $("input[name=oldpassword]");
    public SelenideElement changePasswordButton = $(".button-view-normal-m");
    public SelenideElement successMessage = $(".success");
    public SelenideElement leftMenuIcon = $(".left-top-nav");
    public SelenideElement casinoTab = $(".casino");
    public SelenideElement mainTitleInCasinoPage = $("div > a.active");


    public MainPage clickOnLoginTitle() {
        loginTitle.click();
        return this;
    }

    public MainPage typeInEmailField(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public MainPage typeInPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public MainPage clickOnLoginButton() {
        logInButton.click();
        return this;
    }

    public MainPage getUserName(String text) {
        userName.shouldHave(Condition.text(text));
        return this;
    }

    public MainPage logIn() {
        clickOnLoginTitle();
        typeInEmailField(userEmail);
        typeInPasswordField(userPassword);
        clickOnLoginButton();
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

    public MainPage changeUserPassword() {
        sleep(3000);
        userName.click();
        myAccountIcon.click();
        changePasswordTitle.click();
        newPasswordField.sendKeys(userPassword);
        newPasswordField2.sendKeys(userPassword);
        oldPasswordField.sendKeys(userPassword);
        changePasswordButton.click();
        return this;
    }

    public MainPage getSuccessMessage(String text) {
        successMessage.shouldHave(Condition.text(text));
        return this;
    }

    public MainPage clickOnLeftMenu() {
        leftMenuIcon.click();
        return this;
    }

    public MainPage clickOnCasinoTab() {
        casinoTab.click();
        return this;
    }

    public MainPage getTitleInCasinoFromPage(String text) {
        mainTitleInCasinoPage.shouldHave(Condition.text(text));
        return this;
    }

}
