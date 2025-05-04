package com.demoqa.pages.alerts_frame_windows;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage extends BasePage {

    // call utils
    private JavaScriptUtils scriptUtils;

    // constructors
    public ModalDialogsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select elements
    @FindBy(xpath = "//li[@id='item-4']//span[text()='Modal Dialogs']")
    public WebElement modalDialogs;

    @FindBy(xpath = "//button[@id='showLargeModal']")
    public WebElement showLargeModal;

    @FindBy(xpath = "//button[@id='closeLargeModal']")
    public WebElement closeButton;

    // Getter
    public WebElement getCloseButton(){
        customWait.waitForVisibilityOfElement(closeButton);
        return closeButton;
    }

    public WebElement getShowLargeModal(){
        customWait.waitForVisibilityOfElement(showLargeModal);
        return showLargeModal;
    }

    public WebElement getModalDialogs(){
        customWait.waitForVisibilityOfElement(modalDialogs);
        return modalDialogs;
    }

    // Page actions
    public void clickOnCloseButton(){
        try{
            getCloseButton().click();
            LOGGER.info("Clicked on close button.");
        }catch (Exception e){
            LOGGER.error("Failed to click on close button.", e);
            throw e;
        }
    }

    public void clickOnShowLargeModal(){
        try{
            getShowLargeModal().click();
            LOGGER.info("Clicked on show large modal.");
        }catch (Exception e){
            LOGGER.error("Failed to click on show large modal.", e);
            throw e;
        }
    }

    public void clickOnModalDialogs(){
        try{
            getModalDialogs().click();
            LOGGER.info("Clicked on modal dialogs.");
        }catch (Exception e){
            LOGGER.error("Failed to click on modal dialogs.", e);
            throw e;
        }
    }
}
