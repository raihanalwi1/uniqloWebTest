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


    @When("I will go to pakaian newboarn bayi")
    public void iWillGoToPakaianNewboarnBayi() {
        bp.ClickMenuPakaianNewboarn1();
    }

    @When("I will go to aksesoris bayi satu")
    public void iWillGoToAksesorisBayiSatu() {
        bp.ClickAksesorisMenu1();
    }

    @When("I will go to koleksi newborn")
    public void iWillGoToKoleksiNewborn() {
        bp.ClickKoleksiNewbornMenu();
    }

    @When("I will go to luaran {int}")
    public void iWillGoToLuaran(int arg0) {
        bp.ClickLuaranMenu1();
    }

    @When("I will go to one piece")
    public void iWillGoToOnePiece() {
        bp.ClickOnePieceMenu();
    }

    @When("I will go to atasan {int}")
    public void iWillGoToAtasan(int arg0) {
        bp.ClickAtasanMenu1();
    }

    @When("I will go to baju terusan")
    public void iWillGoToBajuTerusan() {
        bp.ClickBajuTerusanMenu();
    }

    @When("I will go to legging")
    public void iWillGoToLegging() {
        bp.ClickLeggingMenu();
    }

    @When("I will go to ut {int}")
    public void iWillGoToUt(int arg0) {
        bp.ClickUTMenu1();
    }

    @When("I will go to gaun {int}")
    public void iWillGoToGaun(int arg0) {
        bp.ClickGaunMenu1();
    }

    @When("I will go to airism {int}")
    public void iWillGoToAirism(int arg0) {
        bp.ClickAirsmMenu1();
    }

    @When("I will go to kaos kaki {int}")
    public void iWillGoToKaosKaki(int arg0) {
        bp.ClickKaosKakiMenu1();
    }

    @When("I will go to aksesoris bayi dua")
    public void iWillGoToAksesorisBayiDua() {
        bp.ClickAksesorisMenu2();
    }
}
