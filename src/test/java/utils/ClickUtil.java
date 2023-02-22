package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickUtil {
    public static void click(WebDriver driver, WebElement element){
        WaitUtil.waitTillVisible(driver,element);
        element.click();
    }
}
