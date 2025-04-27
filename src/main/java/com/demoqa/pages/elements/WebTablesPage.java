package com.demoqa.pages.elements;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage extends BasePage {

    // Call others class
    private JavaScriptUtils scriptUtils;

    // Select elements
    @FindBy(xpath = "//li[@id='item-3']//span[text()='Web Tables']")
    private WebElement webTablesMenu;

    @FindBy(xpath = "//input[@type='text' and @id='searchBox']")
    private WebElement searchBox;

    @FindBy(xpath = "//div[text()='Alden']")
    private WebElement firstNameText;

    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    private WebElement addButton;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement userEmail;

    @FindBy(xpath = "//input[@id='age']")
    private WebElement age;

    @FindBy(xpath = "//input[@id='salary']")
    private WebElement salary;

    @FindBy(xpath = "//input[@id='department']")
    private WebElement department;

    @FindBy(xpath = "//button[@type='submit' and text()='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[text()='Finance']")
    private WebElement departmentText;

    // Constructor
    public WebTablesPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
        this.scriptUtils = new JavaScriptUtils(driver);
    }

    // Getter
    public WebElement getDepartmentText(){
        customWait.waitForVisibilityOfElement(departmentText);
        return departmentText;
    }

    public WebElement getSubmitButton(){
        customWait.waitForElementToBeClickable(submitButton);
        return submitButton;
    }

    public WebElement getDepartment(){
        customWait.waitForVisibilityOfElement(department);
        return department;
    }

    public WebElement getSalary(){
        customWait.waitForVisibilityOfElement(salary);
        return salary;
    }

    public WebElement getAge(){
        customWait.waitForVisibilityOfElement(age);
        return age;
    }

    public WebElement getUserEmail(){
        customWait.waitForVisibilityOfElement(userEmail);
        return userEmail;
    }

    public WebElement getLastName(){
        customWait.waitForVisibilityOfElement(lastName);
        return lastName;
    }

    public WebElement getFirstName(){
        customWait.waitForVisibilityOfElement(firstName);
        return firstName;
    }

    public WebElement getAddButton(){
        customWait.waitForElementToBeClickable(addButton);
        return addButton;
    }

    public WebElement getFirstNameText(){
        customWait.waitForVisibilityOfElement(firstNameText);
        return firstNameText;
    }

    public WebElement getWebTablesMenu(){
        customWait.waitForVisibilityOfElement(webTablesMenu);
        return webTablesMenu;
    }

    public WebElement getSearchBox(){
        customWait.waitForVisibilityOfElement(searchBox);
        return searchBox;
    }

    // Page actions
    public String readDepartmentText(){
        return getDepartmentText().getText();
    }

    public void clickOnSubmitButton(){
        try{
            getSubmitButton().click();
            LOGGER.info("Clicked on submit button.");
        }catch (Exception e){
            LOGGER.error("Failed to click on submit button.", e);
            throw e;
        }
    }

    public void enterDepartment(String department){
        try{
            getDepartment().sendKeys(department);
            LOGGER.info("Entered the department: "+department);
        }catch (Exception e){
            LOGGER.error("Failed to enter the department.", e);
            throw e;
        }
    }

    public void enterSalary(String salary){
        try{
            getSalary().sendKeys(salary);
            LOGGER.info("Entered the salary: "+salary);
        }catch (Exception e){
            LOGGER.error("Failed to enter the salary.", e);
            throw e;
        }
    }

    public void enterAge(String age){
        try{
            getAge().sendKeys(age);
            LOGGER.info("Entered the age: "+age);
        }catch (Exception e){
            LOGGER.error("Failed to enter the age.", e);
            throw e;
        }
    }

    public void enterEmail(String email){
        try{
            getUserEmail().sendKeys(email);
            LOGGER.info("Entered the email: "+email);
        }catch (Exception e){
            LOGGER.error("Failed to enter the email.", e);
            throw e;
        }
    }

    public void enterLastName(String lastName){
        try{
            getLastName().sendKeys(lastName);
            LOGGER.info("Entered the last name: "+lastName);
        }catch (Exception e){
            LOGGER.error("Failed to enter the last name.", e);
            throw e;
        }
    }

    public void enterFirstName(String firstName){
        try{
            getFirstName().sendKeys(firstName);
            LOGGER.info("Entered the first name: "+firstName);
        }catch (Exception e){
            LOGGER.error("Failed to enter the first name.", e);
            throw e;
        }
    }

    public void clickOnAddButton(){
        try{
            getAddButton().click();
            LOGGER.info("Clicked on add button.");
        }catch (Exception e){
            LOGGER.error("Failed to click on add button.", e);
            throw e;
        }
    }

    public String readFirstNameText(){
        return getFirstNameText().getText();
    }

    public void clickOnWebTableMenu(){
        try{
            getWebTablesMenu().click();
            LOGGER.info("Clicked on Web Table Menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on menu.",e);
            throw e;
        }
    }

    public void enterSearch(String search){
        try{
            getSearchBox().sendKeys(search);
            LOGGER.info("Entered a key word in search box: " +search);
        }catch (Exception e){
            LOGGER.error("Failed to enter keyword '" + search + "' in the search box.", e);
            throw e;
        }
    }
}
