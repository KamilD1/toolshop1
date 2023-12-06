package checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class CheckOut {
    WebDriver driver;
    public CheckOut(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@data-test=\"proceed-1\" and @type=\"button\"]")
    WebElement checkoutBtn;

    public void checkOut(String mail,String password){
        checkoutBtn.click();

        driver.findElement(By.id("email")).sendKeys(mail);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("btnSubmit")).click();
        driver.findElement(By.xpath("//button[@data-test=\"proceed-2\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.xpath("//input[@id='state']\n")).sendKeys("Mazowsze");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.id("postcode")).sendKeys("12-123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.xpath("//button[@data-test=\"proceed-3\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.xpath("///select[@id='payment-method']\n")).click();
        driver.findElement(By.xpath("//option[@value=\"1: Bank Transfer\"]\n")).click();
        driver.findElement(By.id("account-name")).sendKeys("Jan Nowak");
        driver.findElement(By.id("account-number")).sendKeys("123456789123456789");
        driver.findElement(By.xpath("//button[@data-test=\"finish\" and @type=\"button\" and @class=\"btn btn-success\"]\n")).click();
        String alert = driver.findElement(By.xpath("//div[@class=\"help-block\" and contains(text(), \"Payment was successful\")]\n")).getText();
        System.out.println(alert);
        driver.findElement(By.xpath("//button[@data-test=\"finish\" and @type=\"button\" and @class=\"btn btn-success\"]\n")).click();
        alert = driver.findElement(By.id("order-confirmation")).getText();
        System.out.println(alert);









    }

}
