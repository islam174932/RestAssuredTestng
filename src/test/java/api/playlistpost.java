package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.playlist;

import static io.restassured.RestAssured.given;

public class playlistpost extends BaseTest {


      public Response posting (playlist requestplaylist){


                return given()
                        .spec(requestSpecification)
                        .body(requestplaylist)
                        .when()
                        .post("users/31g2xrhbi4spoell5laygqv2mk5q/playlists")
                        .then()
                        .spec(responseSpecification)
                        .contentType(ContentType.JSON).extract().response();



    }



    public Response GetPlayList (){


        return (Response) given()
                .spec(requestSpecification)
                .when()
                .get("/playlists/7AxVvo99twQvxA5x19jFxa")
                .then()
                .spec(responseSpecification)
                .extract().response();


    }
}
