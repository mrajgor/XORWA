package Login;

import base.BaseTests;
import com.crossover.xorwa.project.CSAAdminDashboard;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class AdminLogin extends BaseTests {

    @Test
    public void adminSuccessfullyLogin() throws InterruptedException {
<<<<<<< HEAD
        csaAdminLogin.setUsername("test");
        csaAdminLogin.setPassword("test@123");
=======
        csaAdminLogin.setUsername("mrajgor");
        csaAdminLogin.setPassword("DevFactoryB704$");
>>>>>>> Initial commit
        CSAAdminDashboard csaAdminDashboard = csaAdminLogin.clickLoginButton();
        sleep(2000);
            assertEquals(csaAdminDashboard.getAlertText(),
                    "RWA Dashboard",
                    "RWA platform title does not verified");
            System.out.println("RWA platform title is verified");
    }
}

