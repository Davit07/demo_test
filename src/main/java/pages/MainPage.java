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
    public SelenideElement userName = $(".home-wrapper-login");
    public SelenideElement selectLanguage = $("div:nth-child(5) .select-contain-m > select");
    public SelenideElement myAccountIcon = $(".profile > div.title-row-u-m > p > span");
    public SelenideElement changePasswordTitle = $("div.profile > div.open-view-single-u-m > ul > li:nth-child(2) > a > p > span");
    public SelenideElement newPasswordField = $(".password1");
    public SelenideElement newPasswordField2 = $(".password2");
    public SelenideElement oldPasswordField = $("input[name=oldpassword]");
    public SelenideElement changePasswordButton = $(".button-view-normal-m");
    public SelenideElement successMessage = $(".success");
    public SelenideElement leftMenuIcon = $(".left-top-nav");
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
        logInButton.shouldBe(Condition.enabled);
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

    public MainPage openChangeUserPasswordPage() {
        // sleep(5000);
        userName.click();
        myAccountIcon.click();
        changePasswordTitle.click();
        return this;
    }

    public MainPage fillChangeUserPasswordFields() {
        newPasswordField.sendKeys(userPassword);
        newPasswordField2.sendKeys(userPassword);
        oldPasswordField.sendKeys(userPassword);
        return this;
    }

    public MainPage clickOnChangePasswordButton(){
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


    public MainPage getTitleInCasinoFromPage(String text) {
        mainTitleInCasinoPage.shouldHave(Condition.text(text));
        return this;
    }

}
