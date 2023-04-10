package starter.pages.wishlist;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class WishListProductPage extends PageObject {
    //wishlist
    public void openWishlistPage(){
        openAt("/wishlist");
    }
    private By txtWishlist(){
        return By.xpath("(//span[text()[contains(.,'Wishlist')]])[1]");
    }
    private By beforeWishlistBabyProduct(){
        return By.xpath("(//div[@class=\"favorite large swiper-no-swiping\"])[1]");
    }
    private By afterWishlistBabyProduct(){
        return By.xpath("(//span[@class=\"fr-icon active favorite_large\"])[1]");
    }
    private By badge1(){
        return By.xpath("//i[@class='fr-badge'][text()[contains(.,'1')]]");
    }

    //wishlist
    public void ClickBeforeWishlistBaby()  {
        $(beforeWishlistBabyProduct()).waitUntilClickable();

    }
    public void DisplayAfterWishlistBaby(){
        $(afterWishlistBabyProduct()).isDisplayed();
    }
}
