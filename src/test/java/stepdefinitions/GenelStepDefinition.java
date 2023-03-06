package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

import java.io.IOException;

public class GenelStepDefinition {
    @Then("ekran görüntüsü al")
    public void ekran_görüntüsü_al() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        ReusableMethods.getScreenshot("ekranGrnts");

    }
}