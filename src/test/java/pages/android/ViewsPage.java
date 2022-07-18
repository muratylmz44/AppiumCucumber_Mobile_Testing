package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class ViewsPage {

    public ViewsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
    public MobileElement dragDrop;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Widgets']")
    public MobileElement dateWidgets;
    //elementi list icinde locate ettik.
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public List<MobileElement> switches;
    //elementi tek olarak locate ettik
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public MobileElement switchesSingle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WebView']")
    public MobileElement webView;
}