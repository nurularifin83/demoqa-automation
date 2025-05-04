package com.demoqa.tests.alerts_frame_windows;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnAlertsFrameWindows();
    }

    @Test(groups = { "sanity1" })
    public void testAlertsPage(){
        alertsPage.clickOnAlerts();
        alertsPage.clickOnAlertButton();
        Assert.assertEquals(homePage.getPageTitle(), "",
                "\n Actual & Expected page do not match! \n");
    }
}
