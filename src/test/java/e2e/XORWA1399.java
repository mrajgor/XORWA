package e2e;

import Login.AdminLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class XORWA1399 extends AdminLogin {
    private WebDriver driver;

    @Test
    public void XORWA() throws InterruptedException {
        csaAdminDashboardShowDuplicateEmails.clickDuplicateEmailsIcon();
        Thread.sleep(5000);
        System.out.println("By clicking on the Show duplicate emails only list of registered candidates should displayed in the Real Work Assessment dashboard those Amazon Workspace Environment provisioned multiple times using the same email address");
    }

}
