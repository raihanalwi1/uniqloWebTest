package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.pages.auth.LoginPage;

public class AuthStep {
    @Steps
    LoginPage lp;

    @Then("I click account on the header")
    public void iClickAccountOnTheHeader() {
        lp.ClickButtonHeaderAccount();
    }

    @And("I input email")
    public void iInputEmail() {
        lp.InputAlamatEmail("test@gmail.com");
    }

    @And("I input password")
    public void iInputPassword() {
        lp.InputKataSandi("test");
    }

    @And("I click button masuk")
    public void iClickButtonMasuk() {
        lp.ClickButtonMasuk();
    }

    @When("I will go to home page")
    public void iWillGoToHomePage() {
        lp.openUniqlo();
    }
}
