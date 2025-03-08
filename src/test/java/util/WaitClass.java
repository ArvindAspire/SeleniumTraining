package util;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class WaitClass {

    public static void elementTobeClickable(By ele, WebDriver driver,int time){
        FluentWait fluentWait= new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(time));
        fluentWait.pollingEvery(Duration.ofSeconds(1));
        fluentWait.ignoring(NoSuchElementException .class);
        fluentWait.ignoring(StaleElementReferenceException .class);
        fluentWait.until(ExpectedConditions.elementToBeClickable(ele));

    }

    public static void elementTobeClickable(WebElement ele, WebDriver driver, int time){
        FluentWait fluentWait= new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(time));
        fluentWait.pollingEvery(Duration.ofSeconds(1));
        fluentWait.ignoring(NoSuchElementException .class);
        fluentWait.ignoring(StaleElementReferenceException .class);
        fluentWait.until(ExpectedConditions.elementToBeClickable(ele));

    }

    public static void presenceOfElement(By ele, WebDriver driver,int time){
        FluentWait fluentWait= new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(time));
        fluentWait.pollingEvery(Duration.ofSeconds(1));
        fluentWait.ignoring(NoSuchElementException .class);
        fluentWait.ignoring(StaleElementReferenceException .class);
        fluentWait.until(ExpectedConditions.presenceOfElementLocated(ele));

    }

}
