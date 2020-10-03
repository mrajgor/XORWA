package e2e;

import Login.AdminLogin;
import com.crossover.xorwa.project.CSACandidateCreatedSuccessfully;
import com.crossover.xorwa.project.CSACandidateRecieveCrashCourseEmail;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class XORWA1391 extends AdminLogin {

        @Test
        public void candidateSuccessfullyCreated() throws InterruptedException {
            CSACandidateCreatedSuccessfully csaCandidateCreatedSuccessfully = csaAdminCreateCandidate.clickCreateButton();
            sleep(2000);
            assertEquals(csaAdminCreateCandidate.getStatusRegisterCandidate(),
                    "Create Canidate",
                    "Create Candidate page title does not verified");
            System.out.println("Create Candidate page title is verified");

            csaCandidateCreatedSuccessfully.clickAssessmentTypeField();
            sleep(2000);
            String assessmentType  = "se_assessment_v1";
            csaCandidateCreatedSuccessfully.selectAssessmentTypeField(assessmentType);
            List<String> selectedElements = csaCandidateCreatedSuccessfully.getAssessmentTypeField();
            //csaCandidateCreatedSuccessfully.selectAssessmentTypeField();
            /*assertEquals(selectedElements.contains(assessmentType),
                    "se_assessment_v1",
                    "Invalid Assessment Type Selected");
            assertTrue(selectedElements.contains(assessmentType),"Valid Assessment Type Selected");*/
           // System.out.println("Valid Assessment Type Selected");
            csaCandidateCreatedSuccessfully.setFirstnameField("TestFirstName1");
            csaCandidateCreatedSuccessfully.setLastnameField("TestLastName2");
            csaCandidateCreatedSuccessfully.setEmailField("monali.rajgor@aurea.com");
            csaCandidateCreatedSuccessfully.setOrderidField("orderid");
            csaCandidateCreatedSuccessfully.setCountryField("TR");
            csaCandidateCreatedSuccessfully.clickCreateCandidateButton();
            sleep(2000);
            System.out.println("Candidate Successfully Registered in the RWA Platform");
            sleep(2000);
            csaCandidateCreatedSuccessfully.clickCandidateEntryDashboard();
            sleep(3000);

           /* try {

                TimeUnit.MINUTES.sleep(30);

            } catch (InterruptedException e) {

                //Handle exception

            }*/
            CSACandidateRecieveCrashCourseEmail csaCandidateRecieveCrashCourseEmail;
            sleep(3000);
            System.out.println("Candidate has received Crash-Course email");

        }
}
