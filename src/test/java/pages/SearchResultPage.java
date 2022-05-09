package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import helper.Checks;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage implements Checks {
    ElementsCollection products = $$(By.className("product-card__wrapper")).as("products after search"); //all search results
    SelenideElement productsNotFound = $(By.className("catalog-page__text")); //no product found
    ElementsCollection sortButtons = $$(By.className("sort-item")).as("all sort options"); //all sorts options found
    SelenideElement productPrice = $(By.className("price-block__final-price")).as("product price");//product price

    public ElementsCollection getProducts() {
        return products;
    }

    public SelenideElement getProductsNotFound() {
        return productsNotFound;
    }

    public ElementsCollection getSortButtons() {
        return sortButtons;
    }

    public SelenideElement getProductPrice() {
        return productPrice;
    }
}
