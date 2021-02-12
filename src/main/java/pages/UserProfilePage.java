package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UserProfilePage {
    public final String userEmail = "davit.vardanyan@betconstruct.com";
    public final String userPassword = "Test12345";

    public SelenideElement newPasswordField = $(".password1");
    public SelenideElement newPasswordField2 = $(".password2");
    public SelenideElement oldPasswordField = $("input[name=oldpassword]");
    public SelenideElement changePasswordButton = $(".button-view-normal-m");
    public SelenideElement successMessage = $(".success");

    public UserProfilePage fillChangeUserPasswordFields() {
        newPasswordField.sendKeys(userPassword);
        newPasswordField2.sendKeys(userPassword);
        oldPasswordField.sendKeys(userPassword);
        return this;
    }
    public UserProfilePage clickOnChangePasswordButton(){
        changePasswordButton.click();
        return this;
    }

    public UserProfilePage getSuccessMessage(String text) {
        successMessage.shouldHave(Condition.text(text));
        return this;
    }

}
