package testcases;
import config.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.AndroidLenghtScreen;
import java.net.MalformedURLException;

public class LenghtTestCases extends Utils{

    @Given("^That I launched the app$")
    public void LaunchDriver() throws MalformedURLException{
        Utils.InitDriver();
    }

   @Then("^The Lenght title is displayed$")
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

    @And("^Type the number 8$")
    public void ValidateTypingNum(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.ClickBtnEight();
    }
    @Then("^The number 8 is typed$")
    public void ValidateNumTyped(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        if (androidLenghtScreen.VerifyValueToConvert() == 8){
            System.out.println("Pass Typing 8");
        }
        else{
            System.out.println("Validation failed on Typing 8");
        }
    }
    @And("^Conversion dropdown is typed$")
    public void ValidateShowDropdown(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.ClickDropOne();

    }
    @And("^Select the Inch option$")
    public void ValidateSelectInch(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.SelectInchOption();

    }

    @Then("^The inch value was converted$")
    public void ValidateConvertResult(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);

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
