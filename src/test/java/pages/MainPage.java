package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import helper.Checks;
import helper.Search;

import static com.codeborne.selenide.Selenide.$;


public class MainPage implements Checks, Search {

    SelenideElement logo = $(By.className("nav-element__logo")).as("logo");
    SelenideElement searchBox = $(By.className("search-catalog__input")).as("search box");
    SelenideElement navigationMenu = $(By.className("nav-element__burger-line")).as("navigation menu");

    public SelenideElement getLogo() {
        return logo;
    }

    public SelenideElement getSearchBox() {
        return searchBox;
    }

    public SelenideElement getNavigationMenu() {
        return navigationMenu;
    }
}
