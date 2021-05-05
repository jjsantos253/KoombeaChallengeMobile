package testcases;
import config.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobject.AndroidCommonObjects;
import pageobject.AndroidLenghtScreen;
import pageobject.AndroidVolumeScreen;

import java.net.MalformedURLException;

public class VolumeTestCases extends Utils{

    @Given("^That I opened the app$")
    public void LaunchDrive() throws MalformedURLException{
        Utils.InitDriver();
    }

    @Then("^The screen title is displayed$")
    public void ValidateScreen(){
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

    @And("^I typed the number eight$")
    public void ValidateTypingValue(){
        AndroidCommonObjects androidCommonObjects = new AndroidCommonObjects(driver);
        androidCommonObjects.ClickBtnEight();
    }
    @Then("^The number eight is typed$")
    public void ValidateNumTyp(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        if (androidLenghtScreen.VerifyValueToConvert() == 8){
            System.out.println("Pass Typing 8");
        }
        else{
            System.out.println("Validation failed on Typing 8");
        }
    }
    @And("^I tap the conversion type dropdown$")
    public void ValidateShowDropd(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);
        androidLenghtScreen.ClickDropOne();

    }
    @And("^I select the cup option$")
    public void ValidateSelectCup(){
        AndroidVolumeScreen androidVolumeScreen = new AndroidVolumeScreen(driver);
        androidVolumeScreen.ClickCupUnit();
    }

    @Then("^The cup value is converted$")
    public void ValidateConvertResult(){
        AndroidLenghtScreen androidLenghtScreen = new AndroidLenghtScreen(driver);

        if (androidLenghtScreen.VerifyValueConverted() == 2){
            System.out.println("Pass converted value");
        }
        else{
            System.out.println(androidLenghtScreen.VerifyValueConverted());
        }

    }

    @And("^I clicked the main menu$")
    public void ShowSideList() {
        AndroidCommonObjects androidCommonObjects = new AndroidCommonObjects(driver);
        androidCommonObjects.ClickBtnMenu();
    }

    @And("^I open the volume category$")
    public void OpenVolume(){
        AndroidVolumeScreen androidVolumeScreen = new AndroidVolumeScreen(driver);
        androidVolumeScreen.ClickVolumeOption();
    }


}