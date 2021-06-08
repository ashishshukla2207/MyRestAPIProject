package com.restapi;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class LogConfig {
     @org.testng.annotations.Test

    public void Hamcrest_Test(){

          given().
                 baseUri("https://api.postman.com").
                 header("X-Api-Key", "PMAK-60ad72540f647700351cbf90-2a07dd60f449add41ace24ff8d5c1b5a0a").
                  config(config.logConfig(io.restassured.config.LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails())).


               when().
                 get("/workspaces").


                  then().
                 //log().all().
                 //log().ifError().
                //log().ifValidationFails().


                      assertThat().
                       statusCode(201);
                         //extract().response().path("workspaces[0].name");



             //System.out.println(name);

            // assertThat( res, equalTo("My Workspace")); //from Hamcrest
         //Assert.assertEquals(name, "My Workspace"); //from TestNG
     }




}
