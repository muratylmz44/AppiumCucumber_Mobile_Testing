package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import pages.AllPages;

public class IOSPickerStepDefs {
    AllPages elements = new AllPages();
    @When("kullanici ilk colona {string} ikici kolona {string} ucuncu kolona {string} gondersin")
    public void kullanici_ilk_colona_ikici_kolona_ucuncu_kolona_gondersin(String ilk, String ikinci, String ucuncu) {
        elements.pickerViewPage().ilkKolon.sendKeys(ilk);
        elements.pickerViewPage().ikiciKolon.sendKeys(ikinci);
        elements.pickerViewPage().ucuncuKolon.sendKeys(ucuncu);
    }

    @Then("datalari onaylasin")
    public void datalari_onaylasin() {
        assertEquals("50",elements.pickerViewPage().ilkKolon.getText());
        assertEquals("200",elements.pickerViewPage().ikiciKolon.getText());
        assertEquals("150",elements.pickerViewPage().ucuncuKolon.getText());
    }

}