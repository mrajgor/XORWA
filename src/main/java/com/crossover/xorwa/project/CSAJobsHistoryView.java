package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSAJobsHistoryView {
    private static WebDriver driver;
    private By jobsHistory = By.xpath("/html/body/div/div/div/div[1]/div[4]/button");
    private By jobsHistoryPage = By.xpath("/html/body/div/div/div/div[1]/div[2]/h2");
    private By byAssessmentID = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[1]/tr/th[4]/label/input");

    public CSAJobsHistoryView(WebDriver driver){
        this.driver = driver;
    }

    public CSAJobsHistoryView clickJobsButton(){
        driver.findElement(jobsHistory).click();
        return new CSAJobsHistoryView(driver);
    }

    public CSAJobsHistoryView getJobsHistoryPage(){
        driver.findElement(jobsHistoryPage).getText();
        return new CSAJobsHistoryView(driver);
    }

    public CSAJobsHistoryView filterByAssessmentID(){
        driver.findElement(byAssessmentID).sendKeys("mqa");
        return new CSAJobsHistoryView(driver);

    }
}
