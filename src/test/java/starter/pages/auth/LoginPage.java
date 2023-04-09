package starter.pages.auth;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public void openUniqlo(){
        openAt("/");
    }
    private By buttonHeaderAccount(){
        return By.xpath("//a[@title='Masuk']");
    }
    private By inputAlamatEmail(){
        return By.xpath("//input[@name='login_id']");
    }
    private By inputKataSandi(){
        return By.xpath("//input[@name='password']");
    }
    private By boxShowKataSandi(){
        return By.xpath("//label[@for='fr-checkbox-1']");
    }
    private By buttonMasuk(){
        return By.xpath("//a[@data-test=\"login-button\"]");
    }
    public void ClickButtonHeaderAccount(){
        $(buttonHeaderAccount()).click();
    }
    public void InputAlamatEmail(String email){
        $(inputAlamatEmail()).type(email);
    }
    public void InputKataSandi(String password){
        $(inputKataSandi()).type(password);
    }
    public void ClickBoxShowKataSandi(){
        $(boxShowKataSandi()).click();
    }
    public void ClickButtonMasuk(){
        $(buttonMasuk()).click();
    }


}
