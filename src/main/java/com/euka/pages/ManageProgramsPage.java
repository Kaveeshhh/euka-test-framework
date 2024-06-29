package com.euka.pages;

public class ManageProgramsPage extends BasePage {
    private final String completeEnrolmentButtonLocator = "(//p[text()='Complete enrolment'])[1]";

//    public ManageProgramsPage() {
//        super();
//    }

    public void clickCompleteEnrolment() {
        page.locator(completeEnrolmentButtonLocator).click();
    }
}
