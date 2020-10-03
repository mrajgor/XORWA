package Login;

import base.BaseTests;
import com.crossover.xorwa.project.CSAAdminDashboard;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class AdminLogin extends BaseTests {

    @Test
    public void adminSuccessfullyLogin() throws InterruptedException {
        csaAdminLogin.setUsername("mrajgor");
        csaAdminLogin.setPassword("Devfactory$704");
        CSAAdminDashboard csaAdminDashboard = csaAdminLogin.clickLoginButton();
        sleep(2000);
            assertEquals(csaAdminDashboard.getAlertText(),
                    "RWA Dashboard",
                    "RWA platform title does not verified");
            System.out.println("RWA platform title is verified");
    }
}

