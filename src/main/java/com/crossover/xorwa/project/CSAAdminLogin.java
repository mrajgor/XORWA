package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSAAdminLogin {

    private WebDriver driver;
    private By usernameField = By.name("login");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/form/div[3]/button");

    public CSAAdminLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){

        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }

    public CSAAdminDashboard clickLoginButton(){
        driver.findElement(loginButton).click();
        return new CSAAdminDashboard(driver);
    }

}
