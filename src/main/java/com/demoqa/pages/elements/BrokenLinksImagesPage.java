package com.demoqa.pages.elements;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenLinksImagesPage extends BasePage {

    // Call utils
    JavaScriptUtils scriptUtils;

    // Constructors
    public BrokenLinksImagesPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select element
    @FindBy(xpath = "//li[@id='item-6']//span[text()='Broken Links - Images']")
    public WebElement brokenLinksImages;

    @FindBy(xpath = "//a[text()='Click Here for Valid Link']")
    public WebElement validLink;

    // Getter
    public WebElement getValidLink(){
        customWait.waitForElementToBeClickable(validLink);
        return validLink;
    }

    public WebElement getBrokenLinksImages(){
        customWait.waitForVisibilityOfElement(brokenLinksImages);
        return brokenLinksImages;
    }

    // Page actions
    public void  clickOnValidLink(){
        try{
            scriptUtils.clickElementJS(getValidLink());
            LOGGER.info("Clicked on the Valid Link.");
        } catch (Exception e) {
            LOGGER.error("Failed to click on the valid Link.");
            throw e;
        }
    }

    public void clickOnBrokenLinksImages(){
        try{
            getBrokenLinksImages().click();
            LOGGER.info("Clicked on the menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click the menu");
            throw e;
        }
    }
}
