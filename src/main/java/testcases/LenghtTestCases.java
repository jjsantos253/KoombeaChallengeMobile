package testcases;
import config.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobject.AndroidCommonObjects;
import pageobject.AndroidLenghtScreen;
import java.net.MalformedURLException;

public class LenghtTestCases extends Utils{

    @Given("^That I launched the app$")
    public void LaunchDriver() throws MalformedURLException{
        Utils.InitDriver();
    }

   @Then("^The title is displayed$")
   public void ValidateLenghtScreen(){
        AndroidCommonObjects androidCommonObjects = new AndroidCommonObjects(driver);
        ExplicitWait(androidCommonObjects.ScreenTitle);
        androidCommonObjects.VerifyScreenTitle();
        if(androidCommonObjects.VerifyScreenTitle() == true){
            System.out.println("Pass Screen Title");
        }
        else{
            System.out.println("Title is nos displayed");
        }
    }

    @And("^I typed the number 8$")
    public void ValidateTypingNum(){
        AndroidCommonObjects androidCommonObjects = new AndroidCommonObjects(driver);
        androidCommonObjects.ClickBtnEight();
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
    @And("^I taped the conversion type dropdown$")
    public void ValidateShowDropdown(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.ClickDropOne();

    }
    @And("^I select the Inch option$")
    public void ValidateSelectInch(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.SelectInchOption();

    }

    @Then("^The inch value is converted$")
    public void ValidateConvertResult(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);

        if (androidLenghtScreen.VerifyValueConverted() == 20.32){
            System.out.println("Pass converted value");
        }
        else{
            System.out.println(androidLenghtScreen.VerifyValueConverted());
        }

    }

    @And("^I clicked the side menu$")
    public void ShowSideMenu() {
        AndroidCommonObjects androidCommonObjects = new AndroidCommonObjects(driver);
        androidCommonObjects.ClickBtnMenu();
    }

    @And("^I swaped the convertion units$")
    public void SwapUnit() {
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.SwapUnits();
    }
    @Then("^The unit values are swaped$")
    public void ValidateSwapedUnit(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);

        if (androidLenghtScreen.GetTextUnitOne() == "Centimeter") {
            System.out.println("Pass converted value");

            if (androidLenghtScreen.GetTextUnitTwo() == "Foot"){
                System.out.println("Pass converted value");
            }

        }
        else{
            System.out.println("Values were not swaped");
        }

    }

}
