package com.demoqa.tests.alerts_frame_windows;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnAlertsFrameWindows();
    }

    @Test(groups = { "sanity1" })
    public void testNewTabButton(){
        alertsFrameWindows.clickOnBrowserWindows();
        alertsFrameWindows.clickOnWindowButton();
        Assert.assertEquals(homePage.getPageTitle(), "DEMOQA",
                "\n Actual & Expected title do not match. \n");
    }
}
