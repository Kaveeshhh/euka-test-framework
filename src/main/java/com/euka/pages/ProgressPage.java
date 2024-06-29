package com.euka.pages;

public class ProgressPage extends BasePage{
    private final String nextButtonLocator = "//button[text()='Next']";

    public ProgressPage() {
        super();
    }

    public void clickNext() {
        page.locator(nextButtonLocator).click();
    }
}
