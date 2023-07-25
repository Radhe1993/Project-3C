package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationTestSanity {



    @When("I Click on start Button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I will Select a Nationality {string}")
    public void iWillSelectANationality(String job) {
        new ResultPage().selectJobType(job);
    }

    @And("I will Click on continue button")
    public void iWillClickOnContinueButton() {
        new ResultPage().clickNextStepButton();
    }

    @And("I Select reason {string}")
    public void iSelectReason(String text) {
        new ResultPage().selectNationality();
    }

    @And("I should click On Continue button")
    public void iShouldClickOnContinueButton() {
        new ResultPage().setNextStepButton1();
    }

    @And("I Select intendent to stay for {string}")
    public void iSelectIntendentToStayFor(String longerThen6 ) {
        new ResultPage().clickOnLongMonth();
    }

    @And("I will be click on Continue button")
    public void iWillBeClickOnContinueButton() {
        new ResultPage().clickOnContinue();
    }

    @And("I Select have planning to work for {string}")
    public void iSelectHavePlanningToWorkFor(String panning) {
        new ResultPage().setSelectHealthAndCare();
    }

    @And("I Select be click on Continue Button")
    public void iSelectBeClickOnContinueButton() {
        new ResultPage().setContinue2();
    }

    @Then("I Should verify result {string}")
    public void iShouldVerifyResult(String text1) {
        Assert.assertEquals(new ResultPage().getText2(),text1,"You need a visa to work in health and care");
    }
}