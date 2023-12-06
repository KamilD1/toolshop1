package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BadMailLogin{
    WebDriver driver;
    public BadMailLogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver ,this);
    }

    @FindBy(linkText = "Sign in")
    WebElement buttonList;

    public void badLoginUser(String user, String password){
        buttonList.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("password")).clear();


        driver.findElement(By.id("email")).sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.id("password")).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.className("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        String text = driver.findElement(By.xpath("//div[@data-test='login-error']")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        System.out.println(text);

    }
}
