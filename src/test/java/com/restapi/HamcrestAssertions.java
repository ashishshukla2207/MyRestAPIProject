package com.restapi;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HamcrestAssertions {
     @org.testng.annotations.Test

    public void Hamcrest_Test(){

         String name= given().
                 baseUri("https://api.postman.com").
                 header("X-Api-Key", "PMAK-60ad72540f647700351cbf90-2a07dd60f449add41ace24ff8d5c1b5a0a").
                 log().all().
               when().
                 get("/workspaces").

                 then().
                 log().all().
                 log().ifError().
                 log().body(). //only body
                 assertThat().statusCode(200).extract().response().path("workspaces[0].name");



             System.out.println(name);

            // assertThat( res, equalTo("My Workspace")); //from Hamcrest
         Assert.assertEquals(name, "My Workspace"); //from TestNG
     }




}
