package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Utils {
    public static AppiumDriver<WebElement> driver;

    public static void InitDriver() throws MalformedURLException {
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app","C:\\Users\\jjsan\\Downloads\\KoombeaAutov2\\src\\main\\resources\\PreciseUnitConversion.apk");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    public static void CloseDriver(){
        driver.quit();
    }

    public static void ExplicitWait(WebElement element){
        (new WebDriverWait(driver,10)).until(ExpectedConditions
                .elementToBeClickable(element));
    }


}
