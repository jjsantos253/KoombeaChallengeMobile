package testcases;
import config.Utils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.AndroidLenghtScreen;
import java.net.MalformedURLException;

public class LenghtTestCases extends Utils{

    @BeforeClass
    public void LaunchDriver() throws MalformedURLException{
        Utils.InitDriver();
    }


    @Test(priority = 1)
    public void ValidateLenghtScreen(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        ExplicitWait(androidLenghtScreen.LenghtScreenTitle);
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
    public void ExitDriver() throws MalformedURLException {
        Utils.CloseDriver();
    }



}
