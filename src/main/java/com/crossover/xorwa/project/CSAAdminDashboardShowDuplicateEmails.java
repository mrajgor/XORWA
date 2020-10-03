package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSAAdminDashboardShowDuplicateEmails {

    private static WebDriver driver;
    private By duplicateEmailsIcon = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[1]/tr/th[3]/div/div[2]/button");

    public CSAAdminDashboardShowDuplicateEmails(WebDriver driver){
        this.driver = driver;
    }

    public CSAAdminDashboardShowDuplicateEmails clickDuplicateEmailsIcon(){
        driver.findElement(duplicateEmailsIcon).click();
        return new CSAAdminDashboardShowDuplicateEmails(driver);
    }
}