package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitUtil {
    public static void waitTillVisible(WebDriver driver, WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void fluentWait(WebDriver driver,WebElement element1){
        Wait wait4= new FluentWait(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(5,TimeUnit.SECONDS)
                .ignoring(Exception.class);
        wait4.until(ExpectedConditions.visibilityOf(element1));
    }
}
