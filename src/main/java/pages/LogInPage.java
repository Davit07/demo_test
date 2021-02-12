package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LogInPage {
    public final String userEmail = "davit.vardanyan@betconstruct.com";
    public final String userPassword = "Test12345";

    public SelenideElement emailField = $("#login-name");
    public SelenideElement passwordField = $("#password");
    public SelenideElement logInButton = $(".button-view-normal-m:not(.trans-m)");

    public LogInPage typeInEmailField(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public LogInPage typeInPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LogInPage clickOnLoginButton() {
        logInButton.shouldBe(Condition.enabled);
        logInButton.click();
        return this;
    }

    public LogInPage logIn() {
        typeInEmailField(userEmail);
        typeInPasswordField(userPassword);
        clickOnLoginButton();
        return this;
    }

}
