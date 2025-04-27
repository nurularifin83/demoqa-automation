package com.demoqa.tests.forms;

import com.demoqa.basetest.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUpPage(){
        homePage.clickOnForms();
    }

    @Test(groups = { "sanity1" })
    public void testPracticeForm(){
        practiceForm.clickOnPracticeFormMenu();
        practiceForm.inputFirstName("Nurul");
        practiceForm.inputLastName("Arifin");
        practiceForm.inputUserEmail("nurularifin837@gmail.com");
        practiceForm.clickOnGender();
        practiceForm.inputUserNumber("92908789090");
        practiceForm.clickOnDateOfBirthInput();
        practiceForm.clickOnDate();
        practiceForm.inputSubjects("dkjashds ahdjash djksahkj dhsadsa");
        practiceForm.clickOnHobbies();
        practiceForm.inputCurrentAddress("Jl. Persada I No. 27");
        practiceForm.clickOnSubmit();
    }
}