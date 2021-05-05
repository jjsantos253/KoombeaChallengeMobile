package pageobject;

import config.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AndroidCommonObjects extends Utils{


    public AndroidCommonObjects(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
    public WebElement ScreenTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button[2]")
    public WebElement NumberEight;

    @AndroidFindBy(accessibility = "Open navigation drawer")
    public WebElement SideMenu;


    public Boolean VerifyScreenTitle(){
        Boolean TitleResult = false;
        TitleResult = ScreenTitle.isDisplayed();
        return TitleResult;
    }


    public void ClickBtnMenu() {SideMenu.click();};

    public void ClickBtnEight(){
        NumberEight.click();
    }


}
