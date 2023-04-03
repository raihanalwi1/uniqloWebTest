package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BabyPage;

public class BabyStep {


    @Steps
    BabyPage bp;

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        bp.openUniqlo();
    }

    @Then("I click baby on the header")
    public void iClickBabyOnTheHeader() {
        bp.ClickHeaderMenuBaby();
        
    }


    @When("I will go to baby page")
    public void iWillGoToBabyPage() {
        bp.HeaderTextHalamanDisplay();
    }


}
