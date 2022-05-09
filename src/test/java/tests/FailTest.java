package tests;

import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchResultPage;

@Feature("Failed test")
public class FailTest{
    Logger log = Logger.getLogger("UISearchTest");

    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @Test(priority = 5, description = "its test with planned test fail")
    @Description("planned test fail")
    public void crashTest()
    {

        Assert.fail("Test crashed");
    }
}
