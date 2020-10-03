package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSAEC2UsageView {
    private static WebDriver driver;
    private By ec2Button = By.xpath("/html/body/div/div/div/div[1]/div[6]/button");
    private By environmentUsagePage = By.xpath("/html/body/div/div/div/div[1]/div[2]/h2");
    private By filterByEmail = By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[1]/tr/th[3]/label/input");

    public CSAEC2UsageView (WebDriver driver){
        this.driver = driver;
    }

    public CSAEC2UsageView clickec2Button(){
        driver.findElement(ec2Button).click();
        return new CSAEC2UsageView(driver);
    }

    public CSAEC2UsageView getEnvironmentUsagePage(){
        driver.findElement(environmentUsagePage).getText();
        return new CSAEC2UsageView(driver);
    }

    public CSAEC2UsageView filterEnvironmentByEmail(){
        driver.findElement(filterByEmail).sendKeys("monali.rajgor@aurea.com");
        return new CSAEC2UsageView(driver);

    }

}
