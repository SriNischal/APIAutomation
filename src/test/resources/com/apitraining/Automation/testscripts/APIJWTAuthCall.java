package com.apitraining.Automation.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIJWTAuthCall {

	public static void main(String[] args) {
		String url = "https://reqres.in/api";
		String parameter = "id";
		String value = "1";
		Response response = RestAssured.given().baseUri(url).header("Auth", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c").param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

}
