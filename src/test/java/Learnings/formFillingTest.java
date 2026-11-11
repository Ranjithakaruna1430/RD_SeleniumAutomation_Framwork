package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class formFillingTest {
    @Test
    void formfill() {
        //https://www.testmuai.com/selenium-playground/simple-form-demo/

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testmuai.com/selenium-playground/simple-form-demo/");
        driver.manage().window().maximize();
String pageTitile=driver.getTitle();
        System.out.println("This page title is "+pageTitile);
        WebElement message =driver.findElement(By.xpath("//input[@id='user-message']"));
        message.sendKeys("hello first test");

driver.findElement(By.xpath("//button[@id='showInput']")).click();
driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
        driver.findElement(By.xpath("//button[normalize-space()='Get Sum']")).click();
       String Sum= driver.findElement(By.id("addmessage")).getText();
       driver.close();
        System.out.println("Sum  is " + Sum) ;
        Assert.assertEquals(Sum,"30");
    }
}