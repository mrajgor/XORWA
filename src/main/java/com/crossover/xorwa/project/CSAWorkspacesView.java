package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSAWorkspacesView {
    private static WebDriver driver;
    private By workspacesButton = By.xpath("/html/body/div/div/div/div[1]/div[2]/button");
    private By workspacesPage = By.className("text-center");
    private By filterByAsiaRegion = By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/a");
    private By filterByEuropeRegion = By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[1]/div/div[3]/a");
    private By filterByUSRegion = By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[1]/div/div[4]/a");
    private By filterByAllRegion = By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[1]/div/div[1]/a");
    private By filterByMQAAssessment = By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div[2]/a");
    private By filterByPCAAssessment = By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div[3]/a");
    private By filterBySEAssessment = By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div[4]/a");
    private By filterByAllAssessments = By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div[1]/a");

    public CSAWorkspacesView(WebDriver driver){
        this.driver = driver;
    }

    public CSAWorkspacesView clickWorkspacesButton(){
        driver.findElement(workspacesButton).click();
        return new CSAWorkspacesView(driver);
    }

    public CSAWorkspacesView getWorkspacesPage(){
        driver.findElement(workspacesPage).getText();
        return new CSAWorkspacesView(driver);
    }

    public CSAWorkspacesView clickFilterByAsiaRegion() {
        driver.findElement(filterByAsiaRegion).click();
        return new CSAWorkspacesView(driver);
    }

    public CSAWorkspacesView clickFilterByEuropeRegion(){
        driver.findElement(filterByEuropeRegion).click();
        return new CSAWorkspacesView(driver);
    }

    public CSAWorkspacesView clickFilterByUSRegion() {
        driver.findElement(filterByUSRegion).click();
        return new CSAWorkspacesView(driver);
    }

    public CSAWorkspacesView clickFilterByAllRegion() {
        driver.findElement(filterByAllRegion).click();
        return new CSAWorkspacesView(driver);
    }

    public CSAWorkspacesView clickFilterByMQAAssessment() {
        driver.findElement(filterByMQAAssessment).click();
        return new CSAWorkspacesView(driver);
    }

    public CSAWorkspacesView clickFilterByPCAAssessment() {
        driver.findElement(filterByPCAAssessment).click();
        return new CSAWorkspacesView(driver);
    }

    public CSAWorkspacesView clickFilterBySEAssessment() {
        driver.findElement(filterBySEAssessment).click();
        return new CSAWorkspacesView(driver);
    }

    public CSAWorkspacesView clickFilterByAllAssessments() {
        driver.findElement(filterByAllAssessments).click();
        return new CSAWorkspacesView(driver);
    }

}
