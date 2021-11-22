import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage  {

  By shippingOptions= By.id("p_n_free_shipping_eligible-title");
  By products=By.cssSelector("[class='a-section a-spacing-medium']");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsOnProductPage() {
   return isDisplayed(shippingOptions);
    }

    public void selectProduct(String s) {
     WebElement element=findAllElements(products).get(0);
     clickElement(element);
    }
}
