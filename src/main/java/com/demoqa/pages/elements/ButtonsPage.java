package com.demoqa.pages.elements;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    // Select element
    @FindBy(xpath = "//li[@id='item-4']//span[text()='Buttons']")
    private WebElement buttonsMenu;

    @FindBy(xpath = "//button[@type='button' and text()='Click Me']")
    private WebElement clickMeButton;

    @FindBy(xpath = "//p[@id='dynamicClickMessage']")
    private WebElement textClick;

    // Constructors
    public ButtonsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Getter
    public WebElement getClickMeButton(){
        customWait.waitForVisibilityOfElement(clickMeButton);
        return clickMeButton;
    }

    public WebElement getTextClick(){
        customWait.waitForVisibilityOfElement(textClick);
        return textClick;
    }

    public WebElement getButtonsMenu(){
        customWait.waitForElementToBeClickable(buttonsMenu);
        return buttonsMenu;
    }

    // Page actions
    public void clickOnClickMeButton(){
        try{
            scriptUtils.clickElementJS(getClickMeButton());
            LOGGER.info("Clicked on Click Me button.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Click Me button.", e);
            throw e;
        }
    }

    public String readTextClick(){
        try{
            return getTextClick().getText();
        }catch (Exception e){
            LOGGER.error("Failed to read the text.",e);
            throw e;
        }
    }

    public void clickOnButtonsMenu(){
        try{
            getButtonsMenu().click();
            LOGGER.info("Clicked on Buttons menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Buttons.", e);
            throw e;
        }
    }

}
