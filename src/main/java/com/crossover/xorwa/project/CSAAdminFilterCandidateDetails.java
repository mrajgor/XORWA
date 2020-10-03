package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSAAdminFilterCandidateDetails {
    private static WebDriver driver;
    private By filterByCreationDate = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[1]/tr/th[1]/div/button");
    private By creationDateFilter = By.xpath("/html/body/div[3]/div/div/div[1]/div");
    private By startDate = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/input");
    private By enterStartDate = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/input");
    private By endDate = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/input");
    private By enterEndDate = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/input");
    private By saveButton = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private By candidateName = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[1]/tr/th[2]/label/input");
    private By candidateEmail = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[1]/tr/th[3]/div/div[1]/label/input");
    private By testID = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[1]/tr/th[4]/label/input");
    private By assessmentID = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[1]/tr/th[5]/label/input");
    private By salesforceOrderId = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[1]/tr/th[6]/label/input");
    private By filterButton = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody/tr/th[7]/div/button");
    private By clickFilterStatus = By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/div[2]");
    private By selectFilterStatusDisable = By.id("react-select-2-option-5");
    private By selectFilterStatusDeleted = By.id("react-select-2-option-6");
    private By saveFilterButton = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");

    public CSAAdminFilterCandidateDetails(WebDriver driver) {
        this.driver = driver;
    }

    public CSAAdminFilterCandidateDetails clickFilterByCreationDate(){
        driver.findElement(filterByCreationDate).click();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails getCreationDateFilter(){
        driver.findElement(creationDateFilter).getText();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clickStartDate(){
        driver.findElement(startDate).click();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails setStartDate(){
        driver.findElement(enterStartDate).sendKeys("01/01/2021");
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clickEndDate(){
        driver.findElement(endDate).click();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails setEndDate(){
        driver.findElement(enterEndDate).sendKeys("12/01/2021");
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clickSaveButton(){
        driver.findElement(saveButton).click();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails setCandidateName(){
        driver.findElement(candidateName).sendKeys("Monali");
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clearCandidateName(){
        driver.findElement(candidateName).clear();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails setCandidateEmail(){
        driver.findElement(candidateEmail).sendKeys("monali.rajgor@aurea.com");
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clearCandidateEmail(){
        driver.findElement(candidateEmail).clear();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails setTestId(){
        driver.findElement(testID).sendKeys("mqa_assessment_v1");
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clearTestId(){
        driver.findElement(testID).clear();
        return new CSAAdminFilterCandidateDetails(driver);
    }
    public CSAAdminFilterCandidateDetails setAssessmentID(){
        driver.findElement(assessmentID).sendKeys("f6da0b57-2216-41b8-a23a-7432f75c3a98");
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clearAssessmentID(){
        driver.findElement(assessmentID).clear();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails setSalesforceOrderId(){
        driver.findElement(salesforceOrderId).sendKeys("1602095303");
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clearSalesforceOrderId(){
        driver.findElement(salesforceOrderId).clear();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clickFilterButton(){
        driver.findElement(filterButton).click();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clickFilterStatusDropdown(){
        driver.findElement(clickFilterStatus).click();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails selectFilterValueDisable(){
        driver.findElement(selectFilterStatusDisable).click();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails selectFilterValueDeleted(){
        driver.findElement(selectFilterStatusDeleted).click();
        return new CSAAdminFilterCandidateDetails(driver);
    }

    public CSAAdminFilterCandidateDetails clickFilterSaveButton(){
        driver.findElement(saveFilterButton).click();
        return new CSAAdminFilterCandidateDetails(driver);
    }

}
