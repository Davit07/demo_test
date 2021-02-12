package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RightMenuPage {
    public SelenideElement myAccountIcon = $(".profile > div.title-row-u-m > p > span");
    public SelenideElement changePasswordTitle = $("div.profile > div.open-view-single-u-m > ul > li:nth-child(2) > a > p > span");

    public RightMenuPage openChangeUserPasswordPage() {
        myAccountIcon.click();
        changePasswordTitle.click();
        return this;
    }
}
