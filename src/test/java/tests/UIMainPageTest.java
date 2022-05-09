package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pages.MainPage;

@Feature("Main page check")
public class UIMainPageTest extends MainTest {
    Logger log = Logger.getLogger("UITest");
    MainPage mainPage = new MainPage();

    @Test (priority = 1)
    @Description("Main Page elements availability test")

    public void checkMainPageElements ()
    {
        log.info("Check main page elements");
 mainPage.checkConditionOfElement(mainPage.getLogo(), yamlPropertiesReader.getSettingsFromYaml().getWaitTime(), Condition.visible);
 mainPage.checkConditionOfElement(mainPage.getSearchBox(),yamlPropertiesReader.getSettingsFromYaml().getWaitTime(),Condition.visible);
 mainPage.checkConditionOfElement(mainPage.getNavigationMenu(), yamlPropertiesReader.getSettingsFromYaml().getWaitTime(),Condition.visible);

    }
}
