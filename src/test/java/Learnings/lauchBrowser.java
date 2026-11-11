package Learnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lauchBrowser {
    @Test
    void Testbrowser(){
        System.out.println("Hello lets cook this selenium today...");
       // System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testmuai.com/");
        String titile= driver.getTitle();
        System.out.println("page title is " + titile);
        driver.quit();


    }
}
