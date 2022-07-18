package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;


public class SpinnerStepDefs {

    AllPages elements = new AllPages();

    @When("kullanici color menusunden {string} secmeli")
    public void kullanici_color_menusunden_secmeli(String string) throws InterruptedException {
        elements.spinnerPage().colorDropDown.click();
        elements.spinnerPage().blue.click();
        Thread.sleep(2000);
        Assert.assertTrue(elements.spinnerPage().selectedBlue.isDisplayed());
    }

    @When("kullanici planet menusunden {string} secmeli")
    public void kullanici_planet_menusunden_secmeli(String string) throws InterruptedException {
        elements.spinnerPage().planetDropDown.click();
        elements.spinnerPage().saturn.click();
        String toast = Driver.getAppiumDriver().findElementByXPath("//android.widget.Toast").getAttribute("name");
        Assert.assertEquals("Spinner2: position=5 id=5",toast);
        System.out.println(toast);
        Thread.sleep(2000);
        Assert.assertTrue(elements.spinnerPage().selectedSaturn.isDisplayed());



    }
    @Then("kullanici {string} tiklasin with UISelector")
    public void kullanici_tiklasin_with_ui_selector(String string) {
        ReusableMethods.scrollWithUiScrollable(string);
    }

}