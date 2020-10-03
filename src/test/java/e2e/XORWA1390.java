package e2e;

import Login.AdminLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class XORWA1390 extends AdminLogin {
    private WebDriver driver;

    @Test
    public void XORWA1390() throws InterruptedException {
<<<<<<< HEAD
        /*String csaCandidateCreatedSuccessfully = csaAdminDashboard.getEC2Status();
        sleep(2000);
        assertEquals(csaAdminDashboard.getEC2Status(),
                "ACTIVE", //PROVISIONED
=======
        String csaCandidateCreatedSuccessfully = csaAdminDashboard.getEC2Status();
        sleep(5000);
        assertEquals(csaAdminDashboard.getEC2Status(),
                "PROVISIONED",
>>>>>>> Initial commit
                "Candidate EC2 instance does not provisioned");
        System.out.println("Candidate EC2 instance PROVISIONED successfully");

        csaAdminDashboard.clickCandidateEntry();
        sleep(2000);

        csaAdminDashboard.clickPracticeAssessment();
        System.out.println("Candidate Practice Assessment page should open");
        sleep(2000);

        csaAdminDashboard.closeAssessmentLink();
        System.out.println("Candidate Practice Assessment page should be closed");
        sleep(5000);

        csaAdminDashboard.clickRealWorkAssessment();
        System.out.println("Candidate Real Work Assessment page should open");
        sleep(5000);

        csaAdminDashboard.closeAssessmentLink();
        System.out.println("Candidate Real Work Assessment page should be closed");
        sleep(5000);

        csaAdminDashboard.clickDeleteUserButton();
<<<<<<< HEAD
        sleep(5000);*/
=======
        sleep(5000);
>>>>>>> Initial commit

        csaAdminDashboard.clickFilterStatusButton();
        sleep(2000);
        csaAdminDashboard.filterStatusPopup();
        System.out.println("Status Filter popup window should open");
        sleep(2000);
        csaAdminDashboard.clickFilterStatusDropdown();
        sleep(5000);
        csaAdminDashboard.selectFilterValue();
        sleep(2000);
        csaAdminDashboard.clickFilterSaveButton();
        sleep(5000);
        csaAdminDashboard.getEC2Status();
        sleep(2000);
        assertEquals(csaAdminDashboard.getEC2Status(),
                "DELETED",
                "Candidate EC2 instance does not deleted");
        System.out.println("Candidate EC2 instance Deleted successfully");

        csaAdminDashboard.clickCandidateEntry();
<<<<<<< HEAD
        sleep(2000);
=======
        sleep(5000);
>>>>>>> Initial commit

        csaAdminDashboard.clickPracticeAssessment();
        System.out.println("Candidate Practice Assessment page should open");
        sleep(3000);
        csaAdminDashboard.getPracticeAssessment();
        sleep(5000);
        assertEquals(csaAdminDashboard.getPracticeAssessment(),
                "Thank you for taking our assessment. If you have not already done so, please submit your work using the Google Form. We aim to grade all submissions within 3 days. If you do not hear from us within a week, please contact Crossover Support.",
                "Deleted candidate can not be access Practice Assessment");
        System.out.println("Candidate can not be access Practice Assessment");
        sleep(5000);
        csaAdminDashboard.closeAssessmentLink();
        System.out.println("Candidate Practice Assessment page should be closed");
        sleep(5000);

        csaAdminDashboard.clickRealWorkAssessment();
        System.out.println("Candidate Real Work Assessment page should open");
        sleep(2000);
        csaAdminDashboard.getRealWorkAssessment();
        assertEquals(csaAdminDashboard.getRealWorkAssessment(),
                "Thank you for taking our assessment. If you have not already done so, please submit your work using the Google Form. We aim to grade all submissions within 3 days. If you do not hear from us within a week, please contact Crossover Support.",
                "Candidate can not be access Real Work Assessment");
        csaAdminDashboard.closeAssessmentLink();
        System.out.println("Candidate Real Work Assessment page should be closed");
        sleep(5000);
    }

}
