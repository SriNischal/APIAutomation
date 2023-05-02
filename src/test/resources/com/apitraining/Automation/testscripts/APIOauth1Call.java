package com.apitraining.Automation.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIOauth1Call {

	public static void main(String[] args) {
		String url = "https://reqres.in/api";
		String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
		Response response = RestAssured.given().baseUri(url).auth()
				.oauth("ABC123DEF456GHI789", "secret123", token, "abcdefgh123456").when().get("/users").then().log()
				.all().extract().response();
		System.out.println(response.getBody().asString());
	}
}
