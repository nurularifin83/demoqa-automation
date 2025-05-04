package com.demoqa.pages.alerts_frame_windows;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserWindowsPage extends BasePage {

    // Call Utils
    private JavaScriptUtils scriptUtils;

    // Constructors
    public BrowserWindowsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select element
    @FindBy(xpath = "//li[@id='item-0']//span[text()='Browser Windows']")
    private WebElement browserWindows;

    @FindBy(xpath = "//button[@id='windowButton']")
    private WebElement windowButton;

    // Getter
    public WebElement getWindowButton(){
        customWait.waitForVisibilityOfElement(windowButton);
        return windowButton;
    }

    public WebElement getBrowserWindows(){
        customWait.waitForVisibilityOfElement(browserWindows);
        return browserWindows;
    }

    // Page actions
    public void clickOnWindowButton(){
        try{
            getWindowButton().click();
            LOGGER.info("Clicked on New Tab Button.");
        }catch (Exception e){
            LOGGER.error("Failed to click on New Tab Button.", e);
            throw e;
        }
    }

    public void clickOnBrowserWindows(){
        try{
            getBrowserWindows().click();
            LOGGER.info("Clicked on Browser Windows Menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on browser windows.", e);
            throw e;
        }
    }
}
