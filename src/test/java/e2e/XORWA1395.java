package e2e;

import Login.AdminLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class XORWA1395 extends AdminLogin {
    private WebDriver driver;

    @Test
    public void XORWA1395() throws InterruptedException {
        csaAdminDashboardCountries.clickCountriesButton();
        System.out.println("The Admin user should navigate to the \"Region Mapping\" page ");
        sleep(2000);

        csaAdminDashboardCountries.clickMappingSetDropdown();
        sleep(2000);

        csaAdminDashboardCountries.mappingSetDropdownOption();
        System.out.println("Mapping Set should be selected");
        sleep(2000);

        csaAdminDashboardCountries.searchCountry();
        sleep(2000);
        assertEquals(csaAdminDashboardCountries.getCountrySearchResult(),
                "Czech Republic (Česká republika)",
                "Unable to search Country");
        System.out.println("Country search result is displayed on page");
        sleep(2000);

        csaAdminDashboardCountries.clickRegionDropdown();
        sleep(2000);

        csaAdminDashboardCountries.setRegion();
        System.out.println("It should auto-saved all mapping and candidate Amazon Workspace environment should provisioned in the region geographically close to the candidate in order to have better connectivity");
        sleep(5000);

        csaAdminDashboardCountries.navigateBackToDashboard();
        System.out.println("Admin user navigate back to the RWA Dashboard page");
        sleep(2000);
    }
}
