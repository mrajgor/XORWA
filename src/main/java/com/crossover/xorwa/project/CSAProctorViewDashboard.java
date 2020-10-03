package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CSAProctorViewDashboard {
    private WebDriver driver;
    private By email = By.id("text-filter-column-email");
    private By startAssignment = By.xpath("/html/body/div/div/div/div[2]/div/div[3]/div/button");
    private By statusActive = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[2]/tr[1]/td[8]");
    private By statusCloudWatchActive = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[2]/tr[1]/td[8]");
    private By refreshButton = By.xpath("/html/body/div/div/div/div[1]/div[9]/button");

    public CSAProctorViewDashboard(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail() {
        driver.findElement(email).sendKeys("monali.rajgor@aurea.com");
    }

    public CSAProctorViewDashboard startAssignmentButton() {
        driver.findElement(startAssignment).click();
        return new CSAProctorViewDashboard(driver);
    }

    public void closeAssessmentLink() {
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
        driver.close();
        driver.switchTo().window(handlesList.get(0));
    }

    public CSAProctorViewDashboard targetStatusActive() {
        driver.findElement(statusActive).getText();
        return new CSAProctorViewDashboard(driver);
    }

    public CSAProctorViewDashboard clickRefreshButton() {
        driver.findElement(refreshButton).click();
        return new CSAProctorViewDashboard(driver);
    }

    public CSAProctorViewDashboard targetStatusCLOUDWATCHACTIVE(){
        driver.findElement(statusCloudWatchActive).getText();
        return new CSAProctorViewDashboard(driver);
    }
}

