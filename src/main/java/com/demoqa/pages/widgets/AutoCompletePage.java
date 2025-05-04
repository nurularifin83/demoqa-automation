package com.demoqa.pages.widgets;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoCompletePage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    // Constructors
    public AutoCompletePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select Web elements
    @FindBy(xpath = "//li[@id='item-1']//span[text()='Auto Complete']")
    public WebElement autoComplete;

    @FindBy(xpath = "//input[@id='autoCompleteMultipleInput']")
    public WebElement autoCompleteMultipleInput;

    // Getter
    public WebElement getAutoCompleteMultipleInput(){
        customWait.waitForVisibilityOfElement(autoCompleteMultipleInput);
        return autoCompleteMultipleInput;
    }

    public WebElement getAutoComplete(){
        customWait.waitForVisibilityOfElement(autoComplete);
        return autoComplete;
    }

    // Page actions
    public void enterMultipleColorNames(String colors){
        try {
            getAutoCompleteMultipleInput().sendKeys(colors);
            LOGGER.info("Enter colors: " + colors);
        }catch (Exception e){
            LOGGER.error("Failed to enter a colors", e);
            throw e;
        }
    }

    public void clickOnAutoComplete(){
        try {
            getAutoComplete().click();
            LOGGER.info("Clicked on Auto Complete menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Auto Complete menu.");
            throw e;
        }
    }
}
