package com.demoqa.tests.elements;

import com.demoqa.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksImagesTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnElements();
    }

    @Test(groups = { "sanity1" })
    public void testValidLink(){
        brokenLinksImages.clickOnBrokenLinksImages();
        brokenLinksImages.clickOnValidLink();
        Assert.assertEquals(homePage.getPageTitle(), "DEMOQA",
                "\n Actual & Expected title do not match. \n");
    }
}
