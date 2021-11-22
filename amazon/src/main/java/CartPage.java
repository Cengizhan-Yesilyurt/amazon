import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    By link= By.cssSelector("[class='a-unordered-list a-nostyle a-vertical a-spacing-base']");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size()+1 > 0;
    }
    private List<WebElement> getProducts(){
        List<WebElement> webElements=findAllElements(link);
        return webElements;
    }
}
