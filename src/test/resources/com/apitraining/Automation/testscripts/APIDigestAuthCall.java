package com.apitraining.Automation.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIDigestAuthCall {

	public static void main(String[] args) {
		String url = "https://reqres.in/api";
		String username = "sr@example.com";
		String password = "Nischal";
		Response response = RestAssured.given().baseUri(url).auth().digest(username, password).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());

	}

}
