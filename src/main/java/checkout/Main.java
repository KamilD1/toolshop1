package checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kamil\\Desktop\\sda Tester\\java\\toolshop1\\Chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://practicesoftwaretesting.com/#/");
        driver.manage().window().maximize();

        AddProduct addProduct = PageFactory.initElements(driver, AddProduct.class);
        CheckOut checkOut= PageFactory.initElements(driver, CheckOut.class);


        addProduct.addProduct();
        checkOut.checkOut("customer@practicesoftwaretesting.com", "welcome01");


    }

}
