package com.demoqa.tests.widgets;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTipsPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnWidgets();
    }

    @Test(groups = { "sanity1" })
    public void testToolTips(){
        toolTipsPage.clickOnToolTipsMenu();
        toolTipsPage.hoverToToolTipButton();
        Assert.assertTrue(toolTipsPage.isAttributePresent(), "Is not present!");
    }
}
