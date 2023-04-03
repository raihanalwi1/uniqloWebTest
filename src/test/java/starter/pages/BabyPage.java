package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BabyPage extends PageObject {
    public void openUniqlo(){
        openAt("/");
    }
    //fungsi selector

    private By headerBaby(){
        return By.xpath("//span[text()[contains(.,'BAYI')]]");
    }
    private By headerTextHalaman(){
        return By.xpath("//span[text()[contains(.,'BABY')]]");
    }
    private By pakaianNewboarnMenu1(){
        return By.xpath("//span[@class='inner'][text()[contains(.,'Pakaian Newborn')]]");
    }
    private By aksesorisMenu1(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Aksesoris')]])[1]");
    }
    private By koleksiNewbornMenu(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Koleksi Newborn')]])");
    }
    private By luaranMenu1(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Luaran')]])[1]");
    }
    private By onePieceMenu(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'One Piece')]])");
    }
    private By atasanMenu1(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Atasan')]])[1]");
    }
    private By bajuTerusanMenu(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Baju Terusan')]])");
    }
    private By leggingMenu(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Legging')]])[1]");
    }
    private By utMenu1(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'UT(Graphic T-Shirt)')]])[1]");
    }
    private By gaunMenu1(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Gaun')]])[1]");
    }
    private By airismMenu1(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'AIRism')]])[1]");
    }
    private By kaosKakiMenu1(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Kaos Kaki')]])[1]");
    }
    private By aksesorisMenu2(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Aksesoris')]])[2]");
    }
    //fungsi public
    public void ClickHeaderMenuBaby(){
        $(headerBaby()).click();
    }
    public void HeaderTextHalamanDisplay(){
        $(headerTextHalaman()).isDisplayed();
    }
    public void ClickMenuPakaianNewboarn1(){
        $(pakaianNewboarnMenu1()).click();
    }
    public void ClickAksesorisMenu1(){
        $(aksesorisMenu1()).click();
    }
    public void ClickKoleksiNewbornMenu(){
        $(koleksiNewbornMenu()).click();
    }
    public void ClickLuaranMenu1(){
        $(luaranMenu1()).click();
    }
    public void ClickOnePieceMenu(){
        $(onePieceMenu()).click();
    }
    public void ClickAtasanMenu1(){
        $(atasanMenu1()).click();
    }
    public void ClickBajuTerusanMenu(){
        $(bajuTerusanMenu()).click();
    }
    public void ClickLeggingMenu(){
        $(leggingMenu()).click();
    }
    public void ClickUTMenu1(){
        $(utMenu1()).click();
    }
    public void ClickGaunMenu1(){
        $(gaunMenu1()).click();
    }
    public void ClickAirsmMenu1(){
        $(airismMenu1()).click();
    }
    public void ClickKaosKakiMenu1(){
        $(kaosKakiMenu1()).click();
    }
    public void ClickAksesorisMenu2(){
        $(aksesorisMenu2()).click();
    }
}
