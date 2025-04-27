package com.demoqa.tests.elements;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnElements();
    }

    @Test(groups = { "sanity1" })
    public void testTextBox(){
        textBoxPage.clickOnTextBoxMenu();
        textBoxPage.enterFullName("Nurul Arifin");
        textBoxPage.enterEmail("nurularifin@gmail.com");
        textBoxPage.enterCurrentAddress("Jl. Persada I no. 27, Jakarta Selatan.");
        textBoxPage.enterPermanentAddress("Jl. Persada I no. 27, Jakarta Selatan.");
        textBoxPage.clickOnSubmitButton();
        Assert.assertTrue(textBoxPage.pElementIsDisplayed(), "Element is not available.");
    }
}