package com.demoqa.pages.widgets;

import com.demoqa.base.BasePage;
import com.demoqa.utils.ActionsUtility;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolTipsPage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;
    private ActionsUtility actionsUtility;

    // Constructor
    public ToolTipsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
        actionsUtility = new ActionsUtility(driver);
    }

    // Select element
    @FindBy(xpath = "//li[@id='item-6']//span[text()='Tool Tips']")
    private WebElement toolTips;

    @FindBy(xpath = "//button[@id='toolTipButton']")
    private WebElement toolTipButton;

    // Getter
    public WebElement getToolTipButton(){
        customWait.waitForVisibilityOfElement(toolTipButton);
        return toolTipButton;
    }

    public WebElement getToolTips(){
        customWait.waitForVisibilityOfElement(toolTips);
        return toolTips;
    }

    // Page actions
    public void  hoverToToolTipButton(){
        actionsUtility.hover(getToolTipButton());
    }

    // Verify is attribute present
    public boolean isAttributePresent(){
        String ariaDescribedBy = getToolTipButton().getDomAttribute("aria-describedby");
        return "buttonToolTip".equals(ariaDescribedBy);
    }

    public void clickOnToolTipsMenu(){
        try{
            scriptUtils.scrollToElement(getToolTips());
            getToolTips().click();
            LOGGER.info("Clicked on menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on menu.", e);
            throw e;
        }
    }
}
