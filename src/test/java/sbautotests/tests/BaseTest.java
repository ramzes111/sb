package sbautotests.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import sbautotests.Base;
import sbautotests.pages.Footer;
import sbautotests.pages.Header;

public class BaseTest extends Base {
    // инициализация страниц
    protected Header header = new Header();
    protected Footer footer = new Footer();

    @BeforeClass
    protected void beforeClass(){
        setUp();
    }

    @AfterClass
    protected void afterClass(){
        tearDown();
    }
}
