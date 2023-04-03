package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BabyPage extends PageObject {
    public void openUniqlo(){
        openAt("/");
    }
//    public void openBabyMenu(){
//        openAt("/baby");
//    }
    private By headerBaby(){
        return By.xpath("//span[text()[contains(.,'BAYI')]]");
    }
    private By headerTextHalaman(){
        return By.xpath("//span[text()[contains(.,'BABY')]]");
    }
    public void ClickHeaderMenuBaby(){
        $(headerBaby()).click();
    }
    public void HeaderTextHalamanDisplay(){
        $(headerTextHalaman()).isDisplayed();
    }
}
