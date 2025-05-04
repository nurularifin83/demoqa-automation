package com.demoqa.tests.alerts_frame_windows;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModalDialogsPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnAlertsFrameWindows();
    }

    @Test(groups = { "sanity1" })
    public void testModalDialogs(){
        modalDialogsPage.clickOnModalDialogs();
        modalDialogsPage.clickOnShowLargeModal();
        modalDialogsPage.clickOnCloseButton();
        Assert.assertEquals(homePage.getPageTitle(), "DEMOQA",
                "\n Actual & Expected title do not match. \n");
    }
}
