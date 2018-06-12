package sbautotests.pages;

import io.qameta.allure.Step;
import org.testng.Assert;

public class Footer extends BasePage {
    // локаторы
    private static final String locSocialGrouplinks = "//ul[@class='footer__social']//a[@class='footer__social_link']";

    // шаги
    @Step("Проверяем, что  footer содержит ссылки на социальные группы")
    public Footer checkSocialGroupLinks() {
        scrollDownAtBottomOfPage();
        Assert.assertTrue(getElementsListByXpath(locSocialGrouplinks).size() > 0);
        return this;
    }
}
