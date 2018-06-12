package sbautotests.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Header extends BasePage {

    // локаторы
    private static final String locRegionLink = "//div[@class='kit-row']//div[@class='hd-ft-region__title']/span";
    private static final String locSearchRegion = "//input[@type='search' and @class='kit-input__control']";
    private static final String locSearchResultItem =  "//div/a[contains(@class, 'hd-ft-region__city')]";

    // элементы
    @FindBy(xpath = locRegionLink)
    private WebElement elRegionLink;

    @FindBy(xpath = locSearchRegion)
    private WebElement elSearchRegion;

    @FindBy(xpath = locSearchResultItem)
    private WebElement elSearchResultItem;

    // шаги
    @Step("Нажимаем на ссылку выбора региона")
    public Header clickSelectRegionLink() {
        elRegionLink.click();
        return this;
    }

    @Step("Вводим название необходимого региона")
    public Header enterRegionName(String regionName) {
        elSearchRegion.sendKeys(regionName);
        return this;
    }

    @Step("Выбираем регион из результатов поиска")
    public Header selectSearchResultItem(){
        elSearchResultItem.click();
        return this;
    }

    @Step("Проверяем, что регион изменился")
    public Header checkRegionName(String regionName){
        Assert.assertEquals(elRegionLink.getText(), regionName, "Название региона не соответствует "+regionName);
        return this;
    }



}
