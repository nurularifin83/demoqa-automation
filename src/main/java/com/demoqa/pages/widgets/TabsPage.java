package com.demoqa.pages.widgets;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabsPage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    // Constructor
    public TabsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select web element
    @FindBy(xpath = "//li[@id='item-5']//span[text()='Tabs']")
    private WebElement tabsMenu;

    @FindBy(xpath = "//a[@id='demo-tab-use']")
    private WebElement demoTabUse;

    @FindBy(xpath = "//p[@class='mt-3' and contains(text(), 'It is a long established')]")
    private WebElement textVerify;

    // Getter
    public WebElement getTextVerify(){
        customWait.waitForVisibilityOfElement(textVerify);
        return textVerify;
    }

    public WebElement getDemoTabUse(){
        customWait.waitForVisibilityOfElement(demoTabUse);
        return demoTabUse;
    }

    public WebElement getTabsMenu(){
        customWait.waitForVisibilityOfElement(tabsMenu);
        return tabsMenu;
    }

    // Page Actions
    public boolean isTextVisible(String someText){
        return getTextVerify().getText().contains(someText);
    }

    public void clickOnDemoTabUse(){
        try{
            getDemoTabUse().click();
            LOGGER.info("Clicked on Demo Tab Use!");
        }catch (Exception e){
            LOGGER.error("Failed to click on Demo Tab Use!");
            throw e;
        }
    }

    public void clickOnTabsMenu(){
        try{
            scriptUtils.scrollToElement(getTabsMenu());
            getTabsMenu().click();
            LOGGER.info("Clicked on Tabs Menu!");
        }catch (Exception e){
            LOGGER.error("Failed to click on tabs menu!");
            throw e;
        }
    }

}
