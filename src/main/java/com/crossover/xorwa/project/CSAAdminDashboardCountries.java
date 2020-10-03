package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSAAdminDashboardCountries {
    private static WebDriver driver;
    private By countries = By.xpath("/html/body/div/div/div/div[1]/div[8]/button");
    private By mappingSetDropdown = By.xpath("/html/body/div/div/div/div/div[2]/div/select");
    private By mappingSet = By.xpath("/html/body/div/div/div/div/div[2]/div/select/option[1]");
    private By countrySearch = By.id("text-filter-column-country.name");
    private By getCountrySearch = By.xpath("/html/body/div/div/div/div/div[3]/div/div[1]/table/tbody/tr/td[1]");
    private By regionDropdown = By.xpath("/html/body/div/div/div/div/div[3]/div/div[1]/table/tbody/tr[1]/td[2]/select");
    private By region = By.xpath("/html/body/div/div/div/div/div[3]/div/div[1]/table/tbody/tr/td[2]/select/option[3]");
    private By backButton = By.xpath("/html/body/div/div/div/div/div[1]/div[1]/button");

    public CSAAdminDashboardCountries(WebDriver driver){
        this.driver = driver;

    }

    public CSAAdminDashboardCountries clickCountriesButton(){
        driver.findElement(countries).click();
        return new CSAAdminDashboardCountries(driver);
    }

    public CSAAdminDashboardCountries clickMappingSetDropdown(){
        driver.findElement(mappingSetDropdown).click();
        return new CSAAdminDashboardCountries(driver);
    }

    public CSAAdminDashboardCountries mappingSetDropdownOption(){
        driver.findElement(mappingSet).isDisplayed();
        return new CSAAdminDashboardCountries(driver);
    }

    public void searchCountry(){
        driver.findElement(countrySearch).sendKeys("CZ");
    }

    public String getCountrySearchResult(){
        return driver.findElement(getCountrySearch).getText();
        //return new CSAAdminDashboardCountries(driver);
    }

    public CSAAdminDashboardCountries clickRegionDropdown(){
        driver.findElement(regionDropdown).click();
        return new CSAAdminDashboardCountries(driver);
    }

    public CSAAdminDashboardCountries setRegion(){
        driver.findElement(region).click();
        return new CSAAdminDashboardCountries(driver);
    }

    public CSAAdminDashboardCountries navigateBackToDashboard(){
        driver.findElement(backButton).click();
        return new CSAAdminDashboardCountries(driver);
    }
}
