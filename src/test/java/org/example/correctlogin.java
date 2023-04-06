package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class correctlogin {
    @Test
    public void Test() {
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hackerrank.com/auth/login");
        driver.findElement(By.id("input-1")).sendKeys("2000031530@kluniversity.in");
        driver.findElement(By.name("password")).sendKeys("27042003@Svs");
        //driver.findElement(By.className("ui-text")).click();
        //driver.findElement(By.linkText("Log In")).click();
        driver.findElement(By.cssSelector("button[type='button'] span[class='ui-text']")).click();
    }
}
