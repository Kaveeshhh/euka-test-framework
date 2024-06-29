package com.euka.pages;

public class NameSelectionPage extends BasePage {
    private final String firstNameLocator = "//input[@name='firstName']";
    private final String lastNameLocator = "//input[@name='lastName']";
    private final String nextButtonLocator = "//button[text()='Next']";

    public NameSelectionPage() {
        super();
    }

    public void enterName(String firstName, String lastName) {
        page.locator(firstNameLocator).type(firstName);
        page.locator(lastNameLocator).type(lastName);
    }

    public void clickNext() {
        page.locator(nextButtonLocator).click();
    }
}
