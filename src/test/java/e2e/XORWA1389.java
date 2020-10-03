package e2e;

<<<<<<< HEAD
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

=======
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
>>>>>>> Initial commit

public class XORWA1389 {
    private String requestURL = "https://stage.csa-assessment.crossover.com/console/api/assessments/";
    private String bodyJSONRequest = "{\n" +
            "  \"test_id\": \"mqa_assessment_v1\",\n" +
<<<<<<< HEAD
            "  \"order_id\": \"mqa_OCT03_2020\",\n" +
            "  \"callback_url\": \"https://xo.secure.force.com/services/apexrest/assessments/v1/mqa_assessment_v1/mqa_Aug31_1748\",\n" +
            "  \"candidate\": \n" +
            "  { \n" +
            "    \"first_name\": \"test\",\n" +
            "    \"last_name\": \"name\",\n" +
            "    \"email\": \"test@gmail.com\",\n" +
            "    \"country\": \"us\"\n" +
            "  }\n" +
            "  }";

   /* @BeforeClass
    public static void createRequestAPI(){
    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri("https://stage.csa-assessment.crossover.com/console/api/").build();

    }*/

    @Test
    public void setRequestSpecification(){
        System.out.println(bodyJSONRequest);
        Response response =
                given()
                    .auth()
                    .preemptive()
                    .basic("test", "test")
                    .header("Accept", ContentType.JSON.getAcceptHeader())
                    .contentType(ContentType.JSON).
                when()
                    .body(bodyJSONRequest)
                    .post(requestURL).
                then()
                    .extract().response();
=======
            "  \"order_id\": \"MQARWA15\",\n" +
            "  \"callback_url\": \"https://xo.secure.force.com/services/apexrest/assessments/v1/mqa_assessment_v1/mqarwa15\",\n" +
            "  \"candidate\":\n" +
            "  {\n" +
            "    \"first_name\": \"Monali\",\n" +
            "    \"last_name\": \"Rajgor\",\n" +
            "    \"email\": \"monali.rajgor@crossover.com\",\n" +
            "    \"country\": \"IN\"\n" +
            "  }\n" +
            "}";

    /*@BeforeClass
     public static void createRequestAPI(){
     RequestSpecification requestSpecification = new RequestSpecBuilder()
             .setBaseUri("https://stage.csa-assessment.crossover.com/console/api/").build();
     }*/

    @Test(priority = 1)
    public void setRequestSpecification() throws InterruptedException {
        System.out.println(bodyJSONRequest);
        Response response =
                given()
                        .auth()
                        .preemptive()
                        .basic("crossover", "re@lworkcro$$over20")
                        .header("Accept", ContentType.JSON.getAcceptHeader())
                        .contentType(ContentType.JSON).
                        when()
                        .body(bodyJSONRequest)
                        .post(requestURL).
                        then()
                        .extract().response();
>>>>>>> Initial commit

        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        System.out.println(response.andReturn().getBody());
<<<<<<< HEAD

                assertEquals(200, response.getStatusCode());
    }
}
=======
        assertEquals(200, response.getStatusCode());
    }

    @Test(priority = 2)
    public void openRWAPlatform() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://stage.csa-assessment.crossover.com/admin/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.name("login")).sendKeys("mrajgor");
        driver.findElement(By.name("password")).sendKeys("DevfactoryB704$");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/form/div[3]/button")).click();
        Thread.sleep(5000);
        System.out.println("The Admin user should successfully logged into the Real Work Assessment Platform and Dashboard screen should open");
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/table/tbody[2]/tr[1]")).click();
        System.out.println("The Salesforce API successfully register Candidate in the Real Work Platform");
        Thread.sleep(10000);
        driver.quit();
    }
}

>>>>>>> Initial commit
