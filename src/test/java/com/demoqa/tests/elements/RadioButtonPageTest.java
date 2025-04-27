package com.demoqa.tests.elements;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnElements();
    }

    @Test(groups = { "sanity1" })
    public void testClickOnRadioButtonMenu(){
        radioButtonPage.clickOnRadioButtonMenu();
        radioButtonPage.clickOnImpressiveRadio();
        Assert.assertEquals(radioButtonPage.readImpressiveText(), "Impressive",
                "\n Actual & Expected text do not match. \n");
    }
}