package helper;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;

import java.time.Duration;

public interface Checks {
    @Step("Check step:  check that element {0} is {2}  with waiting time {1}")
    public default void checkConditionOfElement(SelenideElement selenideElement, int waitTme, Condition condition)
    {
        selenideElement.shouldBe(condition, Duration.ofMillis(waitTme));
    }

}
