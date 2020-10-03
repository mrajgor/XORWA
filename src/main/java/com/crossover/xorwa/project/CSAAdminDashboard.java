package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CSAAdminDashboard {
    private WebDriver driver;
    private By statusAlert = By.xpath("//div[@class='col-md-4']/h2");
    private By statusColumn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/table/tbody[2]/tr[1]/td[8]/span");
    private By clickCandidateEntryFromdashboard = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[2]/tr[1]");
    private By practiceAssessment = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/table/tbody[2]/tr[2]/td/div/div/div/div/div[1]/div/div/div[6]/div[2]");
    private By realWorkAssessment = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/table/tbody[2]/tr[2]/td/div/div/div/div/div[1]/div/div/div[7]/div[2]");
    private By deleteUser = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/table/tbody[2]/tr[2]/td/div/div/div/div/div[1]/div/div/div[8]/div[2]/div/div/div[2]/button");
    private By statusPracticeAssessment = By.className("card-body");
    private By statusRealWorkAssessment = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/p");
    private By clickFilterButton = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody/tr/th[7]/div/button");
    private By getStatusFilterPopup = By.xpath("//*[@id=\"contained-modal-title-vcenter\"]");
    private By clickFilterStatus = By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/div[2]");
    private By selectFilterStatus = By.id("react-select-2-option-6");
    private By saveFilterButton = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");

    public CSAAdminDashboard(WebDriver driver){

        this.driver = driver;
    }

    public CSAAdminDashboard() {
    }

    public String getAlertText() {
       return driver.findElement(statusAlert).getText();
       // return getAlertText();
    }

    public String getEC2Status(){

        return driver.findElement(statusColumn).getText();
    }

    public CSAAdminDashboard clickCandidateEntry() {
        driver.findElement(clickCandidateEntryFromdashboard).click();
        return new CSAAdminDashboard(driver);
    }

    public CSAAdminDashboard clickPracticeAssessment(){
        driver.findElement(practiceAssessment).click();
        return new CSAAdminDashboard(driver);
    }

    public CSAAdminDashboard clickRealWorkAssessment(){
        driver.findElement(realWorkAssessment).click();
        return new CSAAdminDashboard(driver);
    }

    public CSAAdminDashboard clickDeleteUserButton(){
        driver.findElement(deleteUser).click();
        return new CSAAdminDashboard(driver);
    }

    public CSAAdminDashboard clickFilterStatusButton(){
        driver.findElement(clickFilterButton).click();
        return new CSAAdminDashboard(driver);
    }

    public String filterStatusPopup(){
        return driver.findElement(getStatusFilterPopup).getText();
    }

    public CSAAdminDashboard clickFilterStatusDropdown(){
        driver.findElement(clickFilterStatus).click();
        return new CSAAdminDashboard(driver);
    }

    public CSAAdminDashboard selectFilterValue(){
        driver.findElement(selectFilterStatus).click();
        return new CSAAdminDashboard(driver);
    }

    public CSAAdminDashboard clickFilterSaveButton(){
        driver.findElement(saveFilterButton).click();
        return new CSAAdminDashboard(driver);
    }

    public String getPracticeAssessment(){

        return driver.findElement(statusPracticeAssessment).getText();
    }

    public String getRealWorkAssessment(){
        return driver.findElement(statusRealWorkAssessment).getAttribute("Thank you for taking our assessment. If you have not already done so, please submit your work using the Google Form. We aim to grade all submissions within 3 days. If you do not hear from us within a week, please contact Crossover Support.");
    }

    public void closeAssessmentLink(){
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
        driver.close();
        driver.switchTo().window(handlesList.get(0));

        /*Actions action = new Actions(driver);
        // close the newly opened tab
        action.keyDown(Keys.CONTROL).sendKeys("w").perform();
        // switch back to original
        action.keyDown(Keys.CONTROL).sendKeys("1").perform();*/
    }
    
}
