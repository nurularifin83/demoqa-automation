package com.demoqa.pages.elements;

import com.demoqa.base.BasePage;
import com.demoqa.utils.JavaScriptUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage extends BasePage {

    // Call utils
    private JavaScriptUtils scriptUtils;

    //Constructors
    public DownloadPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        scriptUtils = new JavaScriptUtils(driver);
    }

    // Select web element
    @FindBy(xpath = "//li[@id='item-7']//span[text()='Upload and Download']")
    private WebElement uploadAndDownload;

    @FindBy(xpath =  "//a[text()='Download']")
    private WebElement downloadButton;

    // Getter
    public WebElement getDownloadButton(){
        customWait.waitForVisibilityOfElement(downloadButton);
        return downloadButton;
    }

    public WebElement getUploadAndDownload(){
        customWait.waitForVisibilityOfElement(uploadAndDownload);
        return uploadAndDownload;
    }

    // Page actions
    public void clickOnDownloadButton(){
        try{
            getUploadAndDownload().click();
            LOGGER.info("Clicked on Download Button.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Donwload Button.", e);
            throw e;
        }
    }

    public void clickOnUploadAndDownload(){
        try{
            getUploadAndDownload().click();
            LOGGER.info("Clicked on Upload And Download menu.");
        }catch (Exception e){
            LOGGER.error("Failed to click on Upload And Download.", e);
            throw e;
        }
    }
}
