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
<<<<<<< HEAD
=======
    protected BulkDeleteCandidateEntries bulkDeleteCandidateEntries;
    protected CSAProctorViewDashboard csaProctorViewDashboard;
    protected CSAAdminDashboardCountries csaAdminDashboardCountries;
    protected CSAWorkspacesView csaWorkspacesView;
    protected CSAJobsHistoryView csaJobsHistoryView;
    protected CSAEC2UsageView csaec2UsageView;
    protected CSAAdminDashboardShowDuplicateEmails csaAdminDashboardShowDuplicateEmails;
    protected CSAAdminFilterCandidateDetails csaAdminFilterCandidateDetails;
    protected CSAAdminDashboardPagingandSorting csaAdminDashboardPagingandSorting;
    protected CSACandidateRDPInstance csaCandidateRDPInstance;
>>>>>>> Initial commit

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
<<<<<<< HEAD



=======
        bulkDeleteCandidateEntries = new BulkDeleteCandidateEntries(driver);
        csaProctorViewDashboard = new CSAProctorViewDashboard(driver);
        csaAdminDashboardCountries = new CSAAdminDashboardCountries(driver);
        csaWorkspacesView = new CSAWorkspacesView(driver);
        csaJobsHistoryView = new CSAJobsHistoryView(driver);
        csaec2UsageView = new CSAEC2UsageView(driver);
        csaAdminDashboardShowDuplicateEmails = new CSAAdminDashboardShowDuplicateEmails(driver);
        csaAdminFilterCandidateDetails = new CSAAdminFilterCandidateDetails(driver);
        csaAdminDashboardPagingandSorting = new CSAAdminDashboardPagingandSorting(driver);
        csaCandidateRDPInstance = new CSACandidateRDPInstance(driver);
>>>>>>> Initial commit
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
