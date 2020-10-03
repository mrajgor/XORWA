package base;

import com.crossover.xorwa.project.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {
    private WebDriver driver;
    protected CSAAdminLogin csaAdminLogin;
    protected CSAAdminDashboard csaAdminDashboard;
    protected CSAAdminCreateCandidate csaAdminCreateCandidate;
    protected CSACandidateCreatedSuccessfully csaCandidateCreatedSuccessfully;
    protected CSACandidateRecieveCrashCourseEmail csaCandidateRecieveCrashCourseEmail;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://stage.csa-assessment.crossover.com/admin/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        csaAdminLogin = new CSAAdminLogin(driver);
        csaAdminDashboard = new CSAAdminDashboard(driver);
        csaAdminCreateCandidate = new CSAAdminCreateCandidate(driver);
        csaCandidateCreatedSuccessfully = new CSACandidateCreatedSuccessfully(driver);
        csaCandidateRecieveCrashCourseEmail = new CSACandidateRecieveCrashCourseEmail(driver);



    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

   // public static void main(String args[]){
       // BaseTests test = new BaseTests();
    // test.setUp();
    //}
}
