package com.restapi;

import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class LoggingTest {
     @org.testng.annotations.Test

    public void Hamcrest_Test(){

          given().
                 baseUri("https://api.postman.com").
                 header("X-Api-Key", "PMAK-60ad72540f647700351cbf90-2a07dd60f449add41ace24ff8d5c1b5a0a").
                 //log().all().
                  log().ifValidationFails().

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
