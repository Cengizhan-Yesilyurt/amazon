import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.naming.directory.DirContext;

public class HomePage extends BasePage  {
    By countUp= By.id("nav-cart-count");
    String countDeger= find(countUp).getText();
    By cookies=By.id("sp-cc-accept");
    SearchBox searchBox;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean IsProductCountUp() {
        return getCartCount()>0;

    }
   By goToCart=By.id("nav-cart-count-container");
    public void goToCart() {
        click(goToCart);
    }
    private int getCartCount(){

       return Integer.parseInt(countDeger);
    }

    public void acceptCookies(){
        if (isDisplayed(cookies))
            click(cookies);
    }
}
