package sbautotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import sbautotests.Base;

import java.util.List;

public class BasePage extends Base {

    // инициализация элементов страницы
    protected BasePage(){
        PageFactory.initElements(getWebDriver(), this);
    }

    // получение списка элементов
    protected List<WebElement> getElementsListByXpath(String xpathLocator){
        return getWebDriver().findElements(By.xpath(xpathLocator));
    }

    // прокрутка страницы вниз (до конца)
    protected void scrollDownAtBottomOfPage(){
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
