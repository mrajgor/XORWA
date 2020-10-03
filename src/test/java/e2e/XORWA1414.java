package e2e;

import Login.AdminLogin;
import com.crossover.xorwa.project.CSACandidateCreatedSuccessfully;
import com.crossover.xorwa.project.CSACandidateRDPInstance;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XORWA1414 extends AdminLogin {
    @Test
    public void csaCandidateRDPInstance() throws InterruptedException {
    CSACandidateCreatedSuccessfully csaCandidateRDPInstance = csaAdminCreateCandidate.clickCreateButton();
    sleep(2000);
    assertEquals(csaAdminCreateCandidate.getStatusRegisterCandidate(),
                "Create Canidate",
                        "Create Candidate page title does not verified");
        System.out.println("Create Candidate page title is verified");

        csaCandidateRDPInstance.clickAssessmentTypeField();
    sleep(2000);
    String assessmentType = "mqa_assessment_v2";
        csaCandidateRDPInstance.selectAssessmentTypeField(assessmentType);
    List<String> selectedElements = csaCandidateRDPInstance.getAssessmentTypeField();
    //csaCandidateCreatedSuccessfully.selectAssessmentTypeField();
            /*assertEquals(selectedElements.contains(assessmentType),
                    "se_assessment_v1",
                    "Invalid Assessment Type Selected");
            assertTrue(selectedElements.contains(assessmentType),"Valid Assessment Type Selected");*/
    // System.out.println("Valid Assessment Type Selected");
        csaCandidateRDPInstance.setFirstnameField("TestFirstName1");
        csaCandidateRDPInstance.setLastnameField("TestLastName2");
        csaCandidateRDPInstance.setEmailField("monali.rajgor@crossover.com");
        csaCandidateRDPInstance.setOrderidField("orderid");
        csaCandidateRDPInstance.setCountryField("TR");
        csaCandidateRDPInstance.clickCreateCandidateButton();
    sleep(2000);
        System.out.println("Candidate Successfully Registered in the RWA Platform");
    sleep(7000);
        csaCandidateRDPInstance.clickCandidateEntryDashboard();
    sleep(3000);

        csaCandidateRDPInstance.clickRefreshButton();
    sleep(3000);

       try {

        TimeUnit.MINUTES.sleep(30);

    } catch (InterruptedException e) {

        //Handle exception

    }
        csaCandidateRecieveCrashCourseEmail.candidateReceivedCrashCourseEmail();
    sleep(3000);
        System.out.println("Candidate inbox opened");

        csaCandidateRecieveCrashCourseEmail.openFirstUnreadEmail();
    sleep(3000);
        System.out.println("Candidate has received Crash-Course email");
    }
}
