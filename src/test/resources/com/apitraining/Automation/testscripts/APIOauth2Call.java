package com.apitraining.Automation.testscripts;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIOauth2Call {

			public static void main(String[] args) {
				String url = "https://reqres.in/api";
				String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
				Response response = RestAssured.given().baseUri(url).auth().oauth2(token).when().get("/users").then().log().all().extract().response();
				System.out.println(response.getBody().asString());

			}

}
