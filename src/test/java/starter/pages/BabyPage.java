package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BabyPage extends PageObject {
    public void openUniqlo(){
        openAt("/");
    }
    //fungsi selector

    private By headerTextHalaman(){
        return By.xpath("//span[text()[contains(.,'BABY')]]");
    }
    private By txtPakaianNewborn(){
        return By.xpath("(//span[text()[contains(.,'Pakaian Newborn')]])[2]");
    }
    private By txtAksesoris1(){
        return By.xpath("(//span[text()[contains(.,'Aksesoris')]])[7]");
    }
    private By txtKoleksiNewborn(){
        return By.xpath("(//span[text()[contains(.,'Koleksi Newborn')]])[2]");
    }
    private By txtLuaran1(){
        return By.xpath("(//span[text()[contains(.,'Luaran')]])[6]");
    }
    private By txtOnepiece(){
        return By.xpath("(//span[text()[contains(.,'One Piece')]])[2]");
    }
    private By txtAtasan1(){
        return By.xpath("(//span[text()[contains(.,'Atasan')]])[7]");
    }
    private By txtBajuTerusan(){
        return By.xpath("(//span[text()[contains(.,'Baju Terusan')]])[2]");
    }
    private By txtLegging(){
        return By.xpath("(//span[text()[contains(.,'Legging')]])[6]");
    }
    private By txtUT1(){
        return By.xpath("(//span[text()[contains(.,'UT(Graphic T-Shirt)')]])[6]");
    }
    private By txtGaun1(){
        return By.xpath("(//span[text()[contains(.,'Gaun')]])[5]");
    }
    private By txtAirism1(){
        return By.xpath("(//span[text()[contains(.,'AIRism')]])[6]");
    }
    private By txtKaosKaki1(){
        return By.xpath("(//span[text()[contains(.,'Kaos Kaki')]])[6]");
    }
    private By txtAksesoris2(){
        return By.xpath("(//span[text()[contains(.,'Aksesoris')]])[7]");
    }

    private By headerBaby(){
        return By.xpath("//span[text()[contains(.,'BAYI')]]");
    }

    private By pakaianNewbornMenu1(){
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
    private By koleksiBalitaMenu(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Koleksi Balita')]])");
    }
    private By atasanMenu2(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Atasan')]])[2]");
    }
    private By luaranMenu2(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Luaran')]])[2]");
    }
    private By bawahanMenu(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Bawahan')]])[1]");
    }
    private By piyamaMenu(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Piyama')]])[1]");
    }
    private By gaunMenu2(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Gaun')]])[2]");
    }
    private By utMenu2(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'UT(Graphic T-Shirt)')]])[2]");
    }
    private By heattechMenu(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'HEATTECH')]])[1]");
    }
    private By dalamanAtasMenu(){
       return By.xpath("(//span[@class='inner'][text()[contains(.,'Dalaman Atas')]])[1]");
    }
    private By airismMenu2(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'AIRism')]])[2]");
    }
    private By kaosKakiMenu2(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Kaos Kaki')]])[2]");
    }
    private By aksesorisMenu3(){
        return By.xpath("(//span[@class='inner'][text()[contains(.,'Aksesoris')]])[3]");
    }
    //fungsi public
    public void ClickHeaderMenuBaby(){
        $(headerBaby()).click();
    }
    public void HeaderTextHalamanDisplay(){
        $(headerTextHalaman()).isDisplayed();
    }
    public void ClickMenuPakaianNewborn1(){
        $(pakaianNewbornMenu1()).click();
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
    public void ClickAirismMenu1(){
        $(airismMenu1()).click();
    }
    public void ClickKaosKakiMenu1(){
        $(kaosKakiMenu1()).click();
    }
    public void ClickAksesorisMenu2(){
        $(aksesorisMenu2()).click();
    }
    public void ClickKoleksiBalitaMenu(){
        $(koleksiBalitaMenu()).click();
    }
    public void ClickAtasanMenu2(){
        $(atasanMenu2()).click();
    }
    public void ClickLuaranMenu2(){
        $(luaranMenu2()).click();
    }
    public void ClickBawahanMenu(){
        $(bawahanMenu()).click();
    }
    public void ClickPiyamaMenu(){
        $(piyamaMenu()).click();
    }
    public void ClickGaunMenu2(){
        $(gaunMenu2()).click();
    }
    public void ClickUTMenu2(){
        $(utMenu2()).click();
    }
    public void ClickHeattechMenu(){
        $(heattechMenu()).click();
    }
    public void ClickDalamanAtasMenu(){
        $(dalamanAtasMenu()).click();
    }
    public void ClickAirismMenu2(){
        $(airismMenu2()).click();
    }
    public void ClickKaosKakiMenu2(){
        $(kaosKakiMenu2()).click();
    }
    public void ClickAksesorisMenu3(){
        $(aksesorisMenu3()).click();
    }
    //validate
    public void ValidateTxtPakaianNewborn(){
        $(txtPakaianNewborn()).isDisplayed();
    }
}
