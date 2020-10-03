package e2e;

import Login.AdminLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;

public class XORWA1401 extends AdminLogin {
    private WebDriver driver;

    @Test
    public void XORWA1401() throws InterruptedException {

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


        csaAdminDashboardPagingandSorting.sortByCreationDate();
        sleep(3000);
        System.out.println("The Admin user should able to sort candidate list by Creation Date");

        csaAdminDashboardPagingandSorting.sortByCandidateName();
        sleep(3000);
        System.out.println("The Admin user should able to sort candidate list by Candidate Name");

        csaAdminDashboardPagingandSorting.sortByCandidateEmail();
        sleep(3000);
        System.out.println("The Admin user should able to sort candidate list by Candidate Email");

        csaAdminDashboardPagingandSorting.sortByTestID();
        sleep(3000);
        System.out.println("The Admin user should able to sort candidate list by Test Id");

        csaAdminDashboardPagingandSorting.sortByAssessmentID();
        sleep(3000);
        System.out.println("The Admin user should able to sort candidate list by Assessment Id");

        csaAdminDashboardPagingandSorting.sortBySalesforceOrderID();
        sleep(3000);
        System.out.println("The Admin user should able to sort candidate list by Salesforce Order Id");

        csaAdminDashboardPagingandSorting.sortByStatus();
        sleep(5000);
        System.out.println("The Admin user should able to sort candidate list by Status");

        csaAdminDashboardPagingandSorting.sortByNextPage();
        sleep(5000);
        System.out.println("The Admin user should be get and view the list of registered candidates by changing Next Page");

        csaAdminDashboardPagingandSorting.sortByLastPage();
        sleep(5000);
        System.out.println("The Admin user should be get and view the list of registered candidates by changing Last page");

        csaAdminDashboardPagingandSorting.sortByPreviousPage();
        sleep(5000);
        System.out.println("The Admin user should be get and view the list of registered candidates by changing Previous Page");

        csaAdminDashboardPagingandSorting.sortByFirstPage();
        sleep(5000);
        System.out.println("The Admin user should be get and view the list of registered candidates by changing First Page");

        csaAdminDashboardPagingandSorting.displayPaging10();
        sleep(5000);
        System.out.println("The Admin user should be get and view the list of first 10 registered candidates");

        csaAdminDashboardPagingandSorting.displayPaging25();
        sleep(5000);
        System.out.println("The Admin user should be get and view the list of first 25 registered candidates");

        csaAdminDashboardPagingandSorting.displayPaging30();
        sleep(5000);
        System.out.println("The Admin user should be get and view the list of first 30 registered candidates");

        csaAdminDashboardPagingandSorting.displayPaging50();
        sleep(5000);
        System.out.println("The Admin user should be get and view the list of first 50 registered candidates");
    }
}
