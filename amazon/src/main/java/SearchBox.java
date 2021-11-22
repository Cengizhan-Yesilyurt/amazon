import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox  extends BasePage{

   By searchBox= By.id("twotabsearchtextbox");
   By btnSearch=By.id("nav-search-submit-button");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        sendKeys(searchBox,text);
        click(btnSearch);
    }
}
