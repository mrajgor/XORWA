package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSAAdminCreateCandidate extends CSAAdminDashboard{
    private static WebDriver driver;
    private By registerCandidate = By.xpath("/html/body/div/div/div/div[1]/div[1]/button");
    private By statusRegisterCandidate = By.xpath("/html/body/div/div/div/div/div/div/div/div/h4");

    public CSAAdminCreateCandidate(WebDriver driver) {

        this.driver = driver;
    }

    public CSAAdminCreateCandidate() {
    }

    public CSACandidateCreatedSuccessfully clickCreateButton(){
        driver.findElement(registerCandidate).click();
        return new CSACandidateCreatedSuccessfully(driver);
    }

    public String getStatusRegisterCandidate() {

        return driver.findElement(statusRegisterCandidate).getText();
    }

}
