package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.WaitClass;

public class StaleElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        WebElement googleSearch=  driver.findElement(By.className("gLFyf"));

        driver.navigate().refresh();
        googleSearch=driver.findElement(By.className("gLFyf"));

        WaitClass.elementTobeClickable(googleSearch,driver,15);


        googleSearch.sendKeys("Delhi");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@name='btnK'])")).click();




    }
}
