package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CSACandidateRDPInstance extends CSAAdminCreateCandidate {
    private static WebDriver driver;
    private By assessmentTypeField = By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/select/option[1]");
    private By firstnameField = By.name("firstName");
    private By lastnameField = By.name("lastName");
    private By emailField = By.name("mail");
    private By orderidField = By.name("order");
    private By countryField = By.name("country");
    private By createButton = By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[7]/div[1]/div/button");
    public By clickCandidateEntry = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[2]/tr[1]");
    public By refresh = By.xpath("/html/body/div/div/div/div[1]/div[9]/button");
    private int orderid;

        public CSACandidateRDPInstance(WebDriver driver) {
            this.driver = driver;
        }

        public CSACandidateRDPInstance clickAssessmentTypeField() {
            driver.findElement(assessmentTypeField).click();
            return new CSACandidateRDPInstance(driver);
        }

        public void selectAssessmentTypeField(String assessmentType) {
            findAssessmentType().selectByVisibleText(assessmentType);
        }

        public List<String> getAssessmentTypeField() {
            List<WebElement> selectedElements = findAssessmentType().getAllSelectedOptions();
            return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
        }

        public Select findAssessmentType() {

            return new Select(driver.findElement(assessmentTypeField));
        }

        public void setFirstnameField(String firstname) {

            driver.findElement(firstnameField).sendKeys(firstname);
        }

        public void setLastnameField(String lastname) {

            driver.findElement(lastnameField).sendKeys(lastname);
        }

        public void setEmailField(String email) {

            driver.findElement(emailField).sendKeys(email);
        }

        public void setOrderidField(String orderid) {
            Date d = new Date(System.currentTimeMillis());
            driver.findElement(orderidField).sendKeys("orderid" + d);
        }

        public void setCountryField(String country) {

            driver.findElement(countryField).sendKeys(country);
        }

        public CSACandidateRDPInstance clickCreateCandidateButton() {
            driver.findElement(createButton).click();
            return new CSACandidateRDPInstance(driver);
        }

        public CSACandidateRDPInstance clickCandidateEntryDashboard() {
            driver.findElement(clickCandidateEntry).click();
            return new CSACandidateRDPInstance(driver);
        }

        public CSACandidateRDPInstance clickRefreshButton() {
            driver.findElement(refresh).click();
            return new CSACandidateRDPInstance(driver);
        }
}