package testcases;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
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
       // Setup setup = new Setup();
        //setup.InitDriver();
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app","C:\\Users\\jjsan\\Downloads\\PreciseUnitConversion.apk");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

    }

    @Test
    public void ValidateLenghtScreen(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.VerifyLenghtScreenTitle();
        if(androidLenghtScreen.VerifyLenghtScreenTitle() == "Length"){
            System.out.println("pass");
        }
        else{
            System.out.println("Validation failed");
        }
    }

    @Test
    public void ValidateTypingNum(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.ClickBtnEight();
        if (androidLenghtScreen.VerifyValueToConverted()==8){
            System.out.println("pass");
        }
        else{
            System.out.println("Validation failed");
        }
    }

    @AfterTest
    public void ExitDriver(){
        driver.quit();
    }



}
