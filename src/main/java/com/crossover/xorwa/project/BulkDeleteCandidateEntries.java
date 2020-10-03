package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BulkDeleteCandidateEntries extends CSAAdminDashboard{
    private WebDriver driver;
    private By checkedCheckbox = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/thead/tr/th[1]");
    private By bulkDelete = By.xpath("/html/body/div/div/div/div[1]/div[7]/button");
    private By bulkDeleteConfirmation = By.xpath("/html/body/div[3]/div/div/div[1]/div");
    private By confirmButton = By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");

    public BulkDeleteCandidateEntries(WebDriver driver){

        this.driver = driver;
    }

    public BulkDeleteCandidateEntries setCheckedCheckbox(){
        driver.findElement(checkedCheckbox).click();
        return new BulkDeleteCandidateEntries(driver);
    }
    public BulkDeleteCandidateEntries clickBulkDeleteButton(){
        driver.findElement(bulkDelete).click();
        return new BulkDeleteCandidateEntries(driver);
    }
    public String BulkDeleteConfirmationWindow(){
        return driver.findElement(bulkDeleteConfirmation).getText();
    }
    public BulkDeleteCandidateEntries clickConfirmButton(){
        driver.findElement(confirmButton).click();
        return new BulkDeleteCandidateEntries(driver);
    }

}
