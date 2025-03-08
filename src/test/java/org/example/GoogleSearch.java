package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.WaitClass;

import java.time.Duration;
import java.util.NoSuchElementException;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\arvin\\IdeaProjects\\SeleniumTraining\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
        //explicit
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
    //wait.until(ExpectedConditions.)
        //FluentWait


        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WaitClass.presenceOfElement(By.xpath("(//input[@name='btnK'])"),driver,10);
        driver.findElement(By.className("gLFyf")).sendKeys("Delhi");
       // fluentWait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("(//input[@name='btnK'])[last()]"))));
        WaitClass.elementTobeClickable(By.xpath("(//input[@name='btnK'])"),driver,5);
        driver.findElement(By.xpath("(//input[@name='btnK'])")).click();
        String brandName=driver.findElement(By.xpath("//span[text()='Brands']/parent::div/following-sibling::ul/preceding-sibling::div/parent::div/ul/li/span/a/span")).getText();

        //driver.quit();


    }

}
