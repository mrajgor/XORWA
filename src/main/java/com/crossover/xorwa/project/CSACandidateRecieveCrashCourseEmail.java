package com.crossover.xorwa.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CSACandidateRecieveCrashCourseEmail {
    private static WebDriver driver;

    public CSACandidateRecieveCrashCourseEmail(WebDriver driver){this.driver = driver;}

   public CSACandidateRecieveCrashCourseEmail candidateReceivedCrashCourseEmail() throws InterruptedException {

        driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");

        driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
        driver.findElement(By.className("VfPpkd-RLmnJb")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("test1234");
        Thread.sleep(3000);
        driver.findElement(By.className("VfPpkd-RLmnJb")).click();
        System.out.println("Title of Page: " + driver.getCurrentUrl());
        Thread.sleep(3000);
        List<WebElement> unreademail = driver.findElements(By.className("aio UKr6le"));

        //System.out.println("Total No. of Unread Mails: " + unreademail.size());

        for(int i=0;i<unreademail.size();i++){

            System.out.println(unreademail.get(i).getText());

        }

        unreademail.get(1).click();
        Thread.sleep(3000);
        return new CSACandidateRecieveCrashCourseEmail(driver);
    }

    }
