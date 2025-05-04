package com.demoqa.tests.widgets;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoCompletePageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnWidgets();
    }

    @Test(groups = { "sanity1" })
    public void testAutoComplete(){
        autoCompletePage.clickOnAutoComplete();
        autoCompletePage.enterMultipleColorNames("Red");
        Assert.assertEquals(homePage.getPageTitle(), "DEMOQA",
                "\n Actual & Expected text do not match! \n");
    }
}
