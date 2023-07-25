package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.DurationOfStayPage;
import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationTestRegression {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on Start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }


    @And("I  Selected a Nationality {string}")
    public void iSelectedANationality(String job) {
        new FamilyImmigrationStatusPage().selectJobType( job);
    }

    @And("I will Click  on continue Button")
    public void iWillClickOnContinueButton() {
        new FamilyImmigrationStatusPage().clickNextStepButton();
    }

    @And("I Selected reason")
    public void iSelectedReason() {
        new FamilyImmigrationStatusPage().selectResonNationality();

    }


    @And("I should click On continue button")
    public void iShouldClickOnContinueButton() {
        new FamilyImmigrationStatusPage().setNextStepButton1();
    }

    @And("I Select state My partner of family member have uk immigration status {string}")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String moreOrLess) {
        new DurationOfStayPage().selectLengthOfStay( moreOrLess);
    }


    @Then("I verify result {string}")
    public void iVerifyResult(String result) {
      //  Assert.assertEquals(new DurationOfStayPage().setGetText(),result,"You’ll need a visa to join your family or partner in the UK");
    }



}
