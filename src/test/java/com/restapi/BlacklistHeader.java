package com.restapi;

import io.restassured.config.LogConfig;

import java.util.HashSet;
import java.util.Set;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class BlacklistHeader {
     @org.testng.annotations.Test

    public void Hamcrest_Test(){

         Set<String> headers= new HashSet<String>();
         headers.add("X-Api-Key");
         headers.add("Accept");

          given().
                 baseUri("https://api.postman.com").
                 header("X-Api-Key", "PMAK-60ad72540f647700351cbf90-2a07dd60f449add41ace24ff8d5c1b5a0a").
                 config(config.logConfig(LogConfig.logConfig().blacklistHeaders(headers))).
                  log().all().

               when().
                 get("/workspaces").


                  then().
                 //log().all().
                 //log().ifError().
                log().ifValidationFails().
                 //log().body(). //only body

                      assertThat().
                       statusCode(201);
                         //extract().response().path("workspaces[0].name");



             //System.out.println(name);

            // assertThat( res, equalTo("My Workspace")); //from Hamcrest
         //Assert.assertEquals(name, "My Workspace"); //from TestNG
     }




}
