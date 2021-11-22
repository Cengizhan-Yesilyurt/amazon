import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestAddProductToCart extends BaseTest {

   HomePage homePage;
   ProductsPage productsPage;
   ProductDetailPage productDetailPage;
   CartPage cartPage;

  @Test
  @Order(1)
    public void searchProduct(){
    homePage=new HomePage(driver);
    homePage.acceptCookies();
    productsPage=new ProductsPage(driver);
      homePage.searchBox().search("Laptop");
    Assertions.assertTrue(productsPage.IsOnProductPage(),"Not on Product Page");
  }

    @Test
    @Order(2)
    public void selectProduct(){
    productDetailPage=new ProductDetailPage(driver);
    productsPage.selectProduct("2");
    Assertions.assertTrue(productDetailPage.IsOnProductDetailPage(),"not on product page");
    }
    @Test
    @Order(3)
    public void addProducttoCart(){
    productDetailPage.addToCart();
    Assertions.assertTrue(homePage.IsProductCountUp(),"product count did not increase");

    }
    @Test
    @Order(4)
    public void goToCart(){
    cartPage=new CartPage(driver);
    homePage.goToCart();
    Assertions.assertTrue(cartPage.checkIfProductAdded(),"product was not added to cart");
    }



}
