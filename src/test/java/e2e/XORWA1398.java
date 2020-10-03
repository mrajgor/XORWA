package e2e;

import Login.AdminLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class XORWA1398 extends AdminLogin {
    private WebDriver driver;

    @Test
    public void XORWA1398() throws InterruptedException {
        csaec2UsageView.clickec2Button();
        sleep(2000);
        System.out.println("Admin user clicked on EC2 Usage button");

        /*csaec2UsageView.getEnvironmentUsagePage();
        sleep(5000);
        assertEquals(csaec2UsageView.getEnvironmentUsagePage(),
                "Environment Usage",
                "Environment Usage page Title does not verified ");
        System.out.println("The Admin user should navigate to the Environment Usage page");*/

        csaec2UsageView.filterEnvironmentByEmail();
        sleep(5000);
        System.out.println("The Admin user should get the candidate provisioned environment usage details \"Transition Date\", \"Candidate Name\", \"Email\", \"Assessment ID\", \"Status\" and \"Total Count of candidate environment\"");

    }
}
