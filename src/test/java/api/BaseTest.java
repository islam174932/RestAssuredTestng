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
    protected String accessToken = "BQCcI6B-7nRvMdY-JXmebPepQJ8HyfZ5foeTjyM2BYZ5gshNH_3_5n7fTfkOLVsb4rSAQuFgi2krR3ZTmK3l49MthRuEsvnNrg8tSRrXqzc2gCZFSS2yB_edHCxMg44KAxVIvRRaPRn0lKeTcLYRsvsZIIMT0t8TC5QSJPYHallZiIIRDSibmuN6gk1iW_MrsolsBnOeKdgZQHCtLUKa8BWv3zeMIYynx6xaeZv1WXhC4HB5IaoUvXKWHxq9Qvnq6t5K2U25srAfCsIy";

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
