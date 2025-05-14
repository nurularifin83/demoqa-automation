package com.demoqa.tests.widgets;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TabsPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnWidgets();
    }

    @Test(groups = { "sanity1" })
    public void testTabs(){
        tabsPage.clickOnTabsMenu();
        tabsPage.clickOnDemoTabUse();
        Assert.assertTrue(tabsPage.isTextVisible("It is a long established"), "Text 'It is a long established' should be present on the page.");
    }
}
