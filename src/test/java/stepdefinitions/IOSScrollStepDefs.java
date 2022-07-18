package stepdefinitions;

import io.cucumber.java.en.When;
import utilities.Driver;

import java.util.HashMap;

public class IOSScrollStepDefs {

    @When("kullanici Switches butonuna bassin")
    public void kullanici_switches_butonuna_bassin() {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("value","Switches");
        Driver.getAppiumDriver().executeScript("mobile: scroll", scrollObject);

        Driver.getAppiumDriver().findElementByXPath("//XCUIElementTypeStaticText[@name='Switches']").click();

    }


}