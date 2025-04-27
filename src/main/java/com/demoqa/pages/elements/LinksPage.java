package com.demoqa.pages.elements;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    // Constructors
    public LinksPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select elements
    @FindBy(xpath = "//a[@id='simpleLink' and text()='Home']")
    private WebElement homeLink;

    @FindBy(xpath = "//li[@id='item-5']//span[@class='text' and text()='Links']")
    private WebElement menuLinks;

    // Getter
    public WebElement getMenuLinks(){
        customWait.waitForVisibilityOfElement(menuLinks);
        return menuLinks;
    }

    public WebElement getHomeLink(){
        customWait.waitForVisibilityOfElement(homeLink);
        return homeLink;
    }

    // Page actions
    public void clickOnMenuLinks(){
        try{
            getMenuLinks().click();
            LOGGER.info("Clicked on Menu Links.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Menu Links.", e);
            throw e;
        }
    }

    public void clickOnHomeLink(){
        try{
            getHomeLink().click();
            LOGGER.info("Clicked on Home Links.");
        }catch (Exception e){
            LOGGER.error("Failed to click Home.", e);
            throw e;
        }
    }
}
