package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;

    }

    @FindBy(linkText = "Sign in")
    WebElement buttonList;

    public void loginUser(String user, String password){
        buttonList.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.id("email")).sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.id("password")).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.className("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.id("user-menu")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.linkText("Sign out")).click();


    }
}
