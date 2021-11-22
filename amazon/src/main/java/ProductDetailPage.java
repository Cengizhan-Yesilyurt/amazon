import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage  {
    By btnAddToCart= By.id("add-to-cart-button");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsOnProductDetailPage() {
        return isDisplayed(btnAddToCart);
    }

    public void addToCart() {
        click(btnAddToCart);
    }
}
