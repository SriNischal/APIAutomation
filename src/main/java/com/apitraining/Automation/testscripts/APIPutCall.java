package com.apitraining.Automation.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIPutCall {

	public static void main(String[] args) {
		String url = "https://reqres.in/api";
		String payload_str = "{'name' : 'Suraj','job' : 'Senior Software Engineer'}";
		//String ContentType = "application/json";
		Response response = RestAssured.given().baseUri(url).body(payload_str.toString()).put("/users/1").then().log().all().extract().response();
		System.out.println(response);
	}

}
