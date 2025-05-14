package com.demoqa.tests.widgets;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnWidgets();
    }

    @Test(groups = { "sanity1" })
    public void testSlider(){
        sliderPage.clickOnSliderMenu();
        sliderPage.moveSlider();
        sliderPage.getSliderValue();
        Assert.assertEquals(homePage.getPageTitle(), "DEMOQA",
                "\n Actual and Expected do not match! \n");
    }
}
