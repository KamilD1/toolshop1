package calc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CalcPage {
    WebDriver driver;
    public CalcPage(WebDriver driver){
        this.driver = driver;

    }
    @FindBy(xpath = "//input[@ng-model='first']")
    WebElement inputFirstNumber;
    @FindBy(xpath= "//select")
    WebElement selectElement;
    @FindBy(xpath = "//input[@ng-model='second']")
    WebElement inputSecondNumber;
    @FindBy(xpath = "//button[@ng-click='doAddition()']")
    WebElement buttonGo;

    public void openPage(){
        driver.get("https://www.way2automation.com/angularjs-protractor/calc/");
        driver.manage().window().maximize();
    }

    public void sendFirstNumber(String number){
        inputFirstNumber.sendKeys(number);
    }

    public void selectBar(String operation){
        selectElement.click();
        Select select = new Select(selectElement);
        select.selectByVisibleText(operation);
    }
    public void sendSecondNumber(String number){
        inputSecondNumber.sendKeys(number);
    }
    public void clickButtonGo(){
        buttonGo.click();
    }
    public void closePage(){
        driver.close();
    }
}
