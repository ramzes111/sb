package sbautotests.tests.person;

import org.testng.annotations.Test;
import sbautotests.tests.BaseTest;

public class p001ChangeRegion extends BaseTest {

    @Test
    public void changeRegionTest() {
        // смена региона
        String regionName = "Нижегородская область";
        header
                .clickSelectRegionLink()
                .enterRegionName(regionName)
                .selectSearchResultItem()
                .checkRegionName(regionName);

        // проверка наличия ссылок на социальные группы
        footer
                .checkSocialGroupLinks();
    }
}
