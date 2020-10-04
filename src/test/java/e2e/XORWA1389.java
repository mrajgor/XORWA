package e2e;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class XORWA1389 {
    private String requestURL = "https://stage.csa-assessment.crossover.com/console/api/assessments/";
    private String bodyJSONRequest = "{\n" +
            "  \"test_id\": \"mqa_assessment_v1\",\n" +
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

        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        System.out.println(response.andReturn().getBody());

                assertEquals(200, response.getStatusCode());
    }
}
