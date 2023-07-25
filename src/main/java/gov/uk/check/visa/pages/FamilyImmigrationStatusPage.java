package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage  extends Utility
{

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectJobtypeList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton1;



    public  void clickStartNow()
    {
        clickOnElement(startNowButton);
        log.info("Clicking on Element : " + startNowButton.toString());

    }
    public  void selectJobType(String job)
    {
        sendTextToElement(selectJobtypeList,job);
        //Colombia
        log.info("Send text : " + selectJobtypeList.toString());
    }

    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
        log.info("Clicking on Element : " + nextStepButton.toString());
    }

    public  void selectResonNationality()
    {
        clickOnElement(nationalityDropDownList);
        log.info("Clicking on Element : " + nationalityDropDownList.toString());

    }
    public void setNextStepButton1()
    {
        clickOnElement(nextStepButton1);
        log.info("Clicking on Element : " + nextStepButton.toString());
    }


}

