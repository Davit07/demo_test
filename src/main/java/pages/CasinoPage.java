package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CasinoPage {
    public SelenideElement mainTitleInCasinoPage = $("div > a.active");

    public CasinoPage getTitleFromCasinoPage(String text) {
        mainTitleInCasinoPage.shouldHave(Condition.text(text));
        return this;
    }


}
