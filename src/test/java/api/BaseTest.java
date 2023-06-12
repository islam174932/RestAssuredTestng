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
    protected String accessToken = "BQCyEKQtQQEevbf6M00jm5h3uGRcbbk-UaT-qjOvEV894YyOAdFz5VfvJ87wILp2uZBcsUME6bf9uTfXD8zbEYANwuVLJyF0k3q2WpeDzsmPqmTR70tf09sq_-sfaVs8_bwADngSVh-yzdrM0LKD9_hf6OvPCCaIduWiYhcGIPcWJifFc4jVG1zpoXWIEpXhbE4Yvty-zgvoKkD9hH8qZg1MD7NAybROjuS-81cLnDkCGXOcfOUQTIle0F57jGw4Bmejww_fqZ8IA401";

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
