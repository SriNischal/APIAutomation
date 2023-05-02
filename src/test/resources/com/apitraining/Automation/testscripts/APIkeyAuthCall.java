package com.apitraining.Automation.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIkeyAuthCall {

	public static void main(String[] args) {
		String url = "https://reqres.in/api";
		String parameter = "id";
		String value = "1";
		String keyvalue = "API-Key : abcdef12345";
		Response response = RestAssured.given().baseUri(url).header("Authorization", keyvalue).param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

}
