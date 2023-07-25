package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility
{

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
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
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement longMonth;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectHealthAndCare;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue2;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement text2;


    public  void clickStartNow()
    {
        clickOnElement(startNowButton);
        log.info("Clicking on Element : " + startNowButton.toString());

    }
    public  void selectJobType(String job)
    {
        selectByValueFromDropDown(selectJobtypeList,job);
        //chile
        log.info("select value : " + selectJobtypeList.toString());
    }

    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
        log.info("Clicking on Element : " + nextStepButton.toString());
    }

    public  void selectNationality()
    {
        clickOnElement(nationalityDropDownList);
        log.info("Clicking on Element : " + nationalityDropDownList.toString());


    }
    public void setNextStepButton1()
    {
        clickOnElement(nextStepButton1);
        log.info("Clicking on Element : " + nextStepButton1.toString());
    }
    public void clickOnLongMonth()
    {
        clickOnElement(longMonth);
        log.info("Clicking on Element : " + longMonth.toString());
    }
    public void clickOnContinue()
    {
        clickOnElement(continue1);
        log.info("Clicking on Element : " + continue1.toString());
    }
    public void setSelectHealthAndCare()
    {
        clickOnElement(selectHealthAndCare);
        log.info("Clicking on Element : " + selectHealthAndCare.toString());
    }
    public void setContinue2()
    {
        clickOnElement(Continue2);
        log.info("Clicking on Element : " + Continue2.toString());
    }
    public String getText2()
    {
        log.info("Get Text : " + text2.toString());
       return getTextFromElement(text2);

    }

}

