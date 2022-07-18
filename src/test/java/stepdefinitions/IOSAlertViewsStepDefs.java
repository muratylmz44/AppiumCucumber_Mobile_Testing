package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class IOSAlertViewsStepDefs {
    AllPages elements = new AllPages();

    @Given("app IOS cihazda acilsin")
    public void app_ios_cihazda_acilsin() {
        Driver.getAppiumDriver();
    }

    @When("kullanici {string} yazisina tiklasin")
    public void kullanici_yazisina_tiklasin(String page) {
        ReusableMethods.clickOnPageIOS(page);
    }

    @When("kullanici popup mesaji gorundunu onayalsin")
    public void kullaniciPopupMesajiGorundunuOnayalsin() {
        Assert.assertTrue(elements.alertViewsPage().okButton.isDisplayed());
    }

    @Then("kullanici ok butonuna tiklasin")
    public void kullaniciOkButonunaTiklasin() {
        elements.alertViewsPage().okButton.click();
    }

    @And("kullanici {string} yazi kutusuna yazacak")
    public void kullaniciYaziKutusunaYazacak(String text) {
        elements.alertViewsPage().textBox.sendKeys(text);
    }
}