package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AndroidLenghtScreen {

    public AndroidLenghtScreen(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
    public WebElement LenghtScreenTitle;

    @AndroidFindBy( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner[1]/android.widget.RelativeLayout/android.widget.TextView")
    public WebElement ConvParamOne;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[4]/android.widget.TextView[1]")
    public WebElement InchOption;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button[2]")
    public WebElement NumberEight;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView")
    public WebElement ValueToBeConverted;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView[1]")
    public WebElement ValueConverted;

    public Boolean VerifyLenghtScreenTitle(){
        Boolean LenghtResult = false;
        LenghtResult = LenghtScreenTitle.isDisplayed();
        return LenghtResult;
    }

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

    public void ClickBtnEight(){
        NumberEight.click();
    }

    public void ClickDropOne(){
        ConvParamOne.click();
    }

    public void SelectInchOption(){
        InchOption.click();
    }

}
