package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.ReusableMethods;

public class ExpandableListStepDefs {
    AllPages elements = new AllPages();

    @When("kullanici Arnold basili tuttugunda")
    public void kullanici_arnold_basili_tuttugunda() {
        ReusableMethods.longPressOnElement(elements.expandableListsPage().arnold);
    }

    @Then("popup ciktigini onayla")
    public void popup_ciktigini_onayla() {
        Assert.assertTrue(elements.expandableListsPage().sampleMenu.isDisplayed());
    }
}