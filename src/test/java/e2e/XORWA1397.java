package e2e;

import Login.AdminLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class XORWA1397 extends AdminLogin {
    private WebDriver driver;

    @Test
    public void XORWA1397() throws InterruptedException {

        csaJobsHistoryView.clickJobsButton();
        sleep(5000);
        System.out.println("Admin user clicked on Jobs button");

        /*csaJobsHistoryView.getJobsHistoryPage();
        sleep(5000);
        assertEquals(csaJobsHistoryView.getJobsHistoryPage(),
                "Jobs History",
                "Jobs History page Title does not verified ");
        System.out.println("The Admin user should navigate to the Jobs History page");*/

        csaJobsHistoryView.filterByAssessmentID();
        sleep(5000);
        System.out.println("The Admin user should get the executed jobs details \"Creation Date\", \"Completion Date\", \"Job Name\", \"Assessment ID\", \"Active Pods\", \"Failed Pods\", \"Succeeded Pods\", \"Status\" and \"Total Count of executed jobs\"");
    }

}
