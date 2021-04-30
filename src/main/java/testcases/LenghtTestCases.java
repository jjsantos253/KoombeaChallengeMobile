package testcases;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.AndroidLenghtScreen;
import java.net.MalformedURLException;
import java.net.URL;

public class LenghtTestCases{
    AppiumDriver<WebElement> driver;


    @BeforeClass
    public void LaunchDriver() throws MalformedURLException{
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app","[Add local Path to the project]\\KoombeaAutov2\\src\\main\\resources\\PreciseUnitConversion.apk");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }


    @Test(priority = 1)
    public void ValidateLenghtScreen(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.VerifyLenghtScreenTitle();
        if(androidLenghtScreen.VerifyLenghtScreenTitle() == true){
            System.out.println("Pass Screen Title");
        }
        else{
            System.out.println("Title is nos displayed");
        }
    }

    @Test(priority = 2)
    public void ValidateTypingNum(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.ClickBtnEight();
        if (androidLenghtScreen.VerifyValueToConvert() == 8){
            System.out.println("Pass Typing 8");
        }
        else{
            System.out.println("Validation failed on Typing 8");
        }
    }

    @Test(priority = 3)
    public void ValidateConvertResult(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.ClickDropOne();
        androidLenghtScreen.SelectInchOption();

        if (androidLenghtScreen.VerifyValueConverted() == 20.32){
            System.out.println("Pass converted value");
        }
        else{
            System.out.println(androidLenghtScreen.VerifyValueConverted());
        }

    }

    @AfterTest
    public void ExitDriver(){
        driver.quit();
    }



}
