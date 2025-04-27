package com.demoqa.tests.elements;

import com.demoqa.basetest.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesPageTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnElements();
    }

    @Test(groups = { "sanity" })
    public void testSearchBox(){
        webTablesPage.clickOnWebTableMenu();
        webTablesPage.enterSearch("Alden");
        Assert.assertEquals(webTablesPage.readFirstNameText(), "Alden",
                "\n Actual & Expected text do not match. \n");
    }

    @Test(groups = { "sanity1" })
    public void testRegistrationForm(){
        webTablesPage.clickOnWebTableMenu();
        webTablesPage.clickOnAddButton();
        webTablesPage.enterFirstName("Nurul");
        webTablesPage.enterLastName("Lijah");
        webTablesPage.enterEmail("nurullijah@gmail.com");
        webTablesPage.enterAge("32");
        webTablesPage.enterSalary("5000000");
        webTablesPage.enterDepartment("Finance");
        webTablesPage.clickOnSubmitButton();
        Assert.assertEquals(webTablesPage.readDepartmentText(),"Finance",
                "\n Actual & Expected text do not match. \n");
    }
}