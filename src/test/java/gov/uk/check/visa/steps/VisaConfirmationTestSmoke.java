package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.pages.StartPage;
import gov.uk.check.visa.pages.WorkTypePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationTestSmoke {

    @When("I Click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I Select a Nationality {string}")
    public void iSelectANationalityAustralia(String job) {
        new WorkTypePage().selectJobType( job);
    }

    @And("I will Click on Continue button")
    public void iWillClickOnContinueButton() {
        new WorkTypePage().clickNextStepButton();
    }


    @And("Select reason Tourism")
    public void selectReasonTourism() {
        new SelectNationalityPage(). selectNationality();
    }

    @And("I should click on continue button")
    public void iShouldClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @Then("I should verify result {string}")
    public void iShouldVerifyResult(String text) {
        Assert.assertEquals(new WorkTypePage().getText(),text,"You will not need a visa to come to the UK");
    }


}


