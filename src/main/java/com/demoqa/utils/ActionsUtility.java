package com.demoqa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility {

    // Variable
    private WebDriver driver;
    private Actions actions;

    // Constructors
    public ActionsUtility(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    // Click and drag
    public void dragAndDropBy(WebElement source, int x, int y){
        actions.dragAndDropBy(source, x, y).perform();
    }

    // For click hold and release
    public void clickAndHold(WebElement source, int x, int y){
        actions.clickAndHold(source).moveByOffset(x, y).release().perform();
        // xample:
        /*actions.clickAndHold(slider)
                .moveByOffset(50, 0)
                .release()
                .perform();*/
    }

    // Hover
    public void hover(WebElement source){
        actions.moveToElement(source).perform();
    }

    // Send values to textfield
    public void sendKeys(WebElement source, CharSequence keys){
        actions.sendKeys(source, keys).perform();
    }
}
