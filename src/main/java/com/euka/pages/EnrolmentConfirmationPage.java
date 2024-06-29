package com.euka.pages;

public class EnrolmentConfirmationPage extends BasePage {
    private final String nextButtonLocator = "//button[text()='Next']";
    private final String studentNameLocator = "//p[text()='Enrolled to']/following-sibling::p";
    private final String startingCourseLocator = "//p[text()='Starting course']/following-sibling::p";

    public EnrolmentConfirmationPage() {
        super();
    }

    public void clickNext() {
        page.locator(nextButtonLocator).click();
    }

    public String getStudentName() {
        return page.locator(studentNameLocator).innerText();
    }

    public String getStartingCourse() {
        return page.locator(startingCourseLocator).innerText();
    }
}
