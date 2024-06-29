package com.euka.pages;

public class LoginPage extends BasePage {
    private final String usernameLocator = "//input[@type='username']";
    private final String passwordLocator = "//input[@type='password']";
    private final String loginButtonLocator = "//button[text()='Log in']";

    public void login(String username, String password) {
        page.locator(usernameLocator).type(username);
        page.locator(passwordLocator).type(password);
        page.locator(loginButtonLocator).click();
    }
}