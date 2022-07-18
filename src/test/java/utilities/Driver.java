package utilities;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {


    private  static AppiumDriver appiumDriver;

    public static AppiumDriver getAppiumDriver() throws MalformedURLException {


        URL appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");


      


        if (appiumDriver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
            desiredCapabilities.setCapability(MobileCapabilityType.APP, ConfigReader.getProperty("appPath"));
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            desiredCapabilities.setCapability("autoAcceptAlert",true);


            if (ConfigReader.getProperty("platformName").equals("android")) {
                desiredCapabilities.setCapability("appPackage","");
                desiredCapabilities.setCapability("appActivity","");
                appiumDriver=new AndroidDriver(appiumServerURL,desiredCapabilities);
                appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                desiredCapabilities.setCapability("bundleId",ConfigReader.getProperty("iosBundleId"));
                appiumDriver = new IOSDriver(appiumServerURL,desiredCapabilities);
                appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            } else {
                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));
            }
        }
        return appiumDriver;
            }

    public static void quitAppiumDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }


    }


    }




