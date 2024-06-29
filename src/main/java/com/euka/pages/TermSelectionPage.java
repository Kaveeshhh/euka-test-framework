package com.euka.pages;

import com.microsoft.playwright.Locator;

public class TermSelectionPage extends BasePage {
    private final String ddTerm = "//div[contains(@data-tracking-id,'Term')]//input";
    private final String nextButtonLocator = "//button[text()='Next']";

    public TermSelectionPage() {
        super();
    }

    public void selectTerm(String term) {
        page.locator(ddTerm).type(term);
        page.keyboard().press("Enter");
    }
    public void clickNext() {
        page.locator(nextButtonLocator).click();
    }
}
