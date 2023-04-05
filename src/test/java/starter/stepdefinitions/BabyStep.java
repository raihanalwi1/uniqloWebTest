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

    @When("I will go to {string}")
    public void iWillGoTo(String page) {
        if (page.equals("babyPage")){
            bp.HeaderTextHalamanDisplay();
        }else if(page.equals("pakaianNewborn1")){
            bp.ClickMenuPakaianNewborn1();
        }else if (page.equals("aksesoris1")){
            bp.ClickAksesorisMenu1();
        }else if (page.equals("koleksiNewborn")){
            bp.ClickKoleksiNewbornMenu();
        }else if (page.equals("luaran1")){
            bp.ClickLuaranMenu1();
        }else if (page.equals("onePiece")){
            bp.ClickOnePieceMenu();
        }else if (page.equals("atasan1")){
            bp.ClickAtasanMenu1();
        }else if (page.equals("bajuTerusan")){
            bp.ClickBajuTerusanMenu();
        }else if (page.equals("legging")){
            bp.ClickLeggingMenu();
        }else if (page.equals("UT1")){
            bp.ClickUTMenu1();
        }else if (page.equals("gaun1")){
            bp.ClickGaunMenu1();
        }else if (page.equals("Airism1")){
            bp.ClickAirismMenu1();
        }else if (page.equals("kaosKaki1")){
            bp.ClickKaosKakiMenu1();
        }else if (page.equals("aksesoris2")){
            bp.ClickAksesorisMenu2();
        }
    }

    @And("I {string} page")
    public void iPage(String validate) {
        if (validate.equals("bayi")){
            bp.HeaderTextHalamanDisplay();
        }else if (validate.equals("txtPN1")){
            bp.ValidateTxtPakaianNewborn();
        }
    }

}
