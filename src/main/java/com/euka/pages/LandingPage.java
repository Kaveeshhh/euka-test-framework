package com.euka.pages;

public class LandingPage extends BasePage {
    private final String manageProgramsCardLocator = "//p[text()='Manage Programs']";
    private final String lblWelcomeText = "//h2[text()='Welcome']";


    public LandingPage() {
        super();
    }

    public void clickManagePrograms() {
        page.locator(manageProgramsCardLocator).click();
    }

    public boolean verifyWelcomeText(){
        return page.locator(lblWelcomeText).isVisible();
    }

}
