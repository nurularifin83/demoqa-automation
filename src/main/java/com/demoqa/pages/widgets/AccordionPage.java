package com.demoqa.pages.widgets;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccordionPage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    // Constructors
    public AccordionPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select elements
    @FindBy(xpath = "//li[@id='item-0']//span[text()='Accordian']")
    public WebElement accordion;

    @FindBy(xpath = "//div[@id='section2Heading']")
    public WebElement section2Heading;

    // Getter
    public WebElement getSection2Heading(){
        customWait.waitForElementToBeClickable(section2Heading);
        return section2Heading;
    }

    public WebElement getAccordion(){
        customWait.waitForElementToBeClickable(accordion);
        return accordion;
    }

    // Page actions
    public void clickOnSection2Heading(){
        try {
            scriptUtils.clickElementJS(getSection2Heading());
            LOGGER.info("Clicked on section2Heading.");
        }catch (Exception e){
            LOGGER.error("Failed to click on section2Heading.", e);
            throw e;
        }
    }

    public void clickOnAccordion(){
        try {
            scriptUtils.clickElementJS(getAccordion());
            LOGGER.info("Clicked on accordion menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on accordion menu.", e);
            throw e;
        }
    }

}
