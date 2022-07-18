package stepdefinitions;

import io.appium.java_client.events.api.general.AlertEventListener;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;

import java.time.Duration;

public class IOSSwitchStepDefs {

    AllPages elements = new AllPages();
    @When("kullanici ilk switch butonunun acmali IOS")
    public void kullanici_ilk_switch_butonunun_acmali_ios() {
        if (elements.iosSwitchPage().ilkSwitch.getText().equals("0")){
            elements.iosSwitchPage().ilkSwitch.click();
        }
    }

    @Then("ilk switch butonunun acik oldugunu onayla IOS")
    public void ilk_switch_butonunun_acik_oldugunu_onayla_ios() {
        Assert.assertEquals("1",elements.iosSwitchPage().ilkSwitch.getText());
    }

    @Then("kullanici ikinci switch butonunun kapamali IOS")
    public void kullanici_ikinci_switch_butonunun_kapamali_ios() {
        if (elements.iosSwitchPage().sonSwitch.getText().equals("1")){
            elements.iosSwitchPage().sonSwitch.click();
        }
    }

    @Then("ikinci switch butonunun kapali oldugunu onayla IOS")
    public void ikinci_switch_butonunun_kapali_oldugunu_onayla_ios() {
        Assert.assertEquals("0",elements.iosSwitchPage().sonSwitch.getText());
    }


}