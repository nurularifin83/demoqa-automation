package com.demoqa.pages.elements;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BasePage {

    // Variables
    private JavaScriptUtils scriptUtils;

    // Select web element
    @FindBy(xpath = "//li[@class='btn btn-light ']//span[text()='Text Box']")
    private WebElement textBoxMenu;

    @FindBy(xpath = "//input[@type='text' and @class=' mr-sm-2 form-control']")
    private WebElement fullName;

    @FindBy(xpath = "//input[@type='email' and @class='mr-sm-2 form-control']")
    private WebElement email;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddress;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    private WebElement permanentAddress;

    @FindBy(xpath = "//button[@type='button' and text()='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "(//p[@class='mb-1'])[1]")
    private WebElement pElement;

    @FindBy(className = "text-field-container")
    private WebElement container;

    // Constructors
    public TextBoxPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        this.scriptUtils = new JavaScriptUtils(driver);
    }

    // Getter
    public WebElement getFullName(){
        customWait.waitForVisibilityOfElement(fullName);
        return fullName;
    }

    public WebElement getEmail(){
        customWait.waitForVisibilityOfElement(email);
        return email;
    }

    public WebElement getCurrentAddress(){
        customWait.waitForVisibilityOfElement(currentAddress);
        return currentAddress;
    }

    public WebElement getPermanentAddress(){
        customWait.waitForVisibilityOfElement(permanentAddress);
        return permanentAddress;
    }

    public WebElement getSubmitButton(){
        customWait.waitForElementToBeClickable(submitButton);
        return submitButton;
    }

    public WebElement getPElement(){
        customWait.waitForVisibilityOfElement(pElement);
        return pElement;
    }

    public WebElement getTextBoxMenu(){
        customWait.waitForElementToBeClickable(textBoxMenu);
        return textBoxMenu;
    }

    // Page Actions
    public boolean pElementIsDisplayed(){
        return getPElement().isDisplayed();
    }

    public void enterFullName(String fullName){
        try{
            getFullName().sendKeys(fullName);
            LOGGER.info("Entered full name.{}", fullName);
        }catch (Exception e){
            LOGGER.error("Failed to enter full name.", e);
            throw e;
        }
    }

    public void enterEmail(String email){
        try{
            getEmail().sendKeys(email);
            LOGGER.info("Entered email address.{}", email);
        }catch (Exception e){
            LOGGER.error("Failed to enter email.", e);
            throw e;
        }
    }

    public void enterCurrentAddress(String currentAddress){
        try{
            getCurrentAddress().sendKeys(currentAddress);
            LOGGER.info("Entered the current address.{}", currentAddress);
        }catch (Exception e){
            LOGGER.error("Failed to enter the current address.", e);
            throw e;
        }
    }

    public void enterPermanentAddress(String permanentAddress){
        try{
            getPermanentAddress().sendKeys(permanentAddress);
            LOGGER.info("Entered the permanent address.{}", permanentAddress);
        }catch (Exception e){
            LOGGER.error("Failed to enter the permanent address.", e);
            throw e;
        }
    }

    public void clickOnSubmitButton(){
        try{
            scriptUtils.clickElementJS(getSubmitButton());
            scriptUtils.scrollToElement(container);
            LOGGER.info("Clicked on the submit button.");
        }catch (Exception e){
            LOGGER.error("Failed to click on submit button.", e);
            throw  e;
        }
    }

    public void clickOnTextBoxMenu(){
        try{
            getTextBoxMenu().click();
            LOGGER.info("Clicked on text box.");
        }catch (Exception e){
            LOGGER.error("Failed to click on text box.", e);
            throw e;
        }
    }

}
