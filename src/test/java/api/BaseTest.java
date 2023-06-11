package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Before;

public class BaseTest {

    protected RequestSpecification requestSpecification;
    protected ResponseSpecification responseSpecification;
    protected String accessToken = "BQATD_7tGNm70UInr141BtvpiUUcwgfKyZ1XXYEBWZLOadi9yU_YZUenc3ufUBLn6ko7rAsZyGO4ad8v_utPMST-jzd9ce5KR0A2IfiDvAXESFoTpNZGR9LDa0moo50yOd1NXofDwPRqlgY_pO67oY2SOftU3Nk-HUCG5vUP95EYipb8He04s7FtIcqX414mXHqbIFRT6II7tQ4oncUVydeWNLmHu9j3sKI5VzDsGIhXeZKOdufWOdmumpG2tlIiT3xDPKjR9gBs7gx3";

    @Before
    public void setup() {


        RestAssured.baseURI = "https://api.spotify.com";
        RestAssured.basePath = "/v1";

        requestSpecification = new RequestSpecBuilder()


            .addHeader("Authorization", "Bearer " + accessToken)
                .setContentType("application/json;charset=utf-8")
                .log(LogDetail.ALL)
                .build();

        responseSpecification = new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }

}
