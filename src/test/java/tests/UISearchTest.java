package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchResultPage;

@Feature("Search checks")

public class UISearchTest extends MainTest {
    Logger log = Logger.getLogger("UISearchTest");

    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @Test(priority = 0)
    @Description("Search, search result should be empty")

    public void searchResultEmpty() {
        log.info("run search, result should be empty, page should contain some text");

        mainPage.Search(mainPage.getSearchBox(), yamlPropertiesReader.getSettingsFromYaml().getSearchQueryNoResult(), yamlPropertiesReader.getSettingsFromYaml().getSleepTime());
        searchResultPage.checkConditionOfElement(searchResultPage.getProductsNotFound(), yamlPropertiesReader.getSettingsFromYaml().getWaitTime(), Condition.exactText("По Вашему запросу ничего не найдено."));
    }

    @Test(priority = 1)
    @Description("Search, search result should not be empty")

    public void searchResultNotEmpty() {
        log.info("run search, result should not be empty");

        mainPage.Search(mainPage.getSearchBox(), yamlPropertiesReader.getSettingsFromYaml().getSearchQuery(), yamlPropertiesReader.getSettingsFromYaml().getSleepTime());
        Assert.assertEquals(searchResultPage.getProducts().isEmpty(), false);
    }



}
