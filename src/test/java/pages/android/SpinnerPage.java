package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.rmi.MarshalledObject;
import java.time.Duration;

public class SpinnerPage {
    public SpinnerPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }

    @AndroidFindBy(xpath = "(//android.widget.Spinner)[1]")
    public MobileElement colorDropDown;
    @AndroidFindBy(xpath = "(//android.widget.Spinner)[2]")
    public MobileElement planetDropDown;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='blue']")
    public MobileElement blue;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Saturn']")
    public MobileElement saturn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='blue']")
    public MobileElement selectedBlue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Saturn']")
    public MobileElement selectedSaturn;

    @AndroidFindBy(xpath = "//andorid.widget.Toast")
    public MobileElement toastMesaage;

}