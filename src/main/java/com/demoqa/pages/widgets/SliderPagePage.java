package com.demoqa.pages.widgets;

import com.demoqa.base.BasePage;
import com.demoqa.utils.ActionsUtility;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPagePage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;
    private ActionsUtility actionsUtility;

    // Constructors
    public SliderPagePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
        actionsUtility = new ActionsUtility(driver);
    }

    // Select web elements
    @FindBy(xpath = "//li[@id=\"item-3\"]//span[text()='Slider']")
    private WebElement sliderMenu;

    @FindBy(xpath = "//div[@id='sliderContainer']//input[@type='range']")
    private WebElement range;

    @FindBy(xpath = "//input[@id='sliderValue']")
    private WebElement sliderValue;

    // Getter
    public WebElement getSliderValueElement(){
        customWait.waitForVisibilityOfElement(sliderValue);
        return sliderValue;
    }

    public WebElement getRange(){
        customWait.waitForVisibilityOfElement(range);
        return range;
    }

    public WebElement getSliderMenu(){
        customWait.waitForVisibilityOfElement(sliderMenu);
        return sliderMenu;
    }

    // Page Actions
    public void moveSlider(){
        actionsUtility.dragAndDropBy(getRange(), 50, 0);
    }

    public String getSliderValue(){
        return getSliderValueElement().getDomAttribute("value");
    }

    public void clickOnSliderMenu(){
        try{
            getSliderMenu().click();
            LOGGER.info("Clicked on Slider Menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Slider Menu.", e);
            throw e;
        }
    }
}
