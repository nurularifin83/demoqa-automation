package com.demoqa.tests.elements;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnElements();
    }

    @Test(groups = { "sanity1" })
    public void testClickOnButtons(){
        buttonsPage.clickOnButtonsMenu();
        buttonsPage.clickOnClickMeButton();
        Assert.assertEquals(buttonsPage.readTextClick(), "You have done a dynamic click",
                "\n  Actual & Expected text do not match. \n");
    }
}