package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class ForgotPasswordWithNoEmailFormat {
    WebDriver driver;
    public ForgotPasswordWithNoEmailFormat(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(linkText = "Sign in")
    WebElement buttonList;
    public void forgotPasswordWithNoEmailFormat(String email){
        buttonList.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.className("ForgetPwd")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.id("email")).sendKeys(email);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.className("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        String alert = driver.findElement(By.xpath("//div[@data-test=\"email-error\" and @class=\"alert alert-danger\"]/div\n")).getText();

        System.out.println(alert);
    }
}

