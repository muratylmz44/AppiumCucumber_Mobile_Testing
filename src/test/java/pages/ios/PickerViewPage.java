package pages.ios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.management.MalformedObjectNameException;
import java.time.Duration;

public class PickerViewPage {
    public PickerViewPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }
    @iOSXCUITFindBy(accessibility = "Red color component value")
    public MobileElement ilkKolon;
    @iOSXCUITFindBy(accessibility = "Green color component value")
    public MobileElement ikiciKolon;
    @iOSXCUITFindBy(accessibility = "Blue color component value")
    public MobileElement ucuncuKolon;

}