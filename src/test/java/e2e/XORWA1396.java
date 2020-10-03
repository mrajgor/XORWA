package e2e;

import Login.AdminLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;


public class XORWA1396 extends AdminLogin {
    private WebDriver driver;

    @Test
    public void XORWA1396() throws InterruptedException{

        csaWorkspacesView.clickWorkspacesButton();
        sleep(5000);
        System.out.println("Admin user clicked on Workspaces button");

        /*csaWorkspacesView.getWorkspacesPage();
        sleep(5000);
        assertEquals(csaWorkspacesView.getWorkspacesPage(),
                "Workspace Pool",
                "Worksapce Pool page Title does not verified ");
        System.out.println("The Admin user should navigate to the Workspaces Pool page");*/

        csaWorkspacesView.clickFilterByAsiaRegion();
        sleep(5000);
        System.out.println("The Admin user should get the registered candidate workspace status and should able to filter by Asia Region");

        csaWorkspacesView.clickFilterByEuropeRegion();
        sleep(5000);
        System.out.println("The Admin user should get the registered candidate workspace status and should able to filter by Europe Region");

        csaWorkspacesView.clickFilterByUSRegion();
        sleep(5000);
        System.out.println("The Admin user should get the registered candidate workspace status and should able to filter by US Region");

        csaWorkspacesView.clickFilterByAllRegion();
        sleep(5000);
        System.out.println("The Admin user should get the registered candidate workspace status and should able to filter by All Region");

        csaWorkspacesView.clickFilterByMQAAssessment();
        sleep(5000);
        System.out.println("The Admin user should get the MQA pipeline registered candidates workspace status filter by MQA Assessments");

        csaWorkspacesView.clickFilterByPCAAssessment();
        sleep(5000);
        System.out.println("The Admin user`2 should get the PCA pipeline registered candidates workspace status filter by PCA Assessments");

        csaWorkspacesView.clickFilterBySEAssessment();
        sleep(5000);
        System.out.println("The Admin user should get the SE/SA pipeline registered candidates workspace status filter by SE Assessments");

        csaWorkspacesView.clickFilterByAllAssessments();
        sleep(5000);
        System.out.println("The Admin user should get the All pipelines registered candidates workspace status filter by All Assessments");

    }
}
