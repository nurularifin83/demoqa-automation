package com.demoqa.tests.widgets;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnWidgets();
    }

    @Test(groups = { "sanity1" })
    public void testDatePicker(){
        datePickerPage.clickOnDatePickerMenu();
        datePickerPage.clickOnDatePickerMonthYearInput();
        datePickerPage.clickOnDateClicker();
        Assert.assertEquals(homePage.getPageTitle(), "DEMOQA",
                "\n Actual & Expected title do not match! \n");
    }
}
