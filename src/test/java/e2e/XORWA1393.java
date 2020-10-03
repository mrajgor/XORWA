package e2e;

import Login.AdminLogin;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class XORWA1393 extends AdminLogin {

    @Test
    public void BulkDelete() throws InterruptedException {

        bulkDeleteCandidateEntries.setCheckedCheckbox();
        System.out.println("All Checkbox checked");
        sleep(2000);

        bulkDeleteCandidateEntries.clickBulkDeleteButton();
        sleep(2000);
        System.out.println("Delete Confirmation popup window opened");

        assertEquals(bulkDeleteCandidateEntries.BulkDeleteConfirmationWindow(),
                "Confirm Deletion",
                "Confirm Deletion Title not verified");
        sleep(5000);

        bulkDeleteCandidateEntries.clickConfirmButton();
        System.out.println("The admin user able to delete registered candidates in bulk from the Real Work Assessment Platform");
        sleep(7000);

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
                "Candidates EC2 instances does not deleted");
        System.out.println("Candidates EC2 instances are Deleted successfully");
    }

}
