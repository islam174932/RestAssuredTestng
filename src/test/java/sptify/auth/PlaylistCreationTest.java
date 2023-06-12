package sptify.auth;

import api.BaseTest;
import api.playlistpost;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.RestAssured;

import org.junit.Before;
import org.junit.Test;
import pojo.Error;
import pojo.playlist;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;
import static io.restassured.specification.ProxySpecification.auth;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PlaylistCreationTest extends playlistpost {



    @Test
    public void shouldCreatePlaylist() {

        playlist requesrplaylist = new playlist();
        requesrplaylist.setName("the list after i created the pojo342");
        requesrplaylist.setDescription("the new list after we made the pojo class");
        requesrplaylist.set_public(false);

        Response response =  posting(requesrplaylist);
        assertThat(response.statusCode(),equalTo(201));
         response.as(playlist.class);



    }



    @Test
    public void GetPLayListID() {
        Response response =GetPlayList();
        assertThat(response.statusCode(),equalTo(200));


    }
}


