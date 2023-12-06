package manager;

import calc.CalcPage;
import checkout.AddProduct;
import checkout.CheckOut;
import org.example.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    BadMailLogin badMailLogin;
    BadPasswordLogin badPasswordLogin;
    EmptyMail emptyMail;
    ForgotPassword forgotPassword;
    ForgotPasswordWithBadMail forgotPasswordWithBadMail;
    ForgotPasswordWithNoEmailFormat forgotPasswordWithNoEmailFormat;
    LoginPage loginPage;
    NoMailLogin noMailLogin;
    AddProduct addProduct;
    CheckOut checkOut;
    CalcPage calcPage;
    WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }
    public BadMailLogin badMailLogin() {
        return (badMailLogin == null) ? badMailLogin = new BadMailLogin(driver) : badMailLogin;
    }
}
