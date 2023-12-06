package calc;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;


public class Main {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\kamil\\Desktop\\sda Tester\\java\\toolshop1\\Chromedriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(options);



            CalcPage calcPage = PageFactory.initElements(driver, CalcPage.class);
            BankPage bankPage = PageFactory.initElements(driver, BankPage.class);



            calcPage.openPage();
            calcPage.sendFirstNumber("2");
            calcPage.selectBar("*");
            calcPage.sendSecondNumber("3");
            calcPage.clickButtonGo();


            bankPage.openBankPage();


        }



}
