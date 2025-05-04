package com.demoqa.tests.widgets;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccordionPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnWidgets();
    }

    @Test(groups = { "sanity1" })
    public void testAccordian(){
        accordionPage.clickOnAccordion();
        accordionPage.clickOnSection2Heading();
        Assert.assertEquals(homePage.getPageTitle(), "DEMOQA",
                "\n Actual & expected title do not match. \n");
    }
}
