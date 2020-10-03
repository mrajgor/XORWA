package e2e;

import Login.ProctorLogin;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class XORWA1394 extends ProctorLogin {
    @Test
    public void proctorView() throws InterruptedException {
        csaProctorViewDashboard.setEmail();
        System.out.println("Proctor is able to search candidate entry by 'Email'");
        sleep(5000);

        assertEquals(csaAdminDashboard.getEC2Status(),
                "PROVISIONED",
                "Candidate EC2 instance does not provisioned");
        System.out.println("Candidate EC2 instance PROVISIONED successfully");

        csaAdminDashboard.clickCandidateEntry();
        sleep(2000);

        csaAdminDashboard.clickRealWorkAssessment();
        System.out.println("Candidate Real Work Assessment page should open");
        sleep(10000);

        csaProctorViewDashboard.startAssignmentButton();
        System.out.println("Candidate has started the Real Work Assessment");
        sleep(5000);

        csaProctorViewDashboard.closeAssessmentLink();
        System.out.println("Candidate Real Work Assessment page should be closed");
        sleep(5000);

        assertEquals(csaProctorViewDashboard.targetStatusActive(),
                "ACTIVE",
                "Target Status ACTIVE does not verified");
        System.out.println("Target Status ACTIVE is verified");
        sleep(20000);

        csaProctorViewDashboard.clickRefreshButton();
        System.out.println("Page is refreshed");
        sleep(5000);

        assertEquals(csaProctorViewDashboard.targetStatusCLOUDWATCHACTIVE(),
                "CLOUD_WATCH_ACTIVE",
                "Target Status CLOUD_WATCH_ACTIVE does not verified");
        System.out.println("Target Status CLOUD_WATCH_ACTIVE is verified");
        sleep(5000);
    }
}
