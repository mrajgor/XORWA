package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSAAdminDashboardPagingandSorting {
    private static WebDriver driver;

    private By filterButton = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody/tr/th[7]/div/button");
    private By clickFilterStatus = By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/div[2]");
    private By selectFilterStatusDisable = By.id("react-select-2-option-5");
    private By selectFilterStatusDeleted = By.id("react-select-2-option-6");
    private By saveFilterButton = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");


    private By creationDate = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/thead/tr/th[2]");
    private By candidateName = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/thead/tr/th[3]");
    private By candidateEmail = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/thead/tr/th[4]");
    private By testID = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/thead/tr/th[5]");
    private By assessmentID = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/thead/tr/th[6]");
    private By salesforceOrderID = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/thead/tr/th[7]");
    private By status = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/thead/tr/th[8]");
    private By nextPage = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[3]/ul/li[6]/a");
    private By lastPage = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[3]/ul/li[8]/a");
    private By previousPage = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[3]/ul/li[2]/a");
    private By firstPage = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[3]/ul/li[1]/a");
    private By paging10 = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[1]/ul/li[1]/span");
    private By paging25 = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[1]/ul/li[2]/a");
    private By paging30 = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[1]/ul/li[3]/a");
    private By paging50 = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[1]/ul/li[4]/a");

    public CSAAdminDashboardPagingandSorting(WebDriver driver){
        this.driver = driver;
    }

    public CSAAdminDashboardPagingandSorting clickFilterButton(){
        driver.findElement(filterButton).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting clickFilterStatusDropdown(){
        driver.findElement(clickFilterStatus).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }
    public CSAAdminDashboardPagingandSorting selectFilterValueDisable(){
        driver.findElement(selectFilterStatusDisable).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting selectFilterValueDeleted(){
        driver.findElement(selectFilterStatusDeleted).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting clickFilterSaveButton(){
        driver.findElement(saveFilterButton).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByCreationDate(){
        driver.findElement(creationDate).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByCandidateName(){
        driver.findElement(candidateName).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByCandidateEmail(){
        driver.findElement(candidateEmail).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByTestID(){
        driver.findElement(testID).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByAssessmentID(){
        driver.findElement(assessmentID).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortBySalesforceOrderID(){
        driver.findElement(salesforceOrderID).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByStatus(){
        driver.findElement(status).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByNextPage(){
        driver.findElement(nextPage).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByLastPage(){
        driver.findElement(lastPage).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByPreviousPage(){
        driver.findElement(previousPage).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting sortByFirstPage(){
        driver.findElement(firstPage).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting displayPaging10(){
        driver.findElement(paging10).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting displayPaging25(){
        driver.findElement(paging25).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting displayPaging30(){
        driver.findElement(paging30).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

    public CSAAdminDashboardPagingandSorting displayPaging50(){
        driver.findElement(paging50).click();
        return new CSAAdminDashboardPagingandSorting(driver);
    }

}
