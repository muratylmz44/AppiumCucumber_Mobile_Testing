package pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class IOSSwitchPage {
    public IOSSwitchPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSwitch)[1]")
    public MobileElement ilkSwitch;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSwitch)[2]")
    public MobileElement sonSwitch;

}