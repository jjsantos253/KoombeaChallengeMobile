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

    public boolean VerifyLenghtScreenTitle(){
        boolean LenghtResult = false;
        if(LenghtScreenTitle.isDisplayed()){ LenghtResult = true;}
        else{ LenghtResult = false; }
        return LenghtResult;
    }

}
