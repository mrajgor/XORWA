package e2e;

import Login.AdminLogin;
import com.crossover.xorwa.project.CSAAdminFilterCandidateDetails;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class XORWA1400 extends AdminLogin {
    private WebDriver driver;

    @Test
    public void XORWA1400() throws InterruptedException {
        csaAdminFilterCandidateDetails.clickFilterByCreationDate();
        sleep(3000);
        System.out.println("Creation Date Filter popup should open");

        /*csaAdminFilterCandidateDetails.getCreationDateFilter();
        sleep(5000);
        assertEquals(csaAdminFilterCandidateDetails.getCreationDateFilter(),
                "Creation Date Filter",
                "Creation Date Filter pop-up window Title does not verified ");
        System.out.println("Creation Date Filter pop-up window should be opened");*/

        csaAdminFilterCandidateDetails.clickStartDate();
        sleep(3000);
        csaAdminFilterCandidateDetails.setStartDate();
        sleep(3000);
        System.out.println("Enter the Start Date");

        csaAdminFilterCandidateDetails.clickEndDate();
        sleep(3000);
        csaAdminFilterCandidateDetails.setEndDate();
        sleep(3000);
        System.out.println("Enter the End Date");

        csaAdminFilterCandidateDetails.clickSaveButton();
        sleep(5000);
        System.out.println("Candidates list should be available if it registered on filter date");

        csaAdminFilterCandidateDetails.setCandidateName();
        sleep(5000);
        System.out.println("Registered candidates details should be able to filter by Candidate Name");

        csaAdminFilterCandidateDetails.clearCandidateName();
        sleep(3000);

        csaAdminFilterCandidateDetails.setCandidateEmail();
        sleep(5000);
        System.out.println("Registered candidates details should be able to filter by Candidate Email");

        csaAdminFilterCandidateDetails.clearCandidateEmail();
        sleep(3000);

        csaAdminFilterCandidateDetails.setTestId();
        sleep(5000);
        System.out.println("Registered candidates details should be able to filter by Test Id");

        csaAdminFilterCandidateDetails.clearTestId();
        sleep(3000);

        csaAdminFilterCandidateDetails.setAssessmentID();
        sleep(5000);
        System.out.println("Registered candidates details should be able to filter by Assessment ID");

        csaAdminFilterCandidateDetails.clearAssessmentID();
        sleep(3000);

        csaAdminFilterCandidateDetails.setSalesforceOrderId();
        sleep(5000);
        System.out.println("Registered candidates details should be able to filter by Salesforce Order ID");

        csaAdminFilterCandidateDetails.clearSalesforceOrderId();
        sleep(3000);

        csaAdminFilterCandidateDetails.clickFilterButton();
        sleep(5000);
        System.out.println("Status Filter popup should open on dashboard");

        csaAdminFilterCandidateDetails.clickFilterStatusDropdown();
        sleep(3000);
        System.out.println("Status Filter dropdown should be clicked");

        csaAdminFilterCandidateDetails.selectFilterValueDisable();
        sleep(5000);
        System.out.println("Status Filter Disable should be clicked");

        csaAdminFilterCandidateDetails.clickFilterStatusDropdown();
        sleep(3000);
        System.out.println("Status Filter dropdown should be clicked");

        csaAdminFilterCandidateDetails.selectFilterValueDeleted();
        sleep(3000);
        System.out.println("Status Filter Deleted should be clicked");

        csaAdminFilterCandidateDetails.clickFilterSaveButton();
        sleep(5000);
        System.out.println("Registered candidates details should be able to filter by Status i.e \"Provisioned\", \"Active\", \"Cloud_Watch_Active\", \"Disabled\" and \"Deleted\"");
    }
}
