package com.demoqa.pages;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    // Variables
    private JavaScriptUtils scriptUtils;

    // Select web element
    @FindBy(xpath = "//div[@class='card-body']//h5[text()='Elements']")
    private WebElement elements;

    @FindBy(xpath = "//div[@class='card-body']//h5[text()='Forms']")
    private WebElement forms;

    @FindBy(xpath = "//div[@class='card-body']//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsFrameWindows;

    @FindBy(xpath = "//div[@class='card-body']//h5[text()='Widgets']")
    private WebElement widgets;

    @FindBy(xpath = "//div[@class='card-body']//h5[text()='Interactions']")
    private WebElement interactions;

    @FindBy(xpath = "//div[@class='card-body']//h5[text()='Book Store Application']")
    private WebElement bookStoreApplication;

    // Constructors
    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        this.scriptUtils = new JavaScriptUtils(driver);
    }

    // Getter
    public WebElement getElements(){
        customWait.waitForElementToBeClickable(elements);
        return elements;
    }

    public WebElement getForms(){
        customWait.waitForElementToBeClickable(forms);
        return forms;
    }

    public WebElement getAlertsFrameWindows(){
        customWait.waitForElementToBeClickable(alertsFrameWindows);
        return alertsFrameWindows;
    }

    public WebElement getWidgets(){
        customWait.waitForElementToBeClickable(widgets);
        return widgets;
    }

    public WebElement getInteractions(){
        customWait.waitForElementToBeClickable(interactions);
        return interactions;
    }

    // Page actions
    public void clickOnElements(){
        try{
            getElements().click();
            LOGGER.info("Clicked on elements.");
        }catch (Exception e){
            LOGGER.error("Failed to click on elements.", e);
            throw e;
        }
    }

    public void clickOnForms(){
        try{
            getForms().click();
            LOGGER.info("Clicked on forms.");
        }catch (Exception e){
            LOGGER.error("Failed to click on forms.", e);
            throw e;
        }
    }

    public void clickOnAlertsFrameWindows(){
        try{
            getAlertsFrameWindows().click();
            LOGGER.info("Clicked on alerts frame and windows.");
        }catch (Exception e){
            LOGGER.error("Failed to click on alerts frame and windows.", e);
            throw e;
        }
    }

    public void clickOnWidgets(){
        try{
            getWidgets().click();
            LOGGER.info("Clicked on widgets.");
        }catch (Exception e){
            LOGGER.error("Failed to click on widgets.", e);
            throw e;
        }
    }

    public void clickOnInteractions(){
        try{
            getInteractions().click();
            LOGGER.info("Clicked on interactions.");
        }catch (Exception e){
            LOGGER.error("Failed to click on interactions.", e);
            throw e;
        }
    }
}
