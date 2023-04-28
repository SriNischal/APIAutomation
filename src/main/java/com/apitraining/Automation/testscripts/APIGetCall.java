package com.apitraining.Automation.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIGetCall {
	public static void main(String[] args) {
	
	String url = "https://reqres.in/api";
	String parameter = "id";
	String value = "1";
	Response response = RestAssured.given().baseUri(url).param(parameter, value).when().get("/users").then().log().all().extract().response();
	System.out.println(response.getBody().asString());
}
}
