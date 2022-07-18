package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class ExpandableListsPage {
    public ExpandableListsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Arnold']")
    public MobileElement arnold;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sample menu']")
    public MobileElement sampleMenu;
}