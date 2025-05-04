package com.demoqa.pages.widgets;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    // Constructor
    public DatePickerPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select elements
    @FindBy(xpath = "//li[@id='item-2']//span[text()='Date Picker']")
    private WebElement datePicker;

    @FindBy(xpath = "//input[@id='datePickerMonthYearInput']")
    private WebElement datePickerMonthYearInput;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--012' and text()='12']")
    private WebElement dateClicker;

    // Getter
    public WebElement getDateClicker(){
        customWait.waitForElementToBeClickable(dateClicker);
        return dateClicker;
    }

    public WebElement getDatePickerMonthYearInput(){
        customWait.waitForVisibilityOfElement(datePickerMonthYearInput);
        return datePickerMonthYearInput;
    }

    public WebElement getDatePicker(){
        customWait.waitForVisibilityOfElement(datePicker);
        return datePicker;
    }

    // Page actions
    public void clickOnDateClicker(){
        try{
            scriptUtils.clickElementJS(getDateClicker());
            LOGGER.info("Clicked on date.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Date ");
        }
    }

    public void clickOnDatePickerMonthYearInput(){
        try{
            getDatePickerMonthYearInput().click();
            LOGGER.info("Click on Date Picker Month Year Input.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Date Picker Month Year Input.", e);
            throw e;
        }
    }

    public void clickOnDatePickerMenu(){
        try{
            getDatePicker().click();
            LOGGER.info("Click on Date Picker Menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Date Picker menu.", e);
            throw e;
        }
    }
}
