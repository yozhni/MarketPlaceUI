package helper;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public interface Search {
@Step("Search step: put query {1} into {0} with waiting time {2}")
    public default void Search(SelenideElement searchBox, String searchQuery, int sleepTime) {
        searchBox.clear();
        searchBox.click();
        searchBox.sendKeys(searchQuery);
        searchBox.pressEnter();

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
