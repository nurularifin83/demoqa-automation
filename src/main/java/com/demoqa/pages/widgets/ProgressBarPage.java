package com.demoqa.pages.widgets;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarPage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    // Constructor
    public ProgressBarPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select elements
    @FindBy(xpath = "//li[@id='item-4']//span[text()='Progress Bar']")
    private WebElement progressBar;

    @FindBy(xpath = "//button[@id='startStopButton' and text()='Reset']")
    private WebElement startStopButton;

    // Getter
    public WebElement getResetButton(){
        customWait.waitForElementToBeClickable(startStopButton);
        return startStopButton;
    }

    public WebElement getProgressBar() {
        customWait.waitForVisibilityOfElement(progressBar);
        return progressBar;
    }

    // Page actions
    public void clickOnResetButton(){
        try{
            scriptUtils.clickElementJS(getResetButton());
            LOGGER.info("Clicked on Reset Button.");
        }catch (Exception e){
            LOGGER.error("Failed to click on reset button.", e);
            throw e;
        }
    }

    public void clickOnProgressBarMenu(){
        try{
            scriptUtils.clickElementJS(getProgressBar());
            LOGGER.info("Clicked on progress bar menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on menu.", e);
            throw e;
        }
    }
}
