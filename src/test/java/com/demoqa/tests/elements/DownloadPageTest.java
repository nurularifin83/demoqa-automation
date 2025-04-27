package com.demoqa.tests.elements;

import com.demoqa.basetest.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPag(){
        homePage.clickOnElements();
    }

    @Test(groups = { "sanity1" })
    public void testDownloadButton(){
        downloadImagesPage.clickOnUploadAndDownload();
        downloadImagesPage.clickOnDownloadButton();
    }


}
