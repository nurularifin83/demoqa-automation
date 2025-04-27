package com.demoqa.pages.forms;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    // Constructors
    public PracticeForm(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select elements
    @FindBy(xpath = "//li[@id='item-0']//span[text()='Practice Form']")
    public WebElement practiceForm;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement userEmail;

    @FindBy(xpath = "//label[@class='custom-control-label' and text()='Female']")
    public WebElement female;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement dateOfBirthInput;

    @FindBy(xpath = "//div[text()='28']")
    public WebElement date;

    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement userNumber;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    public WebElement subjects;

    @FindBy(xpath = "//label[@class='custom-control-label' and text()='Reading']")
    public WebElement hobbies;

    @FindBy(xpath = "//textarea[@id=\"currentAddress\"]")
    public WebElement currentAddress;

    @FindBy(xpath = "//button[@type='submit' and text()='Submit']")
    public WebElement submitButton;

    // Getter
    public WebElement getSubmitButton(){
        customWait.waitForElementToBeClickable(submitButton);
        return submitButton;
    }

    public WebElement getCurrentAddress(){
        customWait.waitForVisibilityOfElement(currentAddress);
        return currentAddress;
    }

    public WebElement getHobbies(){
        customWait.waitForVisibilityOfElement(hobbies);
        return hobbies;
    }

    public WebElement getSubjects(){
        customWait.waitForVisibilityOfElement(subjects);
        return subjects;
    }

    public WebElement getDate(){
        customWait.waitForVisibilityOfElement(date);
        return date;
    }

    public WebElement getDateOfBirthInput(){
        customWait.waitForVisibilityOfElement(dateOfBirthInput);
        return dateOfBirthInput;
    }

    public WebElement getFemale(){
        customWait.waitForVisibilityOfElement(female);
        return female;
    }

    public WebElement getFirstName(){
        customWait.waitForVisibilityOfElement(firstName);
        return firstName;
    }

    public WebElement getLastName(){
        customWait.waitForVisibilityOfElement(lastName);
        return lastName;
    }

    public WebElement getUserEmail(){
        customWait.waitForVisibilityOfElement(userEmail);
        return userEmail;
    }

    public WebElement getUserNumber(){
        customWait.waitForVisibilityOfElement(userNumber);
        return userNumber;
    }

    public WebElement getPracticeForm(){
        customWait.waitForVisibilityOfElement(practiceForm);
        return practiceForm;
    }

    // Page actions
    public void clickOnSubmit(){
        try{
            scriptUtils.clickElementJS(getSubmitButton());
            LOGGER.info("Clicked the submit button");
        }catch (Exception e){
            LOGGER.error("Failed to click the button.", e);
            throw e;
        }
    }

    public void inputCurrentAddress(String currentAddress){
        try{
            getCurrentAddress().sendKeys(currentAddress);
            LOGGER.info("Input the currecnt address: " + currentAddress);
        }catch (Exception e){
            LOGGER.error("Failed to input a current address.", e);
            throw e;
        }
    }

    public void clickOnHobbies(){
        try{
            scriptUtils.clickElementJS(getHobbies());
            LOGGER.info("Clicked on hobbies");
        }catch (Exception e){
            LOGGER.error("Failed to click on hobbies", e);
            throw e;
        }
    }

    public void inputSubjects(String subject){
        try{
            getSubjects().sendKeys(subject);
            LOGGER.info("Input the subject: " + subject);
        }catch (Exception e){
            LOGGER.error("Failed to input a subject.", e);
            throw e;
        }
    }

    public void clickOnGender(){
        try{
            scriptUtils.clickElementJS(getFemale());
            LOGGER.info("Clicked on gender.");
        }catch (Exception e){
            LOGGER.error("Failed to click on gender.", e);
            throw e;
        }
    }

    public void clickOnDate(){
        try{
            scriptUtils.clickElementJS(getDate());
            LOGGER.info("Clicked on date.");
        }catch (Exception e){
            LOGGER.error("Failed to click on date.", e);
            throw e;
        }
    }

    public void clickOnDateOfBirthInput(){
        try {
            scriptUtils.clickElementJS(getDateOfBirthInput());
            LOGGER.info("Clicked on date of birth input.");
        }catch (Exception e){
            LOGGER.error("Failed to click on date of birth input.",e);
            throw e;
        }
    }

    public void inputUserNumber(String userNumber){
        try{
            getUserNumber().sendKeys(userNumber);
            LOGGER.info("Input user number: " + userNumber);
        }catch (Exception e){
            LOGGER.error("Failed to input user number!",e);
            throw e;
        }
    }

    public void inputUserEmail(String userEmail){
        try{
            getUserEmail().sendKeys(userEmail);
            LOGGER.info("Input user email: " + userEmail);
        }catch (Exception e){
            LOGGER.error("Failed to input user email!",e);
            throw e;
        }
    }

    public void inputLastName(String lastName){
        try{
            getLastName().sendKeys(lastName);
            LOGGER.info("Input last name: " + lastName);
        }catch (Exception e){
            LOGGER.error("Failed to input last name!",e);
            throw e;
        }
    }

    public void inputFirstName(String firstName){
        try{
            getFirstName().sendKeys(firstName);
            LOGGER.info("Input first name: " + firstName);
        }catch (Exception e){
            LOGGER.error("Failed to input first name!",e);
            throw e;
        }
    }

    public void clickOnPracticeFormMenu(){
        try{
            getPracticeForm().click();
            LOGGER.info("Clicked on menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on menu.", e);
            throw e;
        }
    }
}
