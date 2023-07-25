package gov.uk.check.visa.pages;

import dev.failsafe.internal.util.Assert;
import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage  extends Utility {


    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[3]/a[1]")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'family visa')]")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'You need a family visa to live with a family membe')]")
    WebElement getText;


    public void setLessThanSixMonths() {
        clickOnElement(lessThanSixMonths);
        log.info("Clicking on Element : " + lessThanSixMonths.toString());
    }

    public void setMoreThanSixMonths() {

        clickOnElement(moreThanSixMonths);
        log.info("Clicking on Element : " + moreThanSixMonths.toString());
    }


    public void selectLengthOfStay(String moreOrLess) {

        switch (moreOrLess)
        {
            case "A":
                setLessThanSixMonths();

                break;
            case "B" :
                setMoreThanSixMonths();
                setGetText();
                String expected = "You need a family visa to live with a family member in the UK for more than 6 months.";
                String actual = getTextFromElement(By.xpath("//p[contains(text(),'You need a family visa to live with a family membe')]"));
                Assert.isTrue (Boolean.parseBoolean(actual), expected);
                break;

            default:

        }


    }
    public String setGetText()
    {
        log.info("Text : " + getText.toString());
        return   getTextFromElement(getText);
    }
}

