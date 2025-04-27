package com.demoqa.pages.elements;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BasePage {

    // JavaScripts
    private JavaScriptUtils scriptUtils;

    // Select Web Element
    @FindBy(xpath = "//li[@id ='item-2']//span[text()='Radio Button']")
    private WebElement radioButtonMenu;

    @FindBy(xpath = "//input[@type='radio' and @id='impressiveRadio']")
    private WebElement impressiveRadio;

    @FindBy(xpath = "//span[@class='text-success' and text()='Impressive']")
    private WebElement impressiveText;

    // Constructor
    public RadioButtonPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Getter
    public WebElement getImpressiveText(){
        customWait.waitForVisibilityOfElement(impressiveText);
        return impressiveText;
    }

    public WebElement getImpressiveRadio(){
        customWait.waitForElementToBeClickable(impressiveRadio);
        return impressiveRadio;
    }

    public WebElement getRadioButtonMenu(){
        customWait.waitForVisibilityOfElement(radioButtonMenu);
        return radioButtonMenu;
    }

    // Page actions
    public String readImpressiveText(){
        try{
            return getImpressiveText().getText();
        }catch (Exception e){
            LOGGER.error("Can't read the text.", e);
            throw e;
        }
    }

    public void clickOnImpressiveRadio(){
        try{
            scriptUtils.clickElementJS(getImpressiveRadio());
            LOGGER.info("Clicked on impressiveRadio.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Radio Button.", e);
            throw e;
        }
    }

    public void clickOnRadioButtonMenu(){
        try{
            getRadioButtonMenu().click();
            LOGGER.info("Clicked on Radio Button Menu");
        }catch (Exception e){
            LOGGER.error("Failed to click on the button.", e);
            throw e;
        }
    }
}
