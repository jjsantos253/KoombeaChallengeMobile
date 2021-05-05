package pageobject;

import config.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AndroidLenghtScreen extends Utils{


    public AndroidLenghtScreen(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner[1]/android.widget.RelativeLayout/android.widget.TextView")
    public WebElement ConvParamOne;

    @AndroidFindBy( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner[2]/android.widget.RelativeLayout/android.widget.TextView")
    public WebElement ConvParamTwo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[4]/android.widget.TextView[1]")
    public WebElement InchOption;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView")
    public WebElement ValueToBeConverted;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView[1]")
    public WebElement ValueConverted;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Swap units\"])[1]")
    public WebElement SwapUnit;


    public int VerifyValueToConvert(){
        String Default = "";
        Default = ValueToBeConverted.getText();
        int ToBeValue = Integer.parseInt(Default);
        return ToBeValue;
    }

    public double VerifyValueConverted(){
        String Result = "";
        Result = ValueConverted.getText();
        double Value =Double.parseDouble(Result);
        return Value;
    }

    public String GetTextUnitOne(){
            String Unit1 = "";
            Unit1 = ConvParamOne.getText();
            return Unit1;
    }

    public String GetTextUnitTwo(){
        String Unit2 = "";
        Unit2 = ConvParamTwo.getText();
        return Unit2;
    }


    public void ClickDropOne(){
        ConvParamOne.click();
    }

    public void SelectInchOption(){
        InchOption.click();
    }
    public void SwapUnits(){
        SwapUnit.click();
    }
}
