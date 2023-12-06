package checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class AddProduct {
    WebDriver driver;
    public  AddProduct(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(className = "card-title")
    WebElement product;
    public void addProduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        product.click();
        driver.findElement(By.id("btn-add-to-cart")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.xpath("//a[@data-test=\"nav-cart\" and @routerlink=\"/checkout\" and @class=\"nav-link\"]\n")).click();
    }
}
