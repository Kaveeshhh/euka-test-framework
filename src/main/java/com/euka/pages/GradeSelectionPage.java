package com.euka.pages;

public class GradeSelectionPage extends BasePage {
    private final String gradeDropdownLocator = "//p[contains(text(),'Euka Primary')]/following-sibling::div/select";
    private final String nextButtonLocator = "//button[text()='Next']";

    public GradeSelectionPage() {
        super();
    }

    public void selectGrade(String grade) {
        page.locator(gradeDropdownLocator).selectOption(grade);
    }
    public void clickNext() {
        page.locator(nextButtonLocator).click();
    }
}
