package org.example;

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

        driver.get("https://practicesoftwaretesting.com/#/");
        driver.manage().window().maximize();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        BadMailLogin badMailLogin = PageFactory.initElements(driver, BadMailLogin.class);
        BadPasswordLogin badPasswordLogin= PageFactory.initElements(driver, BadPasswordLogin.class);
        NoMailLogin noMailLogin= PageFactory.initElements(driver, NoMailLogin.class);
        EmptyMail emptyMail= PageFactory.initElements(driver, EmptyMail.class);
        ForgotPassword forgotPassword= PageFactory.initElements(driver, ForgotPassword.class);
        ForgotPasswordWithBadMail forgotPasswordWithBadMail= PageFactory.initElements(driver, ForgotPasswordWithBadMail.class);
        ForgotPasswordWithNoEmailFormat forgotPasswordWithNoEmailFormat= PageFactory.initElements(driver, ForgotPasswordWithNoEmailFormat.class);


        //oginPage.loginUser("customer@practicesoftwaretesting.com", "welcome01");
        //badMailLogin.badLoginUser("banmail@practicesoftwaretesting.com", "welcome01");
        //badPasswordLogin.badPasswordUser("customer@practicesoftwaretesting.com", "badpassword");
        //noMailLogin.noMailUser("", "welcome01");
        //emptyMail.emptyMail("welcome01");
        forgotPassword.forgotPassword("customer@practicesoftwaretesting.com");
        forgotPasswordWithBadMail.forgotPasswordWithBadMail("badmail@practicesoftwaretesting.com");
        forgotPasswordWithNoEmailFormat.forgotPasswordWithNoEmailFormat("customer");



    }
}