package com.demoqa.pages.alerts_frame_windows;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    // Constructors
    public AlertsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select web elements
    @FindBy(xpath = "//li[@id='item-1']//span[text()='Alerts']")
    private WebElement alerts;

    @FindBy(xpath = "//button[@id='alertButton']")
    private WebElement alertButton;

    // Getter
    public WebElement getAlerts(){
        customWait.waitForVisibilityOfElement(alerts);
        return alerts;
    }

    public WebElement getAlertButton(){
        customWait.waitForVisibilityOfElement(alertButton);
        return alertButton;
    }

    // Page actions
    public void clickOnAlertButton(){
        try{
            getAlertButton().click();
            LOGGER.info("Clicked on alerts button.");
        }catch (Exception e){
            LOGGER.error("Failed to click", e);
            throw e;
        }
    }

    public void clickOnAlerts(){
        try{
            getAlerts().click();
            LOGGER.info("Clicked on alerts menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on alerts menu.", e);
            throw e;
        }
    }
}
