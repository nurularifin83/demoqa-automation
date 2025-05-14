package com.demoqa.tests.widgets;

import com.demoqa.basetest.BaseTest;
import com.demoqa.utils.JavaScriptUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgressBarPageTest extends BaseTest {

    private JavaScriptUtils scriptUtils;

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnWidgets();
    }

    @Test(groups = { "sanity1" })
    public void testProgressBar(){
        progressBarPage.clickOnProgressBarMenu();
        progressBarPage.clickOnResetButton();
        Assert.assertEquals(homePage.getPageTitle(), "DEMOQA",
                "\n Actual & Expected title do not match. \n");
    }
}
