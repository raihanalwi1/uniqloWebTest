package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.menu.BabyPage;
import starter.pages.wishlist.WishListProductPage;

public class WishlistProductStep {
    @Steps
    BabyPage bp;

    @Steps
    WishListProductPage wpp;


    @Given("I am on the baby page")
    public void iAmOnTheBabyPage() {
        bp.openBaby();
    }

    @Then("I click button wishlist product")
    public void iClickButtonWishlistProduct() {
        wpp.ClickBeforeWishlistBaby();
    }

    @When("I validate button active")
    public void iValidateButtonActive() {
        wpp.DisplayAfterWishlistBaby();
    }

    @And("The product send to wishlist page")
    public void theProductSendToWishlistPage() {

    }
}
