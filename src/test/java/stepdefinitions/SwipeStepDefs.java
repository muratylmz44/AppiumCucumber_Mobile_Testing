package stepdefinitions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllPages;
import utilities.Driver;

import java.time.Duration;

public class SwipeStepDefs {
    AllPages elements = new AllPages();
    @When("kullanici Date Widgets tiklasin")
    public void kullanici_date_widgets_tiklasin() {
        elements.viewsPage().dateWidgets.click();
    }

    @When("kullanici inline tiklasin")
    public void kullanici_inline_tiklasin() {
        elements.dateWidgetsPage().inline.click();
    }

    @When("kullanici num9 tiklasin")
    public void kullanici_num9_tiklasin() {
        elements.dateWidgetsPage().num9.click();
    }

    @Then("kullanici {int} ten {int} kaydiracak")
    public void kullanici_ten_kaydiracak(Integer int1, Integer int2) {
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
        touchAction.press(ElementOption.element(elements.dateWidgetsPage().num15)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                moveTo(ElementOption.element(elements.dateWidgetsPage().num45)).perform();
    }

}