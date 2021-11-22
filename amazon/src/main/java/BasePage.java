
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

WebDriver driver;

 public BasePage(WebDriver driver){
     this.driver=driver;
    }
    public WebElement find(By Locator){
     return  driver.findElement(Locator);
    }

    public List<WebElement> findAllElements(By Locator){
     return driver.findElements(Locator);
    }

    public void click(By Locator){
     find(Locator).click();
    }
    public void sendKeys(By Locator,String ifade){
        find(Locator).sendKeys(ifade);
    }
    public boolean isDisplayed(By Locator){
       return find(Locator).isDisplayed();
    }

    public void click(WebElement element){
        click(element);
    }

    public void clickElement(WebElement element){
     element.click();
    }

}
